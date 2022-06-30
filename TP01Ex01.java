import java.util.Scanner;

//Marcelo Marques Araujo CB3005631

public class TP01Ex01 {
    
    public static void main(String[] args){
        float base, altura, area;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("Digite a altura do retângulo: ");
    	altura = scan.nextFloat();
    	
    	System.out.print("Digite a base retângulo: ");
    	base = scan.nextFloat();
    	
    	area = base * altura;
    	
    	System.out.println("A área do retângulo é " + area);
    }
}