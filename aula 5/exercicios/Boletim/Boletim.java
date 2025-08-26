package boletim;
import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        double media;
        Scanner teclado = new Scanner(System.in);
        
        Nota boletim1 = new Nota();
        Nota boletim2 = new Nota();
        Nota boletim3 = new Nota();
        Nota boletim4 = new Nota();
        
        System.out.println("Digite o bimestre: ");
        boletim1.setBimestre(teclado.nextInt());
        System.out.println("Digite a nota: ");
        boletim1.setValorN(teclado.nextDouble());
        
        System.out.println("Digite o bimestre: ");
        boletim2.setBimestre(teclado.nextInt());
        System.out.println("Digite a nota: ");
        boletim2.setValorN(teclado.nextDouble());
        
        System.out.println("Digite o bimestre: ");
        boletim3.setBimestre(teclado.nextInt());
        System.out.println("Digite a nota: ");
        boletim3.setValorN(teclado.nextDouble());
        
        System.out.println("Digite o bimestre: ");
        boletim4.setBimestre(teclado.nextInt());
        System.out.println("Digite a nota: ");
        boletim4.setValorN(teclado.nextDouble());
        
        media = (boletim1.getValorN() + boletim2.getValorN() + boletim3.getValorN()+ boletim4.getValorN()) / 4;
        
        System.out.println("A média foi: " + media);
    }
    
}