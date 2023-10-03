import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce cuántos productos tiene en venta: ");
	
        int productos = sc.nextInt();
		
		int total = 0;
		
		for(int venta=1; venta <=productos; venta++) {
			System.out.print("Vendidos del producto "+venta+" :");
			total += sc.nextInt();
		}
		System.out.print("Total: "+total);
		sc.close();
	}

}
