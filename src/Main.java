public class Main {
    
    /**
     * Binaerzahlen
     */
    public static void main(String[] args){
        // Transformieren Sie eine Ausgangszahl in den entsprechenden 
        // Binaerwert und geben Sie diesen aus.
        int start = 7;
        String binary = "";
        while(start!=0 && start > 0){
            binary = (start%2)+binary;
            start = (start/2);
            System.out.println(binary);
        }
    }
    
}
