
package VIEW;

import VIEW.JFrameObras;
import DTO.ObrasDTO;
import DTO.PlanilhaDTO;
import DAO.PlanilhaDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class JFramePlanilha extends javax.swing.JFrame {

   
    public JFramePlanilha() {
        initComponents();
        
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.gray);
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
        txtid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("OBRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(6, 8, 86, 22);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Planilha");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(6, 42, 86, 22);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setText("Anotações");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(6, 72, 86, 22);

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setText("EDITAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(330, 240, 72, 22);

        TabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id_material", "MATERIAL", "QUANTIDADE", "VALOR-UNIDADE", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaProduto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 270, 524, 130);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Nome da obra:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 130, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("INICIO DA OBRA EM");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(152, 45, 126, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("TÉRMINO DA OBRA:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(425, 45, 113, 16);

        txtnomeObra.setEditable(false);
        txtnomeObra.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        txtnomeObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeObraActionPerformed(evt);
            }
        });
        getContentPane().add(txtnomeObra);
        txtnomeObra.setBounds(325, 6, 451, 30);

        txtdataI.setEditable(false);
        getContentPane().add(txtdataI);
        txtdataI.setBounds(272, 42, 119, 22);

        txtdataT_.setEditable(false);
        getContentPane().add(txtdataT_);
        txtdataT_.setBounds(538, 42, 131, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Material :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 140, 90, 25);
        getContentPane().add(txtNome_material);
        txtNome_material.setBounds(290, 140, 198, 22);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Quantidade :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 140, 110, 20);
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(600, 140, 71, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Valor por Unidade :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 190, 170, 20);
        getContentPane().add(txtValorU);
        txtValorU.setBounds(290, 190, 71, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Total :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 190, 80, 25);
        getContentPane().add(txtTotal);
        txtTotal.setBounds(460, 190, 71, 22);

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setText("CARREGAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(140, 240, 89, 22);

        btnApagar.setBackground(new java.awt.Color(204, 204, 255));
        btnApagar.setText("APAGAR DADOS");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnApagar);
        btnApagar.setBounds(510, 240, 118, 22);

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(150, 140, 42, 22);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("ID :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 140, 30, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("PREENCHA TODOS OS CAMPOS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(295, 91, 233, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/R.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, -100, 840, 620);

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
     this.ApagarProduto();
    }//GEN-LAST:event_btnApagarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

   
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNome_material;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValorU;
    private javax.swing.JTextField txtdataI;
    private javax.swing.JTextField txtdataT_;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnomeObra;
    // End of variables declaration//GEN-END:variables


 private void Produto() {
        
        int id_Material = Integer.parseInt (txtid.getText()); 
        String material = txtNome_material.getText();
        String quantidade = txtQuantidade.getText();
        String valor_unidade = txtValorU.getText(); 
        String total = txtTotal.getText();
        
        
        PlanilhaDTO objProdutoDTO_ = new PlanilhaDTO(id_Material, material, quantidade, valor_unidade, total);
        
        PlanilhaDAO objProdutoDAO = new PlanilhaDAO(); 
        objProdutoDAO.CreateAplanilha(objProdutoDTO_);
       
        limpaCampos();
        listaProdutos();
    }
 
 private void limpaCampos(){ 
        txtid.setText("");
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
                  
                 Produto.getId_material(),
                 Produto.getMaterial(),
                 Produto.getQuantidade(),
                 Produto.getValorUnidade(), 
                 Produto.getTotal()
                
             });
            }
        }catch(Exception e){
            System.out.println("Erro ao listar na tabela");
        }
        
    }        

private void selecionaLinha(){
            int linha = TabelaProduto.getSelectedRow();
            
            txtid.setText(TabelaProduto.getModel().getValueAt(linha,1).toString());
            txtNome_material.setText(TabelaProduto.getModel().getValueAt(linha,2).toString());
            txtQuantidade.setText(TabelaProduto.getModel().getValueAt(linha, 3).toString()); 
            txtValorU.setText(TabelaProduto.getModel().getValueAt(linha,4).toString()); 
            txtTotal.setText(TabelaProduto.getModel().getValueAt(linha, 5).toString());
            
            
        }

private void EditarProdutos()  {
    
          int Id_Material = Integer.parseInt(txtid.getText()); 
          String material_ = txtNome_material.getText();
          String quantidade_ = txtQuantidade.getText(); 
          String valorU_ = txtValorU.getText(); 
          String total_ = txtTotal.getText(); 
          
          PlanilhaDTO objProdutoDTO__ = new PlanilhaDTO();
          
          objProdutoDTO__.setId_material(Id_Material);
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
           
         int id_DoMaterial = Integer.parseInt(txtid.getText()); 
          
          
          PlanilhaDTO objProdutoDTO = new PlanilhaDTO();
          objProdutoDTO.setId_material(id_DoMaterial);
          
          
          PlanilhaDAO objProdutoDAO = new PlanilhaDAO(); 
          objProdutoDAO.Delete(objProdutoDTO); 
          
          limpaCampos(); 
          listaProdutos();
       }
}
