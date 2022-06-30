import java.util.Scanner;

//Marcelo Marques Araujo CB3005631 Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
 

public class TP01Ex06 {
    
    public static void main(String[] args){
        float valor1, valor2, valor3, valor4, media;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("Digite primeiro valor: ");
    	valor1 = scan.nextFloat();

		System.out.print("Digite o segundo valor: ");
    	valor2 = scan.nextFloat();

		System.out.print("Digite o terceiro valor: ");
    	valor3 = scan.nextFloat();

		System.out.print("Digite o quarto valor: ");
    	valor4 = scan.nextFloat();
    	
    	media = (valor1 + valor2 + valor3 + valor4) / 4;
    	
    	System.out.println("A média dos valores digitado é " + media);
    }
}
