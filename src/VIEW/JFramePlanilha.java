
package VIEW;

import VIEW.JFrameObras;
import DTO.ObrasDTO;
import DTO.PlanilhaDTO;
import DAO.PlanilhaDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class JFramePlanilha extends javax.swing.JFrame {

   
    public JFramePlanilha() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    public void exportarDados (ObrasDTO model){
        //recebe o valor da variavel para mostrar na tela.
        txtnomeObra.setText(model.NomeDaObra);
        txtdataI.setText(model.DataInicio);
        txtdataT_.setText(model.DataFim);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProduto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnomeObra = new javax.swing.JTextField();
        txtdataI = new javax.swing.JTextField();
        txtdataT_ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome_material = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtValorU = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("OBRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Planilha");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Anotações");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("EDITAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MATERIAL", "QUANTIDADE", "VALOR UNIDADE", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaProduto);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("nome da obra:");

        jLabel3.setText("inicio em :");

        jLabel4.setText("Termino da obra :");

        txtnomeObra.setEditable(false);
        txtnomeObra.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        txtnomeObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeObraActionPerformed(evt);
            }
        });

        txtdataI.setEditable(false);

        txtdataT_.setEditable(false);

        jLabel2.setText("Material :");

        jLabel5.setText("Quantidade :");

        jLabel6.setText("Valor por Unidade :");

        jLabel7.setText("Total :");

        jButton5.setText("CARREGAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnApagar.setText("APAGAR DADOS");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome_material, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorU, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtdataI, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtdataT_, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtnomeObra, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(125, 125, 125)
                                .addComponent(btnApagar)
                                .addGap(167, 167, 167))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(txtnomeObra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txtdataT_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtdataI, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addComponent(jButton3)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValorU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(btnApagar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    JFrameObras jFrameObras_ = new JFrameObras();
      jFrameObras_.setVisible(true);
      this.dispose();  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      JFrameAnotacoes jFrameAnotacoes_ = new JFrameAnotacoes();
      jFrameAnotacoes_.setVisible(true);
      this.dispose();    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFramePlanilha jFramePlanilha_ = new JFramePlanilha();
      jFramePlanilha_.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnomeObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeObraActionPerformed
           
    }//GEN-LAST:event_txtnomeObraActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.Produto();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.EditarProdutos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
       
    }//GEN-LAST:event_btnApagarActionPerformed

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePlanilha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaProduto;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNome_material;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValorU;
    private javax.swing.JTextField txtdataI;
    private javax.swing.JTextField txtdataT_;
    private javax.swing.JTextField txtnomeObra;
    // End of variables declaration//GEN-END:variables


 private void Produto() {
        
        String material = txtNome_material.getText();
        String quantidade = txtQuantidade.getText();
        String valor_unidade = txtValorU.getText(); 
        String total = txtTotal.getText();
        
        
        PlanilhaDTO objProdutoDTO_ = new PlanilhaDTO(material, quantidade, valor_unidade, total);
        
        PlanilhaDAO objProdutoDAO = new PlanilhaDAO(); 
        objProdutoDAO.CreateAplanilha(objProdutoDTO_);
       
        limpaCampos();
        listaProdutos();
    }
 
 private void limpaCampos(){ 
        
        txtNome_material.setText("");
        txtQuantidade.setText("");
        txtValorU.setText("");
        txtTotal.setText("");    
    }
    
private void listaProdutos(){ 
        
        try{  
         
         PlanilhaDAO _objProdutoDAO = new PlanilhaDAO();
         DefaultTableModel tabelamodel = (DefaultTableModel)TabelaProduto.getModel();
         tabelamodel.setNumRows(0); 
         ArrayList<PlanilhaDTO> listaProdutos = _objProdutoDAO.readAllplanilha_();
         for(PlanilhaDTO Produto : listaProdutos) {
             tabelamodel.addRow(new Object[]{
                 Produto.getMaterial(),
                 Produto.getQuantidade(),
                 Produto.getValorUnidade(), 
                 Produto.getTotal(),
                
             });
            }
        }catch(Exception e){
            System.out.println("Erro ao listar na tabela");
        }
        
    }        

private void selecionaLinha(){
            int linha = TabelaProduto.getSelectedRow(); 
       
            txtNome_material.setText(TabelaProduto.getModel().getValueAt(linha,1).toString());
            txtQuantidade.setText(TabelaProduto.getModel().getValueAt(linha, 2).toString()); 
            txtValorU.setText(TabelaProduto.getModel().getValueAt(linha,3).toString()); 
            txtTotal.setText(TabelaProduto.getModel().getValueAt(linha, 4).toString());
            
        }

private void EditarProdutos()  {
           
          String material_ = txtNome_material.getText();
          String quantidade_ = txtQuantidade.getText(); 
          String valorU_ = txtValorU.getText(); 
          String total_ = txtTotal.getText(); 
          
          PlanilhaDTO objProdutoDTO__ = new PlanilhaDTO(material_, quantidade_, valorU_, total_);
          
          objProdutoDTO__.setMaterial(material_);
          objProdutoDTO__.setQuantidade(quantidade_);
          objProdutoDTO__.setValorUnidade(valorU_);
          objProdutoDTO__.setTotal(total_);
         
          PlanilhaDAO objProdutoDAO_ = new PlanilhaDAO(); 
          objProdutoDAO_.update(objProdutoDTO__); 
          
          limpaCampos(); 
          listaProdutos();
      }

 public void ApagarProduto() {
           
         String produto = txtNome_material.getText();
          
          
          PlanilhaDTO objProdutoDTO = new PlanilhaDTO();
          objProdutoDTO.setMaterial(produto);
          
          
          PlanilhaDAO objProdutoDAO = new PlanilhaDAO(); 
          objProdutoDAO.Delete(objProdutoDTO); 
          
          limpaCampos(); 
          listaProdutos();
       }
}
