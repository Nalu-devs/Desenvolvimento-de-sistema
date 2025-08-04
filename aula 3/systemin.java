package projeto1;
import java.util.Scanner;
public class Projeto1 {
    public static void main(String[] args) {
        int valor;
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Digite um valor");
        valor = teclado.nextInt();
        System.out.println("Valor lido " + valor);
    }
    
}