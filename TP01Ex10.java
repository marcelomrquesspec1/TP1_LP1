import java.util.Scanner;

//Marcelo Marques Araujo CB3005631
/*
 * Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e 
 * exibir sua temperatura equivalente em Fahrenheit.
 */

public class TP01Ex10 {
    
    public static void main(String[] args){
        float celsius, fahrenheit;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("Digite a temperatura em graus Celsius: ");
        
    	celsius = scan.nextFloat();

    	fahrenheit = 1.8f * celsius + 32;
    	
    	System.out.println("A temperatura em  Fahrenheit é " + fahrenheit + "ºF");
    }
}