package controle;
import java.util.Scanner;
public class Controle {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Documento[] dados = new Documento[5];
        
        for(int i=0; i<dados.length; i++){
           dados[i] = new Documento(); 
           System.out.println("Digite o nÃºmero do "+(i+1)+"Âº: ");
           dados[i].setNumero(teclado.nextInt());
           System.out.println("Digite o titulo do "+(i+1)+"Âº: ");
           dados[i].setTitulo(teclado.next());
           System.out.println("Digite o valor do "+(i+1)+"Âº:");
           dados[i].setValor(teclado.nextDouble());
        }
        
        double maior=dados[0].getValor(), menor=dados[0].getValor();
        
        double soma=0, media;
        String tituloMaior =dados[0].getTitulo();
        String tituloMenor = dados[0].getTitulo();
        int numeroMaior = dados[0].getNumero();
        int numeroMenor = dados[0].getNumero();
        
        for (Documento dado : dados) {
            if (dado.getValor() > maior) {
                maior = dado.getValor();
                tituloMaior = dado.getTitulo();
                numeroMaior = dado.getNumero();
            } 
            if (dado.getValor() < maior) {
                menor = dado.getValor();
                tituloMenor = dado.getTitulo();                
                numeroMenor = dado.getNumero();
            }
            soma += dado.getValor();
            
        }
        media = soma/5;
        System.out.println("---Resultados---");
        System.out.println("Titulo do maior valor: "+tituloMaior);
        System.out.println("Titulo do menor valor: "+tituloMenor);
        System.out.println("Numero do maior valor: "+numeroMaior);
        System.out.println("Numero do menor valor: "+numeroMenor);
        System.out.println("Maior: " +maior);
        System.out.println("Menor: "+menor);
        System.out.println("Media: "+media);
        System.out.println("Soma: "+soma);
    }
    
}
