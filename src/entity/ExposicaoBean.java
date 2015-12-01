package entity;

public class ExposicaoBean {
    
    private Integer codigoExposicao;
    private String nomeExposicao;
    private String descricaoExposicao;
    private String dataInicioExposicao;
    private String dataFimExposicao;
    private Integer piso;
    private String setor;
    
    public Integer getCodigoExposicao(){
        return codigoExposicao;
    }
    
    public void setCodigoExposicao(Integer codigoExposicao){
        this.codigoExposicao = codigoExposicao;
    }
    
    public String getNomeExposicao(){
        return nomeExposicao;
    }
    
    public void setNomeExposicao(String nomeExposicao){
        this.nomeExposicao = nomeExposicao;
    }
    
    public String getDescricaoExposicao(){
        return descricaoExposicao;
    }
    
    public void setDescricaoExposicao(String descricaoExposicao){
        this.descricaoExposicao = descricaoExposicao;
    }
            
    
    
    public Integer getPiso(){
        return piso;
    }
    
    public void setPiso(Integer piso){
        this.piso = piso;
    }
    
    public String getSetor(){
        return setor;
    }
    
    public void setSetor(String setor){
        this.setor = setor;
    }

    /**
     * @param dataInicioExposicao the dataInicioExposicao to set
     */
    public void setDataInicioExposicao(String dataInicioExposicao) {
        this.dataInicioExposicao = dataInicioExposicao;
    }

    /**
     * @param dataFimExposicao the dataFimExposicao to set
     */
    public void setDataFimExposicao(String dataFimExposicao) {
        this.dataFimExposicao = dataFimExposicao;
    }

    /**
     * @return the dataInicioExposicao
     */
    public String getDataInicioExposicao() {
        return dataInicioExposicao;
    }

    /**
     * @return the dataFimExposicao
     */
    public String getDataFimExposicao() {
        return dataFimExposicao;
    }
    
}
