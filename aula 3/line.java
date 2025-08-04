package projeto1;
import java.util.Scanner;
public class Projeto1 {
    public static void main(String[] args) {
        int valor;
        String seuNome;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        seuNome = teclado.nextLine();
        System.out.println("Olá " + seuNome + ".");
    }
}