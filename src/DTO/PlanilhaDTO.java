
package DTO;


public class PlanilhaDTO {
    
    public String material;
    public String quantidade;
    public String valorUnidade;
    public String total;

    public PlanilhaDTO(String material, String quantidade, String valorUnidade, String total) {
        this.material = material;
        this.quantidade = quantidade;
        this.valorUnidade = valorUnidade;
        this.total = total;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(String valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    
    
    
    
}
