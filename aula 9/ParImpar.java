package parimpar;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        int tamanho, contPar=0, contImpar=0;
        System.out.println("Digite o tamanho do vetor:");
        tamanho = teclado.nextInt();
        int[] numero = new int[tamanho];
        System.out.println("Digite os nÃºmero para o vetor:");
        for(int i=0; i < tamanho; i++){
            numero[i] = teclado.nextInt();
            if(numero[i]%2==0){
                contPar++;
                
            }
            else{
                contImpar++;
            }
        }
        
        int[] par = new int[contPar];
        int[] impar = new int[contImpar];
        int iPar=0, iImpar=0;
        
        for(int i=0; i < tamanho; i++){
            if(numero[i]%2==0){
                par[iPar] = numero[i];
                iPar++;
            }
            else{
                impar[iImpar] = numero[i];
                iImpar++;
            }
        }
        System.out.println("Pares: ");
        for(int j=0; j < par.length; j++){
            System.out.println("Indice: "+j+par[j]);
        }
        System.out.println("Impares: ");
        for(int x=0; x <impar.length; x++){
            System.out.println("Indice: "+x+impar[x]);
        }
    }
    
}
