package view;

import com.googlecode.javacv.cpp.opencv_core.IplImage;
import com.gtranslate.Audio;
import com.gtranslate.Language;
import controller.RecognizerController;
import controller.RegistroController;
import controller.WebCamController;
import detection.FaceDetection;
import entity.Funcionario;
import entity.Registro;
import java.awt.Dialog;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.UIManager;
import model.CaptionUtils;


public class Recognizer extends JFrame {

    public Recognizer() throws Exception {
        initComponents();
        this.setVisible(true);
       
        initWebCam();
        centralizar();        
    }
    
    public void centralizar() throws HeadlessException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int x = (int) toolkit.getScreenSize().getWidth() / 2 - getWidth() / 2;
        int y = (int) toolkit.getScreenSize().getHeight()/ 2 - getHeight() / 2;
        setLocation(x, y);
       // this.setUndecorated(true);
    }

    @SuppressWarnings("unchecked")
                          
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        outputPanel = new BackgroudedPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setIconImages(IconUtils.getIcons());
        setMinimumSize(new java.awt.Dimension(747, 343));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                focusGained(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                onClosing(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        outputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        outputPanel.setPreferredSize(new java.awt.Dimension(320, 220));

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 153)));

        jMenu1.setText("Fichier");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(IconUtils.getIcon("off"));
        jMenuItem1.setText("Fermer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Employés");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(IconUtils.getIcon("cadastro"));
        jMenuItem2.setText("Ajouter");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(IconUtils.getIcon("funcionarios"));
        jMenuItem3.setText("Liste");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Historiques");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(IconUtils.getIcon("registros"));
        jMenuItem4.setText("Liste");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(408, 408, 408))
            .addGroup(layout.createSequentialGroup()
                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }                        

    public void onClosing(java.awt.event.WindowEvent evt) {                           
        exit();
    }                          

    public void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        webCamController.stopWebCam();
       new  EnregistrerEmployer().setVisible(true);
    }                                          

    public void focusGained(java.awt.event.WindowEvent evt) {                             
        if (!webCamController.isRunning()) {
            initWebCam();
        }
    }                            

    public void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(webCamController.isRunning()){
            webCamController.stopWebCam();
        }
        if(listeHistorique == null){
            listeHistorique = new ListeHistoriques(this, Dialog.ModalityType.MODELESS);
        }
        listeHistorique.setVisible(true);
    }                                          

    public void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (webCamController.isRunning()) {
            webCamController.stopWebCam();
        }
        if(listeEmployes == null){
            listeEmployes = new ListeEmployes(this, Dialog.ModalityType.MODELESS);
        }
        listeEmployes.setVisible(true);
    }                                          

    public void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        exit();
    }                                          

    public void updateImagePanel(BufferedImage image, JPanel panel) {
        ((BackgroudedPanel) panel).updateBackground(image);
    }

    public void initWebCam() {
        webCamController.initWebCam(realTime);
    }
    
    public void exit(){
        webCamController.shutDownWebCam();
        System.exit(0);
    }

    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recognizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recognizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recognizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recognizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Recognizer();
                } catch (Exception ex) {
                    Logger.getLogger(Recognizer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public WebCamController webCamController = new WebCamController();
    public RecognizerController recognizerController = new RecognizerController();
    public RegistroController historiqueController = new RegistroController();
    public EnregistrerEmployer cadastraFuncionario = new EnregistrerEmployer();
    public ListeEmployes listeEmployes;
    public ListeHistoriques listeHistorique;
    public Date lastRecognized = new Date();
    public Funcionario employe;
    public Registro historique;
    
    public Runnable playSound = new Runnable() {
        @Override
        public void run() {
            Audio audio = Audio.getInstance();
            InputStream sound;
            try {
                sound = audio.getAudio(historique.getTipo()
                        + employe.getNome(), Language.FRENCH);
                audio.play(sound);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    };
     String Nom="Inconu";
    public Runnable realTime = new Runnable() {
        @Override
        public void run() {
            if(verifyTime())return;
            recognize();
            if (employe != null) {
                
                Registro ultimoRegistro = historiqueController.getLast(employe);
                Registro.TipoRegistro tipo = ultimoRegistro != null ? ultimoRegistro.getTipo().getNext() : Registro.TipoRegistro.ENTREE;
                historique = new Registro(employe, new Date(), tipo);
                historiqueController.save(historique);
                recognize2();
                updateView();
            }
        }

        public boolean verifyTime() {
            if (lastRecognized.getTime() > new Date().getTime() - 5000) {
                return true;
            }
            return false;
        }

        public void recognize() {
            Object face = recognizerController.getBiggestFace(
                    webCamController.getSelectedImage());
            employe = (Funcionario) recognizerController.recognize(face);
            BufferedImage image = recognizerController.highLightFace(
                    webCamController.getSelectedImage());
//            detection.FaceDetection f=new FaceDetection();
//            IplImage  face2=IplImage.createFrom(image);
//         //   Comprovante.mostrarRegistro(historique);
//           
//           
//                
//          face2= f.putName(IplImage.createFrom(image),employe.getNome());
            updateImagePanel(image, outputPanel);
        }
        
          public void recognize2() {
            Object face = recognizerController.getBiggestFace(
                    webCamController.getSelectedImage());
            employe = (Funcionario) recognizerController.recognize(face);
            BufferedImage image = recognizerController.highLightFace(
                    webCamController.getSelectedImage());
            detection.FaceDetection f=new FaceDetection();
            //IplImage  face2=IplImage.createFrom(image);
         //   Comprovante.mostrarRegistro(historique);
           
           
                
      IplImage     face2= f.putName(IplImage.createFrom(image),(employe.getNome() + " "+employe.getCpf()));
            updateImagePanel(face2.getBufferedImage(), outputPanel);
            
        }

        public void updateView() {
            lastRecognized = new Date();
            
            //Thread thread = new Thread(playSound);
            //thread.start();
            
           //Comprovante.mostrarRegistro(historique);
            
            
        }
    };

    // Variables declaration - do not modify                     
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu3;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JMenuItem jMenuItem3;
    public javax.swing.JMenuItem jMenuItem4;
    public javax.swing.JToolBar jToolBar1;
    public javax.swing.JPanel outputContainer;
    public javax.swing.JPanel outputPanel;                
    public static CaptionUtils CAPTIONS;
}