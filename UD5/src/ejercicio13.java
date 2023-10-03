import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		System.out.print("CalculadoraInversa ");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int number = sc.nextInt();
		System.out.print("Introduce un símbolo de operación: ");
		String simbol = sc.next();
		System.out.print("Introduce otro número: ");
		int numero = sc.nextInt();
		
		int result = 0;
		
		switch (simbol) {
		case "+":
			result=number+numero;
			break;
		case "-":
			result=number-numero;
			break;	
		case "*":
			result=number*numero;
			break;
		case "/":
			result=number/numero;
			break;
		case "^":
			result= (int) Math.pow(number, numero);
		case "%":
			result=number%numero;
			break;	
		default:
			break;
		}
        System.out.println( number+" "+simbol+" "+numero+" = "+result);
	}

}
