package view;

import controller.FuncionarioController;
import controller.RecognizerController;
import controller.WebCamController;
import entity.Funcionario;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class EnregistrerEmployer extends javax.swing.JDialog {

    public EnregistrerEmployer() {
       
        initComponents();
        centralizar();
    }
    
    private void centralizar() throws HeadlessException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int x = (int) toolkit.getScreenSize().getWidth() / 2 - getWidth() / 2;
        int y = (int) toolkit.getScreenSize().getHeight()/ 2 - getHeight() / 2;
        setLocation(x, y);
    }
    
    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlRg = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlCpf1 = new javax.swing.JLabel();
        jlRg1 = new javax.swing.JLabel();
        lbNumeroFotos = new javax.swing.JLabel();
        numeroFotos = new javax.swing.JLabel();
        jbAdicionarFoto = new javax.swing.JButton();
        outputPanel = new BackgroudedPanel();
        jbLigarWebCam = new javax.swing.JButton();
        jtTel = new javax.swing.JFormattedTextField();
        jtCpf = new javax.swing.JFormattedTextField();
        jtPis = new javax.swing.JFormattedTextField();
        jtRg = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
setUndecorated(true);
        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jlNome.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jlNome.setText("Nom");

        jlCpf.setFont(new java.awt.Font("Tahoma", 0, 18));
        jlCpf.setText("Prenom");

        jtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jtNome.setForeground(new java.awt.Color(0, 102, 102));

        jlRg.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jlRg.setText("E-mail");

        jbCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menubtn.png"))); 
        jbCadastrar.setText("Enregistrer");
        jbCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCadastrar.setOpaque(false);
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menubtn.png"))); 
        jbCancelar.setText("Quitter");
        jbCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCancelar.setOpaque(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlCpf1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jlCpf1.setText("N° Employé:");

        jlRg1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jlRg1.setText("Telephone:");

        lbNumeroFotos.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        lbNumeroFotos.setText("Numero de Photo:");

        numeroFotos.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        numeroFotos.setText("0");

        jbAdicionarFoto.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jbAdicionarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menubtn.png"))); 
        jbAdicionarFoto.setText("Prendre une photo");
        jbAdicionarFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAdicionarFoto.setOpaque(false);
        jbAdicionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarFotoActionPerformed(evt);
            }
        });

        outputPanel.setBackground(new java.awt.Color(255, 255, 255));
        outputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), new java.awt.Color(255, 153, 51)));
        outputPanel.setPreferredSize(new java.awt.Dimension(320, 240));

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        jbLigarWebCam.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jbLigarWebCam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menubtn.png"))); 
        jbLigarWebCam.setText("Afficher WebCam");
        jbLigarWebCam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbLigarWebCam.setOpaque(false);
        jbLigarWebCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLigarWebCamActionPerformed(evt);
            }
        });

        jtTel.setForeground(new java.awt.Color(0, 102, 102));
        try {
            jtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtTel.setFont(new java.awt.Font("Tahoma", 0, 18)); 

        jtCpf.setForeground(new java.awt.Color(0, 102, 102));
        jtCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); 

        jtPis.setForeground(new java.awt.Color(0, 102, 102));
        try {
            jtPis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtPis.setFont(new java.awt.Font("Tahoma", 0, 18)); 

        jtRg.setDocument(new PlainDocument() {
           
            private int maxChars = 15;

            @Override
            public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException {
                if(str != null && (getLength() + str.length() < maxChars)){
                    super.insertString(offs, str, a);
                }
            }
        });
        jtRg.setColumns(15);
        jtRg.setForeground(new java.awt.Color(0, 102, 102));
        jtRg.setFont(new java.awt.Font("Tahoma", 0, 18)); 

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbNumeroFotos)
                                        .addGap(18, 18, 18)
                                        .addComponent(numeroFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(111, 111, 111))
                                    .addComponent(jbLigarWebCam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbAdicionarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNome)
                            .addComponent(jlCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlRg))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtCpf)
                                    .addComponent(jtRg, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlRg1)
                                    .addComponent(jlCpf1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtPis)
                                    .addComponent(jtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlRg)
                        .addComponent(jtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCpf1)
                            .addComponent(jtPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCpf))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlRg1)
                            .addComponent(jtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNumeroFotos)
                            .addComponent(numeroFotos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbLigarWebCam)
                        .addGap(18, 18, 18)
                        .addComponent(jbAdicionarFoto)
                        .addGap(18, 18, 18)
                        .addComponent(jbCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelar))
                    .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajouter un nouveau employé");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); 
        jLabel2.setText("CopyRight MBMDA ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }                       

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                            
 
        String nome = jtNome.getText();
        String cpf = jtCpf.getText();
        String rg = jtRg.getText();
        String pis = jtPis.getText();
        String telefone = jtTel.getText();
        
        Funcionario funcionario = funcionarioController.getFuncionario();
        funcionario.setNome(nome);
        funcionario.setTelefone(telefone);
        funcionario.setIdentidade(rg);
        funcionario.setCpf(cpf);
        funcionario.setPis(pis);        
        
        if(funcionarioController.save()){
            JOptionPane.showMessageDialog(rootPane, "Employé enregistré");
        } else {
            JOptionPane.showMessageDialog(rootPane, "erreur de saisie");
        }
        recognizerController.learn(funcionario);
        funcionarioController.flush();
        
        pararWebCam();
        numeroFotos.setText("0");
        limpar();
    }                                           

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        pararWebCam();
        numeroFotos.setText("0");
        setVisible(false);
    }                                          

    private void jbLigarWebCamActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(!webCamController.isRunning()){
            webCamController.initWebCam(normalCapture);
        }
    }                                             

    private void jbAdicionarFotoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if (webCamController.isRunning()) {
            Object rosto = recognizerController.getBiggestFace(webCamController.getSelectedImage());
            if (rosto != null) {
                if(funcionarioController.getFotos().isEmpty()){
                    funcionarioController.setFotoPrincipal(webCamController.getSelectedImage());
                }
                funcionarioController.addFoto(rosto);
                numeroFotos.setText("" + funcionarioController.getFotos().size());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debut WebCam");
        }
    }                                               

    private void pararWebCam(){
         if(webCamController.isRunning()){
            webCamController.stopWebCam();
        }
    }
    
    private void limpar(){
        jtTel.setText("");
        jtCpf.setText("");
        jtNome.setText("");
        jtPis.setText("");
        jtRg.setText("");
    }
    
    private void updateImagePanel(BufferedImage image, JPanel panel) {
        ((BackgroudedPanel) panel).updateBackground(image);
    }
    
    private WebCamController        webCamController      = WebCamController.getDefaultInstance();
    private FuncionarioController   funcionarioController = new FuncionarioController();
    private RecognizerController    recognizerController  = new RecognizerController();
    
    private Runnable normalCapture = new Runnable() {
                @Override
                public void run() {
                    updateImagePanel(webCamController.getBufferedImage(), outputPanel);
                }
            };
                            
    private javax.swing.JPanel FooterjPanel;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbAdicionarFoto;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbLigarWebCam;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlCpf1;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlRg;
    private javax.swing.JLabel jlRg1;
    private javax.swing.JFormattedTextField jtCpf;
    private javax.swing.JTextField jtNome;
    private javax.swing.JFormattedTextField jtPis;
    private javax.swing.JFormattedTextField jtRg;
    private javax.swing.JFormattedTextField jtTel;
    private javax.swing.JLabel lbNumeroFotos;
    private javax.swing.JLabel numeroFotos;
    private javax.swing.JPanel outputPanel;                 
}
