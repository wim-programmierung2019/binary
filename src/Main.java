public class Main {
    
    /**
     * Binaerzahlen
     */
    public static void main(String[] args){
        // Transformieren Sie eine Ausgangszahl in den entsprechenden 
        // Binaerwert und geben Sie diesen aus.
        int Ausgangszahl = 241;
        int ZahlZwei=Ausgangszahl;
        int anzahlZahlen=0;
        
        while(Ausgangszahl != 0){
            Ausgangszahl = Ausgangszahl / 2;
            anzahlZahlen++;
           
        }
        int zahlen[] = new int[anzahlZahlen];
        for(int i=0; i < anzahlZahlen;i++){
            zahlen[i] = ZahlZwei % 2;
            ZahlZwei = ZahlZwei / 2;
        }
        for(int i = anzahlZahlen - 1; i>=0; i--){
            System.out.print(zahlen[i]);
        }
        
    }
    
}