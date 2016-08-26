package view;

import controller.FuncionarioController;
import entity.Funcionario;
import java.awt.Dialog;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.CaptionUtils;

public class ListeEmployes extends javax.swing.JDialog {

    public ListeEmployes(Window owner, ModalityType modalityType) {
        super(owner, modalityType);
        setLocationRelativeTo(owner);
        initComponents();
        preencherTabela();
        menuFuncionario.setFocusable(false);
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

        menuFuncionario = new javax.swing.JPopupMenu();
        menuExcluirFuncionario = new javax.swing.JMenuItem();
        alterarFuncionario = new javax.swing.JMenuItem();
        verRegistros = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
//setUndecorated(true);
        menuExcluirFuncionario.setText("Excluir Funcionario");
        menuExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirFuncionarioActionPerformed(evt);
            }
        });
        menuFuncionario.add(menuExcluirFuncionario);

        alterarFuncionario.setText("Alterar Funcionario");
        alterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFuncionarioActionPerformed(evt);
            }
        });
        menuFuncionario.add(alterarFuncionario);

        verRegistros.setText("Ver Registros");
        verRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verRegistrosActionPerformed(evt);
            }
        });
        menuFuncionario.add(verRegistros);

        setIconImages(IconUtils.getIcons());
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                focusGained(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des Empolyés", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClick(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue(CAPTIONS.getString("IDNUMBER"));
            jTable1.getColumnModel().getColumn(1).setHeaderValue(CAPTIONS.getString("NAME"));
            jTable1.getColumnModel().getColumn(2).setHeaderValue(CAPTIONS.getString("DOCNUMBER"));
            jTable1.getColumnModel().getColumn(3).setHeaderValue(CAPTIONS.getString("PHONE"));
            jTable1.getColumnModel().getColumn(4).setHeaderValue(CAPTIONS.getString("SSNUMBER"));
            jTable1.getColumnModel().getColumn(5).setHeaderValue(CAPTIONS.getString("ID_DOC"));
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

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
        jLabel1.setText("Listes des Emplyeés");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); 
        jLabel2.setText("CopyRight MBMDA ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }                      

    private void focusGained(java.awt.event.WindowEvent evt) {                             
        preencherTabela();
    }                            

    private void menuExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        int index = jTable1.getSelectedRow();
        Funcionario f = funcionarios.get(index);
        controller.setFuncionario(f);        
        controller.delete();
        menuFuncionario.setVisible(false);
        preencherTabela();
        JOptionPane.showMessageDialog(null, "Employé exclu avec succès");
    }                                                      

    private void alterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        alterarFuncionario();
    }                                                  

    private void verRegistrosActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ListeHistoriques.getInstance().setFuncionario(getFuncionario());
        ListeHistoriques.getInstance().setVisible(true);
    }                                            

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {                                     
        menuFuncionario.setVisible(false);
    }                                    

    private void mouseClick(java.awt.event.MouseEvent evt) {                            
        if(evt.getClickCount() == 2){
            alterarFuncionario();
        }
        if(evt.getButton() == MouseEvent.BUTTON3){
            int linha = jTable1.rowAtPoint(evt.getPoint());
            ListSelectionModel model = jTable1.getSelectionModel();
            model.setSelectionInterval(linha, linha);
            menuFuncionario.setLocation(evt.getLocationOnScreen());
            menuFuncionario.setVisible(true);
        }
    }                           

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setVisible(false);
    }                                          

    private void preencherTabela (){
        funcionarios = controller.getAll();
        Object[][] tabela = new Object[funcionarios.size()][6];
        for(int i = 0; i< funcionarios.size(); i++){
            int j = 0;
            tabela[i][j++]  = funcionarios.get(i).getId();
            tabela[i][j++]  = funcionarios.get(i).getNome();
            tabela[i][j++]  = funcionarios.get(i).getCpf();
            tabela[i][j++]  = funcionarios.get(i).getTelefone();
            tabela[i][j++]  = funcionarios.get(i).getPis();
            tabela[i][j++]  = funcionarios.get(i).getIdentidade();
        }
        DefaultTableModel model;
        model = new DefaultTableModel(tabela, colunas) {
          boolean[] canEdit = new boolean [] {
              false, false, false, false, false, false
          };

          @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
              return canEdit [columnIndex];
          }
      };
        
        jTable1.setModel(model);
        jTable1.updateUI();
    }
    
    private ModifierEmployer editaFuncionario = new ModifierEmployer(this, Dialog.ModalityType.APPLICATION_MODAL);
    private FuncionarioController controller = new FuncionarioController();
    private List<Funcionario> funcionarios;
    private String[] colunas = new String [] {
        "ID", "Nom", "Prenom", "Telephone", "NAS", "E-mail"
    };
    
                   
    private javax.swing.JMenuItem alterarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JMenuItem menuExcluirFuncionario;
    private javax.swing.JPopupMenu menuFuncionario;
    private javax.swing.JMenuItem verRegistros;
                      
    private static CaptionUtils CAPTIONS;

    private void alterarFuncionario() {
        Funcionario f = getFuncionario();
        editaFuncionario.setFuncionario(f);
        editaFuncionario.setVisible(true);
    }

    private Funcionario getFuncionario() {
        int index = jTable1.getSelectedRow();
        Funcionario f = funcionarios.get(index);
        return f;
    }
}