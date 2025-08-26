package testaarrayaluno;
import java.util.Scanner;
public class TestaArrayAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno[] turma = new Aluno[5];
        
        for(int i=0; i<turma.length; i++){
           turma[i] = new Aluno(); 
           System.out.println("Digite o nome do "+(i+1)+"º aluno: ");
           turma[i].setNome(teclado.next());
           System.out.println("Digite a primeira nota do "+(i+1)+"º aluno: ");
           turma[i].setNota1(teclado.nextDouble());
           System.out.println("Digite a segunda nota do "+(i+1)+"º aluno: ");
           turma[i].setNota2(teclado.nextDouble());
           System.out.println("A media do aluno "+turma[i].getNome()+" é igual a "+turma[i].calculo());
        }
        
    }
    
}