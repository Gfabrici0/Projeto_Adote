public class Pessoa{
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private char sexo;
    private Cachorro cachorro;

    public Pessoa(){}
    public Pessoa(String nome, String endereco, String telefone, String email, char sexo, Cachorro cachorro) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.cachorro = cachorro;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){        
        return this.nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

}