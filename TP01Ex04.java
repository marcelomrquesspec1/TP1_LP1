import java.util.Scanner;

//Marcelo Marques Araujo CB3005631 A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.


public class TP01Ex04 {
    
    public static void main(String[] args){
        float base, altura, area;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("Digite a altura de um triângulo: ");
    	altura = scan.nextFloat();
    	
    	System.out.print("Digite base de um triângulo: ");
    	base = scan.nextFloat();
    	
    	area = (base * altura) / 2;
    	
    	System.out.println("A área do triângulo é " + area);
    }
}