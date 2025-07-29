package tabuada;
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int res, i, x;
        x = 8;
        for(i=0; i<=10; i++){
            res = x*i;
            System.out.println(x +" X "+ i +" = "+ res);
        }
    }
    
}