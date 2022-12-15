
package DTO;


public class AnotacoesDTO {
    
    public int iD_Anotacao;
    public String anotacoes;

    public AnotacoesDTO(int iD_Anotacao, String anotacoes) {
        this.iD_Anotacao = iD_Anotacao;
        this.anotacoes = anotacoes;
    }

    public AnotacoesDTO() {
        
    }

    public int getiD_Anotacao() {
        return iD_Anotacao;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setiD_Anotacao(int iD_Anotacao) {
        this.iD_Anotacao = iD_Anotacao;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

  
   
    
}
