package tabuada;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        int tabuada, i, resultado, acertos=0, erros=0;
        Scanner numTabu;
        numTabu = new Scanner(System.in);
        System.out.println("Digite um numero para tabuada");
        tabuada = numTabu.nextInt();
        System.out.println("Digite o resultado da multiplicação");
        for(i=0; i<=10; i++){
            System.out.println(i + " X " + tabuada);
            Scanner res;
            res = new Scanner(System.in);
            resultado = res.nextInt();
            if(resultado==i*tabuada){
                acertos++;
            }
            else{
                erros++;
            }
        }
        System.out.println("Você obteve: "+acertos+" acertos! \n Você obteve: "+erros+" erros!");
    }
    
}