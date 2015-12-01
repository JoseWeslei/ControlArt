
package entity;


public class EmprestimoBean {
    
    private Integer codigoObra;
    private String tituloObra;
    private String autorObra;    
    private String tipoOperacao;
    private String dataOperacaoEmp;
    private String museuObra;  
    private String transportePagador;
    private String transporteEmp;
    private String transporteTipo;        
    private Double transportePreco;
    
    private String imagemObra;    
    
    
    public Integer getCodigoObra() {
        return codigoObra;
    }
    
    public void setCodigoObra(Integer codigoObra) {
        this.codigoObra = codigoObra;
    }
    
    public String getTituloObra() {
        return tituloObra;
    }
    
    public void setTituloObra(String tituloObra) {
        this.tituloObra = tituloObra;
    }
    
    public String getAutorObra(){
        return autorObra;
    }
    
    public void setAutorObra(String autorObra){
        this.autorObra = autorObra;
    }
    
    public String getTipoOperacao(){
        return tipoOperacao;
    }
    
    public void setTipoOperacao(String tipoOperacao){
        this.tipoOperacao = tipoOperacao;
    }
    
    public String getMuseuObra(){
        return museuObra;
    }
    
    public void setMuseuObra(String museuObra){
        this.museuObra = museuObra;
    }
      
    public String getTransporteEmp(){
        return transporteEmp;
    }
    
    public void setTransporteEmp(String transporteEmp){
        this.transporteEmp = transporteEmp;
    }
    
    public String getTransporteTipo(){
        return transporteTipo;
    }
    
    public void setTransporteTipo(String transporteTipo){
        this.transporteTipo = transporteTipo;
    }
    
    public Double getTransportePreco(){
        return transportePreco;
    }
    
    public void setTransportePreco(Double transportePreco){
        this.transportePreco = transportePreco;
    }
    
    public String getTransportePagador(){
        return transportePagador;
    }
    
    public void setTransportePagador(String transportePagador){
        this.transportePagador = transportePagador;
    }
    
    public String getImagemObra(){
        return imagemObra;
    }
    
    public void setImagemObra(String imagemObra){
        this.imagemObra = imagemObra;
    }

    /**
     * @return the dataOperacaoEmp
     */
    public String getDataOperacaoEmp() {
        return dataOperacaoEmp;
    }

    /**
     * @param dataOperacaoEmp the dataOperacaoEmp to set
     */
    public void setDataOperacaoEmp(String dataOperacaoEmp) {
        this.dataOperacaoEmp = dataOperacaoEmp;
    }
    
    
}
