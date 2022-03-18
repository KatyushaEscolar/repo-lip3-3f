import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media = Double.parseDouble(JOptionPane
				.showInputDialog(null,"media:"));
		
		if (media > 6.0) {
			JOptionPane.showMessageDialog(null,
					"passou.");
		} else {
			JOptionPane.showMessageDialog(null,
					"reprovou, burro.");
		}
	}

}
