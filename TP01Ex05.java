import java.util.Scanner;

//Marcelo Marques Araujo CB3005631 Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
 

public class TP01Ex05 {

	public static void main(String[] args) {
		double diametro, volume;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a medida do diametro da esfera: ");
		diametro = scan.nextDouble();

		
		volume = (4 / 3) * Math.PI * (diametro / 2);

		System.out.println("O volume da esfera é: " + volume);
	}

}
