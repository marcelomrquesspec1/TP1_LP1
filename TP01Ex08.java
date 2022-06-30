import java.util.Scanner;

/*Marcelo Marques Araujo CB3005631 Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e 
 dois metros e que um quilômetro possui mil metros, fazer um programa para 
  converter milhas marítimas em quilômetros.
 */

public class TP01Ex08 {
    
    public static void main(String[] args){
			
			final float quilometro_metros = 1000;
                        final float milha_metros = 1852;

      float milhas, quilometros;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("DIgite o valor em milhas: ");
    	milhas = scan.nextFloat();

    	quilometros = (milhas * milha_metros) / quilometro_metros;
    	
    	System.out.println("A medida das milhas em quilômetros " + quilometros);
    }
}