//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Quanti giocatori? ");
        int n=scanner.nextInt();
        scanner.nextLine();
        giocatore[] giocatori = new giocatore[n];
        for (int i=0; i<n; i++) {
            System.out.print("Nome giocatore " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            int cartelle;
            do{
                System.out.print("Numero cartelle (1-6): ");
                cartelle=scanner.nextInt();
            }while (cartelle<1 || cartelle>6);
            scanner.nextLine();
            giocatori[i] = new giocatore(nome, cartelle);
        }
        System.out.println("CARTELLE DEI GIOCATORI");
        System.out.println();
        for (int i=0; i<giocatori.length; i++) {
            giocatori[i].stampaCartelle();
        }
        cartellone cartellone = new cartellone();
        System.out.println("ESTRAZIONE");
        System.out.println();
        while(cartellone.haNumeri() && !cartella.tombolaFatta){
            int numero = cartellone.estraiNumero();
            System.out.println("Mescolando...: " + numero+"!");
            System.out.println();
            for (int i=0; i<giocatori.length; i++) {
                giocatori[i].segnaNumero(numero);
            }
            for (int i=0; i<giocatori.length; i++) {
                giocatori[i].stampaCartelle();
            }
        }
        scanner.close();
    }
}
