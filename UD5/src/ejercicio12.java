import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		String pass="tsystems";
		Scanner sc = new Scanner(System.in);
		boolean eureka = false;
		String password;
			
		for (int i = 1; i < 4 && !eureka; i++) {

			System.out.print("Intento "+(i)+" ");

			System.out.print("Introduce la contraseña: ");
			password = sc.next();
			
			if (password.equals(pass)) {
				System.out.print("Enhorabuena.");
				eureka = true;
				}
			}			
		sc.close();

	}

}
