public class Main {
    
    /**
     * Binaerzahlen
     */
    public static void main(String[] args){
        // Transformieren Sie eine Ausgangszahl in den entsprechenden 
        // Binaerwert und geben Sie diesen aus.
        int Dezimalzahl = 30;
        
        while(Dezimalzahl>0){
            System.out.println(Dezimalzahl%2);
            Dezimalzahl=Dezimalzahl/2;
            }
    }
   
}
