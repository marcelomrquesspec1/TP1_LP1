//Marcelo Marques Araujo CB3005631

import java.util.Scanner;



public class TP01Ex18 {
    
    public static void main(String[] args){
        float vProduto1, vProduto2, vProduto3, vProduto4, vProduto5;
		float pagamento, troco;
		Scanner scan = new Scanner(System.in);
        
    	System.out.print("Digite o valor do 1º produto: ");
    	vProduto1 = scan.nextFloat();

		System.out.print("Digiteo valor do 2º produto: ");
    	vProduto2 = scan.nextFloat();

		System.out.print("Digite o valor do 3º produto: ");
    	vProduto3 = scan.nextFloat();

		System.out.print("Digiteo valor do 4º produto: ");
    	vProduto4 = scan.nextFloat();

		System.out.print("Digite o valor do 5º produto: ");
    	vProduto5 = scan.nextFloat();

		System.out.print(" Digite o valor do pagamento: ");
    	pagamento = scan.nextFloat();

		troco = pagamento - (vProduto1 + vProduto2 + vProduto3 + vProduto4 + vProduto5);

    	System.out.println("Troco devoldido " + troco);
    }
}