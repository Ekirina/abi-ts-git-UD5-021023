import javax.swing.JOptionPane;

public class ejercicio11 {

	public static void main(String[] args) {
		String semanal=JOptionPane.showInputDialog("Introduce un día de la semana:");
		
		switch (semanal) {
		case "lunes":
			JOptionPane.showMessageDialog(null, semanal+" es un día laborable.");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, semanal+" es un día laborable.");
			break;
		case "miércoles":
			JOptionPane.showMessageDialog(null, semanal+" es un día laborable.");
				break;
		case "jueves":
			JOptionPane.showMessageDialog(null, semanal+" es un día laborable.");
					break;
		case "viernes":
			JOptionPane.showMessageDialog(null, semanal+" es un día laborable.");
						break;	
		case "sábado":
			JOptionPane.showMessageDialog(null, semanal+" no es un día laborable.");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, semanal+" no es un día laborable.");
			break;
		default:
			break;
		}
	}

}
