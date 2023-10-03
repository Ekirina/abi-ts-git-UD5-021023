import javax.swing.JOptionPane;

public class ejercicio6 {

	public static void main(String[] args) {

		final double IVA = 0.21;
		String texto_num=JOptionPane.showInputDialog("Introduzca el precio del producto");
		
		double precio = Double.parseDouble(texto_num);
		JOptionPane.showMessageDialog(null, "Este es el precio que dijo: "+precio+ " y su precio final es: " +(precio+(precio*IVA)));
	}

}
