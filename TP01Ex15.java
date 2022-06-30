import java.util.Scanner;


//Marcelo Marques Araujo CB3005631

/* Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de 
 * dólares. Calcular e exibir o valor correspondente em Reais (R$).
 */
public class TP01Ex15 {

	public static void main(String[] args) {
		double cotacao, quantidadeReais, quantidadeDolares;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a cotação do dolar atual: ");
		cotacao = scan.nextDouble();

		System.out.print("Digite a quantia em dólares: ");
		quantidadeDolares = scan.nextDouble();

		quantidadeReais = quantidadeDolares * cotacao;

		System.out.println("A quantia em Reais é: " + quantidadeReais);
	}

}