import javax.swing.JOptionPane;

public class ejercicio4 {

	public static void main(String[] args) {
		String num=JOptionPane.showInputDialog("Introduce un radio");
		double radio=Double.parseDouble(num);
		
		double area=Math.PI*Math.pow(radio, 2);
        System.out.println("El área de la circunferencia es "+area);
	}

}
