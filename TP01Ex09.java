import java.util.Scanner;

//Marcelo Marques Araujo CB3005631 

/*Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos 
 * valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
 */
public class TP01Ex09 {

	public static void main(String[] args) {
            
            
            
		double tensao, resistencia, corrente;
                
		Scanner scan = new Scanner(System.in);
                
                System.out.print(" valor da corrente: ");
		corrente = scan.nextDouble();

		System.out.print("valor da resistencia: ");
		resistencia = scan.nextDouble();

	

		tensao = resistencia * corrente;

		System.out.println("tensão do circuito é: " + tensao);
	}

}