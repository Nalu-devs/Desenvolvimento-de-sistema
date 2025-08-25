package pins;
import java.util.Scanner;
public class Pins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pins = {9, 3, 7,2};
        
        System.out.println("Digite o numero que deseja buscar:");
        int procurar = sc.nextInt();
        boolean achou = false;
        for(int i=0; i<pins.length; i++){
            if(pins[i] == procurar){
                achou = true;
                break;
            }
        }
        if(achou){
            System.out.println("O numero esta no array");
        }
        else{
            System.out.println("O numero nao esta no array");
        }
    }
}
