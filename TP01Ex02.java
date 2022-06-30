import java.util.Scanner;

//Marcelo Marques Araujo CB3005631
//Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
 

public class TP01Ex02 {

	public static void main(String[] args) {
		float area, aresta;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a medida do lado aresta: ");
		aresta = scan.nextFloat();

		area = aresta * aresta;

		System.out.println("A area do quadrado é: " + area);
	}

}
