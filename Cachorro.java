public class Cachorro {
    private String nome;
    private String entrada;
    private String raca;
    private String cor;
    private int peso;

    public Cachorro(){}
    public Cachorro(String nome, String entrada, String raca, String cor, int peso){
        this.nome = nome;
        this.entrada = entrada;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
    }
    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the entrada
     */
    public String getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    /**
     * @return String return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return String return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return int return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void name() {
        
    }

    public void verificaPeso(){
        int peso = getPeso();
        if( peso >= 20 && peso <= 0){
            System.out.println("Desnutrido");
        }
        else if(peso >= 21 && peso <= 30){
            System.out.println("Normal");
        }
        else if(peso > 30){
            System.out.println("Obeso");
        }
    }
}
