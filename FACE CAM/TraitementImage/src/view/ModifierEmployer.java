package view;

import controller.FuncionarioController;
import entity.Funcionario;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JOptionPane;
import model.CaptionUtils;

public class ModifierEmployer extends javax.swing.JDialog {

    public ModifierEmployer(Window owner, ModalityType modalityType) {
        super(owner, modalityType);
        setLocationRelativeTo(owner);
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
        jtNome = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jlRg2 = new javax.swing.JLabel();
        jtMatricula = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jtCpf = new javax.swing.JFormattedTextField();
        jtPis = new javax.swing.JFormattedTextField();
        jtRg = new javax.swing.JFormattedTextField();
        jlRg1 = new javax.swing.JLabel();
        jtTel = new javax.swing.JFormattedTextField();
        jlCpf = new javax.swing.JLabel();
        jlRg = new javax.swing.JLabel();
        jlCpf1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
setUndecorated(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(IconUtils.getIcons());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Modifier Employé"));

        jtNome.setFont(new java.awt.Font("Tahoma", 0, 18));
        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jlNome.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jlNome.setText("Nom");

        jlRg2.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jlRg2.setText("ID");

        jtMatricula.setEditable(false);
        jtMatricula.setFont(new java.awt.Font("Tahoma", 0, 18)); 

        jbCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menubtn.png"))); 
        jbCadastrar.setText("Enregistrer");
        jbCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menubtn.png"))); 
        jbExcluir.setText("Effacer");
        jbExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        
        jtCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); 

        try {
            jtPis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########### ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtPis.setFont(new java.awt.Font("Tahoma", 0, 18));

        jtRg.setFont(new java.awt.Font("Tahoma", 0, 18)); 

        jlRg1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jlRg1.setText("Telephone:");

        try {
            jtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###) ### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtTel.setFont(new java.awt.Font("Tahoma", 0, 18)); 

        jlCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jlCpf.setText("Prenom");

        jlRg.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jlRg.setText("Email:");

        jlCpf1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jlCpf1.setText("N° Employé:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCpf)
                            .addComponent(jlNome)
                            .addComponent(jlRg2)
                            .addComponent(jlRg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtRg, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(jtCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCpf1)
                                    .addComponent(jlRg1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtTel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPis, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlRg2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCpf1)
                            .addComponent(jtPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlRg1)
                            .addComponent(jtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jlNome)
                        .addGap(18, 18, 18)
                        .addComponent(jlCpf)
                        .addGap(18, 18, 18)
                        .addComponent(jlRg)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbExcluir))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 18));
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quitter.png"))); 
        jbCancelar.setBorderPainted(false);
        jbCancelar.setContentAreaFilled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modifier employé");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }                        

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        funcionarioController.delete();
        JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso");
        limpar();
        setVisible(false);
    }                                         

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                            

        String nome = jtNome.getText();
        String cpf = jtCpf.getText();
        String rg = jtRg.getText();
        String pis = jtPis.getText();
        String telefone = jtTel.getText();

        funcionario.setNome(nome);
        funcionario.setTelefone(telefone);
        funcionario.setIdentidade(rg);
        funcionario.setCpf(cpf);
        funcionario.setPis(pis);

        funcionarioController.update();
        funcionarioController.flush();

        JOptionPane.showMessageDialog(null, "Alterado Realizado");

        limpar();
    }                                           

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setVisible(false);
    }                                          

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }                                      

    private FuncionarioController funcionarioController = new FuncionarioController();
    private Funcionario funcionario;
    
    private void limpar(){
        jtTel.setText("");
        jtCpf.setText("");
        jtNome.setText("");
        jtPis.setText("");
        jtRg.setText("");
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
        funcionarioController.setFuncionario(funcionario);
        jtCpf.setText(funcionario.getCpf());
        jtMatricula.setText(funcionario.getId().toString());
        jtNome.setText(funcionario.getNome());
        jtPis.setText(funcionario.getPis());
        jtRg.setText(funcionario.getIdentidade());
        jtTel.setText(funcionario.getTelefone());
    }
                   
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlCpf1;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlRg;
    private javax.swing.JLabel jlRg1;
    private javax.swing.JLabel jlRg2;
    private javax.swing.JFormattedTextField jtCpf;
    private javax.swing.JTextField jtMatricula;
    private javax.swing.JTextField jtNome;
    private javax.swing.JFormattedTextField jtPis;
    private javax.swing.JFormattedTextField jtRg;
    private javax.swing.JFormattedTextField jtTel;                 
    private static CaptionUtils CAPTIONS;

}
