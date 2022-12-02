
package DTO;


public class ObrasDTO {

    public String NomeDaObra;
    public String DataInicio;
    public String DataFim;
   
    public ObrasDTO(String NomeDaObra, String DataInicio, String DataFim) {
        this.NomeDaObra = NomeDaObra;
        this.DataInicio= DataInicio;
        this.DataFim = DataFim;
    } 

    public String getNomeDaObra() {
        return NomeDaObra;
    }

    public String getDataInicio() {
        return DataInicio;
    }

    public String getDataFim() {
        return DataFim;
    }

    public void setNomeDaObra(String NomeDaObra) {
        this.NomeDaObra = NomeDaObra;
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public void setDataFim(String DataFim) {
        this.DataFim = DataFim;
    }
    
}
