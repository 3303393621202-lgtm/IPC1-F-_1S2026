
package com.mycompany.mavenprojecto1;


public class newBuscarProducto extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(newBuscarProducto.class.getName());

   
    public newBuscarProducto() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        bntCancelar = new javax.swing.JButton();
        cmbCriterio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        barraNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        barraCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        barraCategorias = new javax.swing.JComboBox<>();

        jLabel5.setText("Código");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Criterio de búsqueda");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jLabel3.setText("Nombre");

        bntCancelar.setText("Cancelar");
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        cmbCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Categoría", "Código" }));
        cmbCriterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCriterioActionPerformed(evt);
            }
        });

        jLabel1.setText("[BUSCAR PRODUCTO]");

        barraNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Código");

        barraCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraCodigoActionPerformed(evt);
            }
        });

        jLabel6.setText("Categoria");

        barraCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camisas", "Pantalones", "Accesorios", "Varios" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbCriterio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(barraCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                            .addComponent(btnBuscar))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(barraNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(barraCodigo, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(barraCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntCancelar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //boton busqueda
        String criterio = cmbCriterio.getSelectedItem().toString();//izquierda
        
        String descripcion = barraNombre.getText();
        String identificador = barraCodigo.getText();                      //todo derecha
        String eleccion = barraCategorias.getSelectedItem().toString();

        String resultado = "";
        boolean encontrado = false;
        for(int i = 0; i < menuPrincipal.contador; i++){
            if(criterio.equals("Nombre")){
                if(menuPrincipal.nombre[i].equalsIgnoreCase(descripcion)){
                    resultado += "Nombre: " + menuPrincipal.nombre[i]
                    + " | Categoria: "
                    + menuPrincipal.categoria[i] + " | Precio: "
                    + menuPrincipal.precio[i]
                    + " | Stock: " + menuPrincipal.stock[i]
                    + " | Codigo: " + menuPrincipal.codigo[i] + "\n";
                    encontrado = true;
                }
            }

            if(criterio.equals("Categoría")){
                if(menuPrincipal.categoria[i].equalsIgnoreCase(eleccion)){
                    resultado += "Nombre: " + menuPrincipal.nombre[i]
                    + " | Categoria: " + menuPrincipal.categoria[i]
                    + " | Precio: " + menuPrincipal.precio[i]
                    + " | Stock: " + menuPrincipal.stock[i]
                    + " | Codigo: " + menuPrincipal.codigo[i] + "\n";

                    encontrado = true;
                }
            }

            if(criterio.equals("Código")){
                if(menuPrincipal.codigo[i].equalsIgnoreCase(identificador)){
                    resultado += "Nombre: " + menuPrincipal.nombre[i]
                    + " | Categoria: " + menuPrincipal.categoria[i]
                    + " | Precio: " + menuPrincipal.precio[i]
                    + " | Stock: " + menuPrincipal.stock[i]
                    + " | Codigo: " + menuPrincipal.codigo[i] + "\n";
                    encontrado = true;
                }
            }

        }

        if(encontrado){
            txtResultado.setText(resultado);
        }else{
            txtResultado.setText("No se encontró ningún producto.");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void cmbCriterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCriterioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCriterioActionPerformed

    private void barraNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraNombreActionPerformed

    private void barraCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraCodigoActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new newBuscarProducto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> barraCategorias;
    private javax.swing.JTextField barraCodigo;
    private javax.swing.JTextField barraNombre;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbCriterio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
