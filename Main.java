import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main{    
    public static void buscaNomeDeAdocao(ArrayList<Ficha> adocoes, String nome){
        for(int i = 0; i < adocoes.size(); i++){
            if(adocoes.get(i).getCachorro().getNome() == nome){
                System.out.println("--------------------------------------------------------");
                System.out.println("Cachorro encontrado:");
                adocoes.get(i).stts();
                System.out.println("--------------------------------------------------------");
            }
        }
    }

    public static void buscaMaiorTempoAdotado(ArrayList<Ficha> adocoes){
        long maiorTempo = 0;
        int j = 0;
        for(int i = 0; i < adocoes.size(); i++){
            LocalDate periodo = LocalDate.parse(adocoes.get(i).getDataAdocao());
            LocalDate agora = LocalDate.now();            
            Long recebePeriodo = periodo.until(agora, ChronoUnit.DAYS);            
            if(recebePeriodo > maiorTempo){
                maiorTempo = recebePeriodo;            
                j = i;
            }
        }
        System.out.println("\nO cachorro " + adocoes.get(j).getCachorro().getNome() + " é o cachorro com maior tempo de adoção com " + maiorTempo + " dias adotado.");
    }

    public static void buscaViraLataAdotado(ArrayList<Ficha> adocoes){ 
        int contador = 0;
        for(int i = 0; i < adocoes.size(); i++){
            if(adocoes.get(i).getCachorro().getRaca() == "Vira-lata"){
                contador += 1;
            }
        }        
        if(contador > 1){
            System.out.println("\nExistem " + contador + " cachorros da raça vira-lata adotados.");
        }
        else if(contador == 1){
            System.out.println("\nExiste " + contador + " cachorro da raça vira-lata adotado.");
        }
        else{
            System.out.println("\nNão há nenhum cachorro da raça vira-lata adotado");
        }        
    }

    public static void verificaCor(ArrayList<Cachorro> dogs){
        int contador = 0;
        for(int i = 0; i < dogs.size(); i++){
            if(dogs.get(i).getCor() == "Amarela"){
                contador += 1;
            }
        }
        if(contador > 1){
            System.out.println("\nExistem " + contador + " cachorros da cor Amarela.");
        }
        else if(contador == 1){
            System.out.println("\nExiste apenas " + contador + " cachorro da cor Amarela.");
        }
        else{
            System.out.println("\nNão existe nenhum cachorro da cor Amarela.");
        }
    }

    public static void informaPeso(ArrayList<Cachorro> dogs){
        int peso;
        int contador = 0;
        for(int i = 0; i < dogs.size(); i++){
            peso = dogs.get(i).getPeso();
            if(peso >= 0 && peso <= 20){
                contador += 1;
            }            
        }
        if(contador > 1){
            System.out.println("\n" + contador + " cachorros estão desnutridos.");
        }
        else if(contador == 1){
            System.out.println("\n" + contador + " cachorro está desnutrido.");
        }
        else{
            System.out.println("\nNenhum cachorro está desnutrido.");
        }
    }

    public static void buscaTotalViraLatas(ArrayList<Cachorro> dogs){
        int contador = 0;
        for(int i = 0; i < dogs.size(); i++){
            if(dogs.get(i).getRaca() == "Vira-lata" || dogs.get(i).getRaca() == "vira-lata" || 
                dogs.get(i).getRaca() == "vira-Lata" || dogs.get(i).getRaca() == "Vira-Lata")
            {
                contador += 1;
            }
        }
        if(contador > 1){
            System.out.println("\n" + contador + " cachorros de raça Vira-lata encontrados.");
        }
        else if(contador == 1){
            System.out.println("\n" + contador + " cachorro de raça Vira-lata encontrado.");
        }
        else{
            System.out.println("Nenhum cachorro da raça Vira-lata encontrado.");
        }
    }
    public static void main(String[] args){        
        Cachorro cachorro1 = new Cachorro("Kate", "2009-06-12", "Vira-lata", "Preta", 35);
        Pessoa pessoa1 = new Pessoa("Diana", "Rua Otacílio Pedro Vasco 585 fundos", "(21) 99104-0484", "email@email.com", 'F', cachorro1);
        Ficha ficha1 = new Ficha("2010-12-24", cachorro1, pessoa1);        

        Cachorro cachorro2 = new Cachorro("Bob", "2010-10-09", "Bulldog", "Preta", 22);        
        Pessoa pessoa2 = new Pessoa("Louis", "Av. Getúlio de Moura 1765", "(21) 90101-0101", "hotmail@hotmail.com", 'M', cachorro2);        
        Ficha ficha2 = new Ficha("2011-03-20", cachorro2, pessoa2);


        Cachorro cachorro3 = new Cachorro("Pitty", "2007-03-02", "Pitbull", "branca", 38);
        Pessoa pessoa3 = new Pessoa("Bruce", "Av. Lobo Júnior 999", "(21) 9000-0000", "gmail@gmail.com", 'M', cachorro3);
        Ficha ficha3 = new Ficha("2007-06-18", cachorro3, pessoa3);

        Cachorro cachorro4 = new Cachorro("Kelly", "2001-05-08", "Labrador", "Amarela", 36);
        Pessoa pessoa4 = new Pessoa("Clark", "QE 11 Área Especial C", "(21) 90202-0202", "hotmail4@hotmail.com", 'M', cachorro4);
        Ficha ficha4 = new Ficha("2002-09-01", cachorro4, pessoa4);

        Cachorro cachorro5 = new Cachorro("Gabriel", "2021-08-14", "Vira-lata", "Preta", 23);
        Cachorro cachorro6 = new Cachorro("Willson", "2022-11-22", "Vira-lata", "Amarela", 20);
        Cachorro cachorro7 = new Cachorro("Miriam", "2018-01-27", "Vira-lata", "Amarela", 18);    

        ArrayList<Ficha> adocoes = new ArrayList<Ficha>();
        adocoes.add(ficha1);
        adocoes.add(ficha2);
        adocoes.add(ficha3);
        adocoes.add(ficha4);

        ArrayList<Cachorro> dogs = new ArrayList<Cachorro>();
        dogs.add(cachorro1);
        dogs.add(cachorro2);
        dogs.add(cachorro3);
        dogs.add(cachorro4);
        dogs.add(cachorro5);
        dogs.add(cachorro6);
        dogs.add(cachorro7);

        /* ficha1.tempoOng();
        ficha1.tempoAdotado();  
        ficha1.substituiPessoa(pessoa2);
        cachorro1.verificaPeso();

        ficha2.tempoOng();
        ficha2.tempoAdotado();
        ficha2.substituiPessoa(pessoa1);
        cachorro2.verificaPeso();

        ficha3.tempoOng();
        ficha3.tempoAdotado();
        cachorro3.verificaPeso();

        ficha4.tempoOng();
        ficha4.tempoAdotado();
        cachorro4.verificaPeso(); */

        buscaNomeDeAdocao(adocoes, "Bob");
        verificaCor(dogs);
        buscaMaiorTempoAdotado(adocoes);
        informaPeso(dogs);
        buscaViraLataAdotado(adocoes);
        buscaTotalViraLatas(dogs);
    }
}