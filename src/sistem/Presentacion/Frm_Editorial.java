/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.Presentacion;

/**
 *
 * @author Brenda Ramos
 */
public class Frm_Editorial extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frm_Editorial
     */
    public Frm_Editorial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEditorial = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodEdit = new javax.swing.JTextField();
        txtNomEdit = new javax.swing.JTextField();
        txtPaisEdit = new javax.swing.JTextField();
        txtDireccEdit = new javax.swing.JTextField();
        txtTelefEdit = new javax.swing.JTextField();
        btnAgregEdit = new javax.swing.JButton();
        btnModifEdit = new javax.swing.JButton();
        btnElimEdit = new javax.swing.JButton();
        btnSalirEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableEditorial = new javax.swing.JTable();

        setTitle("Registro de Editorial");
        setToolTipText("");
        setName(""); // NOI18N
        setVisible(true);

        jLabel1.setText("Código");

        jLabel2.setText("Nombre");

        jLabel3.setText("Teléfono");

        jLabel4.setText("País");

        jLabel5.setText("Dirección");

        btnAgregEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/agregar-boton-dentro-del-circulo-negro.png"))); // NOI18N
        btnAgregEdit.setText("Agregar");

        btnModifEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/lapiz-escribiendo-en-un-papel.png"))); // NOI18N
        btnModifEdit.setText("Modificar");

        btnElimEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/cesto-de-basura.png"))); // NOI18N
        btnElimEdit.setText("Eliminar");

        btnSalirEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/logout.png"))); // NOI18N
        btnSalirEdit.setText("Salir");
        btnSalirEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEditorialLayout = new javax.swing.GroupLayout(PanelEditorial);
        PanelEditorial.setLayout(PanelEditorialLayout);
        PanelEditorialLayout.setHorizontalGroup(
            PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditorialLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditorialLayout.createSequentialGroup()
                        .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelEditorialLayout.createSequentialGroup()
                                .addGap(0, 207, Short.MAX_VALUE)
                                .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))))
                    .addGroup(PanelEditorialLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txtTelefEdit))))
                .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditorialLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEditorialLayout.createSequentialGroup()
                                .addComponent(txtDireccEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128))
                            .addGroup(PanelEditorialLayout.createSequentialGroup()
                                .addComponent(txtPaisEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditorialLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnElimEdit)
                            .addComponent(btnAgregEdit)
                            .addComponent(btnModifEdit)
                            .addComponent(btnSalirEdit))
                        .addGap(27, 27, 27))))
        );
        PanelEditorialLayout.setVerticalGroup(
            PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditorialLayout.createSequentialGroup()
                .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditorialLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnAgregEdit)
                        .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEditorialLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtCodEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelEditorialLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnModifEdit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtPaisEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditorialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnElimEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditorialLayout.createSequentialGroup()
                        .addGroup(PanelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTelefEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtDireccEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditorialLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btnSalirEdit)
                        .addGap(25, 25, 25))))
        );

        TableEditorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableEditorial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirEditActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEditorial;
    private javax.swing.JTable TableEditorial;
    private javax.swing.JButton btnAgregEdit;
    private javax.swing.JButton btnElimEdit;
    private javax.swing.JButton btnModifEdit;
    private javax.swing.JButton btnSalirEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodEdit;
    private javax.swing.JTextField txtDireccEdit;
    private javax.swing.JTextField txtNomEdit;
    private javax.swing.JTextField txtPaisEdit;
    private javax.swing.JTextField txtTelefEdit;
    // End of variables declaration//GEN-END:variables
}
