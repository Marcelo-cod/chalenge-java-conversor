import javax.swing.JOptionPane;

public class FuncaoConverter {
	
	
	static String app = "https://api.hgbrasil.com/finance/quotations?key=cb4ad3e8";
	static double dolar;
	 	
	   public void ConverterReaisParaDolar(double valorRecebido) {
			double moedaDolar = valorRecebido / dolar;
			moedaDolar = (double) Math.round(moedaDolar * 100d)/100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " " + " Dolares");
		}
		public void ConverterReaisParaEuro(double valorRecebido) {
			double moedaEuro = valorRecebido / 5.09;
			moedaEuro = (double) Math.round(moedaEuro * 100d)/100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " " + " Euros");
		}
}
