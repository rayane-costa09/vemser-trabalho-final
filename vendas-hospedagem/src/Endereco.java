public class Endereco {

    //1 - residencial, 2 - comercial
    private int tipo;

    private String logradouro;

    private int numero;

    private String complemento;

    private String cep;

    private String cidade;

    private String estado;

    private String pais;

    public void imprimirEndereco(){
        if(getTipo() == 1){
            System.out.println("Contato residencial");
        }else{
            System.out.println("Contato comercial");
        }
        System.out.println("logradouro: "+ getLogradouro());
        System.out.println("numero: "+ getNumero());
        System.out.println("complemento: "+ getComplemento());
        System.out.println("cep: "+ getCep());
        System.out.println("cidade: "+ getCidade());
        System.out.println("estado: "+ getEstado());
        System.out.println("pais: "+ getPais());
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}