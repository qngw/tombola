public class cartella{
    private int[][] numeri= new int[3][9];
    private boolean[][] segnati= new boolean[3][9];
    private int prossimoNumero= 1;
    static boolean amboFatto= false;
    static boolean ternoFatto= false;
    static boolean quaternaFatta= false;
    static boolean cinquinaFatta= false;
    static boolean tombolaFatta= false;

    public cartella(){
        generaCartella();
    }
    private void generaCartella(){
        for (int r=0; r<3; r++) {
            int inseriti=0;
            for (int c=0; c<9 && inseriti<5; c++) {
                numeri[r][c] = prossimoNumero;
                prossimoNumero++;
                inseriti++;
            }
        }
    }
    private void controllaRiga(int riga, String nomeGiocatore){
        int cont=0;
        for(int c=0; c<9; c++){
            if (segnati[riga][c]) cont++;
        }
        if(cont==2 && !amboFatto){
            System.out.println("AMBO fatto da " + nomeGiocatore);
            amboFatto=true;
        }
        if(cont==3 && !ternoFatto){
            System.out.println("TERNO fatto da " + nomeGiocatore);
            ternoFatto=true;
        }
        if(cont==4 && !quaternaFatta){
            System.out.println("QUATERNA fatta da " + nomeGiocatore);
            quaternaFatta = true;
        }
        if(cont==5 && !cinquinaFatta){
            System.out.println("CINQUINA fatta da "+ nomeGiocatore);
            cinquinaFatta= true;
        }
    }
    private void controllaTombola(String nomeGiocatore){
        int cont= 0;
        for(int r= 0; r< 3; r++){
            for(int c= 0; c< 9; c++){
                if (segnati[r][c]) cont++;
            }
        }
        if(cont== 15 && !tombolaFatta){
            System.out.println("TOMBOLA fatta da "+ nomeGiocatore);
            tombolaFatta= true;
        }
    }
    public void segnaNumero(int numero,String nomeGiocatore){
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 9; c++){
                if(numeri[r][c] == numero){
                    segnati[r][c] = true;
                    controllaRiga(r, nomeGiocatore);
                    controllaTombola(nomeGiocatore);
                }
            }
        }
    }
    public void stampaCartella(){
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 9; c++){
                if(numeri[r][c] == 0){
                    System.out.print("    ");
                }else if(segnati[r][c]){
                    System.out.print(" X  ");
                }else{
                    System.out.print(numeri[r][c] + "  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
