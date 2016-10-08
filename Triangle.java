import java.util.Scanner;

public class Triangle {
	int a;
	int b;
	int c;
	int Maior;	
	
	public void aa (){
		System.out.println("maior e A");	
	}	
	public void bb (){
		System.out.println("maior e B");
	}
	public void cc (){
		System.out.println("maior e C");
	}	
	
	public static void main (String [] args){
		Triangle triangle = new Triangle ();
		
		Scanner Ent = new Scanner(System.in);		
		
		System.out.println("escreva um numero: ");
		triangle.a = Ent.nextInt ();
		
		System.out.println("escreva outro numero: ");
		triangle.b = Ent.nextInt ();
		
		System.out.println("escreva mais outro numero: ");
		triangle.c = Ent.nextInt ();
		
		if (triangle.a > triangle.b && triangle.a > triangle.c) {
			 triangle.aa ();	 
           } else if (triangle.b > triangle.a && triangle.b > triangle.c) {
    	          triangle.bb ();
              } else triangle.cc ();		
		
	   }	

}

/*Identeação do código*/
