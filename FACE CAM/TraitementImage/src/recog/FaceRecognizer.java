package recog;

import com.googlecode.javacv.cpp.opencv_contrib;
import static com.googlecode.javacv.cpp.opencv_contrib.createLBPHFaceRecognizer;
import com.googlecode.javacv.cpp.opencv_core.*;
import static com.googlecode.javacv.cpp.opencv_highgui.CV_LOAD_IMAGE_GRAYSCALE;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;
import entity.Foto;
import entity.Funcionario;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import model.EntityManager;

public class FaceRecognizer implements IRecognizer{

    public FaceRecognizer() {
        recarregar();
    }
    
    private EntityManager entityManager = EntityManager.INSTANCE;
    
    public static FaceRecognizer getInstance(){
        if(INSTANCE == null){
            synchronized(FaceRecognizer.class){
                if(INSTANCE == null){
                    INSTANCE = new FaceRecognizer();
                }
            }
        }
        return INSTANCE;
    }
    
    private static boolean READY                            = false;
    private static volatile        FaceRecognizer INSTANCE;    
    private static final double    TRESHOLD                 = 51;      
    private static final double    DISTANCIA_MINIMA         = 50;    
    private static final String    DADOS                    = new java.io.File("").getAbsolutePath() + "\\FACE_RECOGNIZER.yml";
    
    private static final opencv_contrib.FaceRecognizer FACE_RECOGNIZER
                                    = createLBPHFaceRecognizer(1, 8, 8, 8, TRESHOLD);  

    @Override
    public void learnFace(Serializable id) {
        List<Foto> faces = entityManager.getByParameter(Foto.class, "funcionario", id);
        
        MatVector trainImages = new MatVector(faces.size());        
        int[] trainLabels = new int[faces.size()];
        
        int count = 0;
        for (Foto face : faces){
            IplImage image = cvLoadImage(face.getPath(), CV_LOAD_IMAGE_GRAYSCALE);
            trainImages.put(count, image);
            trainLabels[count] = (Integer)id;
            count++;
        }
        
        FACE_RECOGNIZER.update(trainImages, trainLabels);
        
        salvarEstado();
    }

    @Override
    public Serializable recognize(Object foto) {
        if (foto == null || !READY) return null;
        
        int[] id = new int[1];
        double[] distance = new double[1];
        try {
            FACE_RECOGNIZER.predict((IplImage) foto, id, distance);
        } catch (Exception e) {
        }
        if (id[0] > -1 && distance[0] <= DISTANCIA_MINIMA){
            return entityManager.getById(Funcionario.class, id[0]);
        }
        return null;
    }

    private void carregarDados() {
        File binaryDataFile = new File(DADOS);
        if (binaryDataFile.exists()) {
            FACE_RECOGNIZER.load(DADOS);
        }
    }

    private void salvarEstado() {
        File binaryDataFile = new File(DADOS);
        if (binaryDataFile.exists()) {
            binaryDataFile.delete();
            READY = true;
        }
        FACE_RECOGNIZER.save(DADOS);
    }
    
    private void recarregar(){
        List<Funcionario> funcionarios = entityManager.getAll(Funcionario.class);
        for(Funcionario funcionario : funcionarios){
            learnFace(funcionario.getId());
        }
        salvarEstado();
    }

}