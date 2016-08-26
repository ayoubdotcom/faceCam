package controller;

import static com.googlecode.javacv.cpp.opencv_core.IplImage;
import detection.FaceDetection;
import entity.Funcionario;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import recog.FaceRecognizer;

public class RecognizerController {
    
    private final static FaceRecognizer recognizer = FaceRecognizer.getInstance();
    
    private static final FaceDetection  DETECTION = new FaceDetection();

    public Serializable recognize(Object foto){
        return recognizer.recognize(foto);
    }
    
    public Object getBiggestFace(Object foto){
        return DETECTION.detectFace((IplImage) foto);
    }
    
    public void learn(Serializable entity){
        recognizer.learnFace(((Funcionario) entity).getId());
    }
    
    public BufferedImage highLightFace(Object foto){
        return DETECTION.highLightFace((IplImage)foto);
    }
    
}