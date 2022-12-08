
package DTO;


public class PlanilhaDTO {
    
    public int id_material;
    public String material;
    public String quantidade;
    public String valorUnidade;
    public String total;

    public PlanilhaDTO(int id_material, String material, String quantidade, String valorUnidade, String total) {
        this.id_material = id_material;
        this.material = material;
        this.quantidade = quantidade;
        this.valorUnidade = valorUnidade;
        this.total = total;
    }

    public PlanilhaDTO() {
       
    }

    public int getId_material() {
        return id_material;
    }

    public String getMaterial() {
        return material;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public String getValorUnidade() {
        return valorUnidade;
    }

    public String getTotal() {
        return total;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnidade(String valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    
    
}
