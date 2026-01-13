//
public class cartellone{
    private boolean[] usciti = new boolean[91];
    private int rimasti = 90;
    public boolean haNumeri(){
        return rimasti> 0;
    }
    public int estraiNumero(){
        int numero;
        do{
            numero = (int)(Math.random()*90)+1;
        }while(usciti[numero]);
        usciti[numero]= true;
        rimasti--;
        return numero;
    }
}
