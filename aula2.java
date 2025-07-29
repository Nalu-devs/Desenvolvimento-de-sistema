package projeto;
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x;
         x = 1;
         switch(x){
             case 0:
                 System.out.println("X é 0");
                 break;
             case 1:
                 System.out.println("X é 1");
                 break;
             default:
                 System.out.println("X tem um valor diferente de 1 e 0");
                 break;
         }
    }
    
}