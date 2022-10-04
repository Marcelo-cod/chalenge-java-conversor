import javax.swing.JOptionPane;

public class ConverterTemperatura {
	
	 public void ConverterCelsiusParaFaraday(double valorRecebido) {
			double moedaDolar = valorRecebido / 5;
			moedaDolar = (double) Math.round(moedaDolar * 100d)/100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " " + " Dolares");
		}

}
