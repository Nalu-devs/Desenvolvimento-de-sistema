package cadastro;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Pessoa registro1 = new Pessoa();
        System.out.println("Digite o Código da 1º pessoa: ");
        registro1.setCodigo(teclado.nextInt());
        System.out.println("Digite o nome da pessoa da 1º pessoa: ");
        registro1.setNome(teclado.next());
        System.out.println("Digite a idade da pessoa da 1º pessoa: ");
        registro1.setIdade(teclado.nextInt());
        
        Pessoa registro2 = new Pessoa();
        System.out.println("Digite o Código da 2º pessoa: ");
        registro2.setCodigo(teclado.nextInt());
        System.out.println("Digite o nome da pessoa da 2º pessoa: ");
        registro2.setNome(teclado.next());
        System.out.println("Digite a idade da pessoa da 2º pessoa: ");
        registro2.setIdade(teclado.nextInt());
        
        Pessoa registro3 = new Pessoa();
        System.out.println("Digite o Código da 3º pessoa: ");
        registro3.setCodigo(teclado.nextInt());
        System.out.println("Digite o nome da pessoa da 3º pessoa: ");
        registro3.setNome(teclado.next());
        System.out.println("Digite a idade da pessoa da 3º pessoa: ");
        registro3.setIdade(teclado.nextInt());
        
        if(registro1.getIdade() > registro2.getIdade())
        {
            if(registro1.getIdade() > registro3.getIdade())
            {
                System.out.println(registro1.nome + " é mais velho");
            }
        }
        else if(registro2.getIdade() > registro3.getIdade())
        {
            System.out.println(registro2.nome + " é mais velho");
        }
        else
        {
            System.out.println(registro3.nome + " é mais velho");
        }
    }
    
}
