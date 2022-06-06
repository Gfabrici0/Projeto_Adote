public class Main{    
    public static void main(String[] args){
        Cachorro cachorro1 = new Cachorro("Kate", "2009-06-12", "Vira-lata", "Preta", 35);
        Pessoa pessoa1 = new Pessoa("Diana", "Rua Otacílio Pedro Vasco 585 fundos", "(21) 99104-0484", "email@email.com", 'F', cachorro1);
        Ficha ficha1 = new Ficha("2010-12-24", cachorro1, pessoa1);
        ficha1.tempoOng();
        ficha1.tempoAdotado();
    }
}