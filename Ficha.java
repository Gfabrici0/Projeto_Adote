import java.time.LocalDate;
import java.time.Period;

public class Ficha {
    private String Adocao;
    private Cachorro cachorro = new Cachorro();
    private Pessoa pessoa = new Pessoa();

    public Ficha(){}
    public Ficha(String dataAdocao, Cachorro cachorro, Pessoa pessoa) {
        this.Adocao = dataAdocao;
        this.cachorro = cachorro;
        this.pessoa = pessoa;
    }

    /**
     * @return String return the dataAdocao
     */
    public String getDataAdocao() {
        return Adocao;
    }

    /**
     * @param dataAdocao the dataAdocao to set
     */
    public void setDataAdocao(String dataAdocao) {
        this.Adocao = dataAdocao;
    }

    /**
     * @return Cachorro return the cachorro
     */
    public Cachorro getCachorro() {
        return cachorro;
    }

    /**
     * @param cachorro the cachorro to set
     */
    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    /**
     * @return Pessoa return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void tempoOng() {
        LocalDate dataEntrada = LocalDate.parse(cachorro.getEntrada());
        LocalDate dataAdocao = LocalDate.parse(Adocao);
        Period periodo = Period.between(dataEntrada, dataAdocao);
        int dias = periodo.getDays();
        int mes = periodo.getMonths();
        int ano = periodo.getYears();
        System.out.println(cachorro.getNome() + " ficou " + dias + " dias, " + mes + " meses e " + ano + " ano na ONG.");
    }

    public void tempoAdotado() {
        LocalDate agora = LocalDate.now();
        LocalDate dataAdocao = LocalDate.parse(Adocao);
        Period periodo = Period.between(dataAdocao, agora);
        int dias = periodo.getDays();
        int mes = periodo.getMonths();
        int ano = periodo.getYears();
        System.out.println(cachorro.getNome() + " está adotado(a) a " + dias + " dias, " + mes + " meses e " + ano + " ano.");
    }
    
    public void verificaTempo(){
        LocalDate dataEntrada = LocalDate.parse(cachorro.getEntrada());
        LocalDate dataAdocao = LocalDate.parse(Adocao);
        if(dataAdocao.isAfter(dataEntrada)){
            System.out.println("Verdadeiro");
        }
        else{
            System.out.println("Falso");        
        }
    }

    public void substituiPessoa(Pessoa pessoa, Pessoa pessoa2){        
        this.setPessoa(pessoa);
        System.out.println(pessoa.getNome() + " é a nova dona");
    }
}
