import java.util.Scanner;

//Marcelo Marques Araujo CB3005631
//Calcular e exibir a velocidade final (em km/h) de um automóvel, a
 // partir dos valores da velocidade inicial (em m/s), da aceleração
 //(m/s2) e do tempo de percurso (em s) que serão digitados.
 
public class TP01Ex13 {

	public static void main(String[] args) {
		final double CONVERTER_METROS_KM = 3.6;
		
		double vFinal ,vInicial, aceleracao, tempo;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite velocidade inicial: ");
		vInicial = scan.nextDouble();

		System.out.print("Digite a aceleracao: ");
		aceleracao = scan.nextDouble();
		
		System.out.print("Digite o tempo: ");
		tempo = scan.nextDouble();
		
		vFinal = (vInicial + (aceleracao * tempo)) * CONVERTER_METROS_KM;

		System.out.println("A velocidade final em km/h é: " + vFinal);
	}

}
