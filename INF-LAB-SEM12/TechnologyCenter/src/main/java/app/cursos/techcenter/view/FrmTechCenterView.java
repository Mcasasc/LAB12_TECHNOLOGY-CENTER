package app.cursos.techcenter.view;

import javax.swing.table.DefaultTableModel;

public class FrmTechCenterView extends javax.swing.JFrame {

    public FrmTechCenterView() {
        initComponents();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTechCenterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new FrmTechCenterView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCurso;
    private javax.swing.JButton btnAgregarCurso1;
    private javax.swing.JButton btnAgregarCurso2;
    private javax.swing.JButton btnAgregarCurso3;
    private javax.swing.JButton btnAgregarCurso4;
    private javax.swing.JButton btnAgregarCurso5;
    private javax.swing.JButton btnAgregarCurso6;
    private javax.swing.JButton btnAgregarCurso7;
    private javax.swing.JButton btnAgregarCurso8;
    private javax.swing.JButton btnAgregarCurso9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tblCursos;
    private javax.swing.JTable tblCursos1;
    private javax.swing.JTable tblCursos2;
    private javax.swing.JTable tblCursos3;
    private javax.swing.JTable tblCursos4;
    private javax.swing.JTable tblCursos5;
    private javax.swing.JTable tblCursos6;
    private javax.swing.JTable tblCursos7;
    private javax.swing.JTable tblCursos8;
    private javax.swing.JTable tblCursos9;
    private javax.swing.JTextField txtIdCurso;
    private javax.swing.JTextField txtIdCurso1;
    private javax.swing.JTextField txtIdCurso2;
    private javax.swing.JTextField txtIdCurso3;
    private javax.swing.JTextField txtIdCurso4;
    private javax.swing.JTextField txtIdCurso5;
    private javax.swing.JTextField txtIdCurso6;
    private javax.swing.JTextField txtIdCurso7;
    private javax.swing.JTextField txtIdCurso8;
    private javax.swing.JTextField txtIdCurso9;
    private javax.swing.JTextField txtNomCurso;
    private javax.swing.JTextField txtNomCurso1;
    private javax.swing.JTextField txtNomCurso2;
    private javax.swing.JTextField txtNomCurso3;
    private javax.swing.JTextField txtNomCurso4;
    private javax.swing.JTextField txtNomCurso5;
    private javax.swing.JTextField txtNomCurso6;
    private javax.swing.JTextField txtNomCurso7;
    private javax.swing.JTextField txtNomCurso8;
    private javax.swing.JTextField txtNomCurso9;
    private javax.swing.JTextField txtNomProfesor;
    private javax.swing.JTextField txtNomProfesor1;
    private javax.swing.JTextField txtNomProfesor2;
    private javax.swing.JTextField txtNomProfesor3;
    private javax.swing.JTextField txtNomProfesor4;
    private javax.swing.JTextField txtNomProfesor5;
    private javax.swing.JTextField txtNomProfesor6;
    private javax.swing.JTextField txtNomProfesor7;
    private javax.swing.JTextField txtNomProfesor8;
    private javax.swing.JTextField txtNomProfesor9;
    private javax.swing.JTextField txtNumVacantes;
    private javax.swing.JTextField txtNumVacantes1;
    private javax.swing.JTextField txtNumVacantes2;
    private javax.swing.JTextField txtNumVacantes3;
    private javax.swing.JTextField txtNumVacantes4;
    private javax.swing.JTextField txtNumVacantes5;
    private javax.swing.JTextField txtNumVacantes6;
    private javax.swing.JTextField txtNumVacantes7;
    private javax.swing.JTextField txtNumVacantes8;
    private javax.swing.JTextField txtNumVacantes9;
    private javax.swing.JTextField txtPrecioCurso;
    private javax.swing.JTextField txtPrecioCurso1;
    private javax.swing.JTextField txtPrecioCurso2;
    private javax.swing.JTextField txtPrecioCurso3;
    private javax.swing.JTextField txtPrecioCurso4;
    private javax.swing.JTextField txtPrecioCurso5;
    private javax.swing.JTextField txtPrecioCurso6;
    private javax.swing.JTextField txtPrecioCurso7;
    private javax.swing.JTextField txtPrecioCurso8;
    private javax.swing.JTextField txtPrecioCurso9;
    // End of variables declaration//GEN-END:variables
}
