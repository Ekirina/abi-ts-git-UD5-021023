import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Introduce un número: ");
		
		int num = sc.nextInt();
		
		
		if (num%2==0) {
			System.out.print("Es divisible entre 2");	
		}else{
			System.out.print("Tu número no divisible entre 2.");
			
		}
		
	sc.close();
	}
	

}
