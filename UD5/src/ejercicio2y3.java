import javax.swing.JOptionPane;

public class ejercicio2y3 {

	/*public static void main(String[] args) {
		
		String name="Ainara";
	
	System.out.print("Bienvenido/a "+name);
	}*/
	
	public static void main(String[] args) {
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		JOptionPane.showMessageDialog(null,"Bienvenido/a : " +nombre);
	}
}
