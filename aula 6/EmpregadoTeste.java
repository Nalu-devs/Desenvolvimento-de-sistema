package empregadoteste;
import java.util.Scanner;

public class EmpregadoTeste {
    public static void main(String[] args) {
        double salAnual1, salAnual2;
        Scanner teclado = new Scanner(System.in);
        
        Empregado reg1 = new Empregado();
        System.out.println("Digite o código do 1º empregado: ");
        reg1.setCodigo(teclado.nextInt());
        System.out.println("Digite o nome do 1º empregado: ");
        reg1.setNome(teclado.next());
        System.out.println("Digite o sobrenome do 1º empregado: ");
        reg1.setSobrenome(teclado.next());
        System.out.println("Digite o salário mensal do 1º empregado: ");
        reg1.setSalarioMensal(teclado.nextDouble());
        
        Empregado reg2 = new Empregado();
        System.out.println("Digite o código do 2º empregado: ");
        reg2.setCodigo(teclado.nextInt());
        System.out.println("Digite o nome do 2º empregado: ");
        reg2.setNome(teclado.next());
        System.out.println("Digite o sobrenome do 2º empregado: ");
        reg2.setSobrenome(teclado.next());
        System.out.println("Digite o salário mensal do 2º empregado: ");
        reg2.setSalarioMensal(teclado.nextDouble());
        
        salAnual1 = reg1.getSalarioMensal()*12;
        salAnual2 = reg2.getSalarioMensal()*12;
        
        System.out.println("O salario anual de " + reg1.getNome()+" "+ reg1.getSobrenome()+" é igual a: "+ salAnual1);
        System.out.println("O salario anual de " + reg2.getNome()+" "+ reg2.getSobrenome()+" é igual a: "+ salAnual2);
    }
    
}