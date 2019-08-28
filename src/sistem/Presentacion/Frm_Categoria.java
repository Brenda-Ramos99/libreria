package sistem.Presentacion;
import sistem.Entidades.Validaciones;

/**
 *nombre de la clase: Frm_Categoria
 * version:1.0
 * fecha: 27/08/19
 * copyright:ITCA-FEPADE
 * @author Brenda Ramos
 */
public class Frm_Categoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frm_Categoria
     */
    Validaciones v = new Validaciones();
    public Frm_Categoria() {
        initComponents();
        v.validarNombres(txtCatrgoria);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCateg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodCateg = new javax.swing.JTextField();
        txtCatrgoria = new javax.swing.JTextField();
        btnAgregCateg = new javax.swing.JButton();
        btnModifCateg = new javax.swing.JButton();
        btnElimCateg = new javax.swing.JButton();
        btnSalirCateg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCategoria = new javax.swing.JTable();

        setTitle("Categoria");
        setVisible(true);

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre de Categoria");

        txtCodCateg.setEnabled(false);

        btnAgregCateg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/agregar-boton-dentro-del-circulo-negro.png"))); // NOI18N
        btnAgregCateg.setText("Agregar");

        btnModifCateg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/lapiz-escribiendo-en-un-papel.png"))); // NOI18N
        btnModifCateg.setText("Modificar");

        btnElimCateg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/cesto-de-basura.png"))); // NOI18N
        btnElimCateg.setText("Eliminar");

        btnSalirCateg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/logout.png"))); // NOI18N
        btnSalirCateg.setText("Salir");
        btnSalirCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCategActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCategLayout = new javax.swing.GroupLayout(PanelCateg);
        PanelCateg.setLayout(PanelCategLayout);
        PanelCategLayout.setHorizontalGroup(
            PanelCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategLayout.createSequentialGroup()
                .addGroup(PanelCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCategLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtCatrgoria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCategLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(PanelCategLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(PanelCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnElimCateg)
                            .addComponent(btnAgregCateg))
                        .addGroup(PanelCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCategLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnModifCateg))
                            .addGroup(PanelCategLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnSalirCateg))))
                    .addGroup(PanelCategLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(PanelCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtCodCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PanelCategLayout.setVerticalGroup(
            PanelCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtCatrgoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(PanelCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregCateg)
                    .addComponent(btnModifCateg))
                .addGap(35, 35, 35)
                .addGroup(PanelCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElimCateg)
                    .addComponent(btnSalirCateg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableCategoria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCateg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCategActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirCategActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCateg;
    private javax.swing.JTable TableCategoria;
    private javax.swing.JButton btnAgregCateg;
    private javax.swing.JButton btnElimCateg;
    private javax.swing.JButton btnModifCateg;
    private javax.swing.JButton btnSalirCateg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCatrgoria;
    private javax.swing.JTextField txtCodCateg;
    // End of variables declaration//GEN-END:variables
}