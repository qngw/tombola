//
//
public class giocatore{
    private String nome;
    private cartella[] cartelle;

    public giocatore(String nome,int nCartelle){
        this.nome=nome;
        cartelle=new cartella[nCartelle];

        for(int i=0; i<nCartelle; i++){
            cartelle[i]=new cartella();
        }
    }
    public void segnaNumero(int numero){
        for (int i=0; i<cartelle.length; i++) {
            cartelle[i].segnaNumero(numero,nome);
        }
    }
    public String getNome(){
        return nome;
    }
    public void stampaCartelle() {
        System.out.println("cartelle di "+ nome);
        for (int i=0; i<cartelle.length; i++) {
            System.out.println("cartella "+ (i+1));
            cartelle[i].stampaCartella();
        }
    }
}
