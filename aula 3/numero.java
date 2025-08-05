/*Ler a variavel dado ate 0 e indicar na frente do numero se ele é impar ou par */

package verificanumero;
import java.util.Scanner;
public class VerificaNumero {
    public static void main(String[] args) {
        int dado, i, j;
        Scanner num;
        System.out.println("Digite o numero que começaremos");
        num = new Scanner(System.in);
        dado = num.nextInt();
        for(i=dado; i>0; i--){
                if(i%2==0)
                    System.out.println(i+" O número é par");
                else
                    System.out.println(i+" O número é impar");
                //Falta descobrir o numero primo
        }
    }  
}