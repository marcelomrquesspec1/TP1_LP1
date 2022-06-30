import java.util.Scanner;

//Marcelo Marques Araujo CB3005631
 // Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio 
//r inscrita em um cubo perfeito de aresta a. Os valores de r e a serão 
 //digitados.
 

public class TP01Ex14 {
    
    public static void main(String[] args){
        double raioEsfera, arestaCubo;
		double vEsfera, vCubo, vLivre;
    	Scanner scan = new Scanner(System.in);
        
        
    	System.out.print("Digite o raio da esfera: ");
    	raioEsfera = scan.nextFloat();

		System.out.print("Digitea aresta do cubo: ");
    	arestaCubo = scan.nextFloat();
    	
		vCubo = Math.pow(arestaCubo, 3);
                
		vEsfera = (4 * Math.PI * Math.pow(raioEsfera, 3))/ 3;
                
    	vLivre = vCubo - vEsfera;

    	System.out.println("O volume livre é " + vLivre);
    }
}
