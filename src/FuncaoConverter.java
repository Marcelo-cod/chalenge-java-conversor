//import java.net.HttpURLConnection;
//import java.net.URL;
import com.google.gson.Gson;


import javax.swing.JOptionPane;

public class FuncaoConverter {
	
	Gson gson = new Gson();
//	Gson.getdolar()
//	valor.put("USD", "buy");
//	
//	String json = gson.toJson(valor);
	static String app = "https://api.hgbrasil.com/finance/quotations?key=cb4ad3e8";
	static double dolar;
	
//	HttpURLConnection conexao = (HttpURLConnection)URL(app).openConnection();
		
	   public void ConverterReaisParaDolar(double valorRecebido) {
			double moedaDolar = valorRecebido / 5.15;
			moedaDolar = (double) Math.round(moedaDolar * 100d)/100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " " + " Dolares");
		}
		public void ConverterReaisParaEuro(double valorRecebido) {
			double moedaEuro = valorRecebido / 5.13;
			moedaEuro = (double) Math.round(moedaEuro * 100d)/100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " " + " Euros");
		}
		public void ConverterReaisParaLibras(double valorRecebido) {
			double moedaLibra = valorRecebido / 5.81;
			moedaLibra = (double) Math.round(moedaLibra * 100d)/100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " " + " Libras");
		}
		public void ConverterReaisParaPesoArg(double valorRecebido) {
			double moedaPesoArg = valorRecebido / 0.03;
			moedaPesoArg = (double) Math.round(moedaPesoArg * 100d)/100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArg + " " + " Peso Argentino");
		}
		public void ConverterReaisParaPesoChi(double valorRecebido) {
			double moedaPesoChi = valorRecebido / 0.06;
			moedaPesoChi = (double) Math.round(moedaPesoChi * 100d)/100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChi + " " + " Peso Chileno");
		}
		 public void ConverterDolarParaReais(double valorRecebido) {
				double moedaReais = valorRecebido * 5.15;
				moedaReais = (double) Math.round(moedaReais * 100d)/100;
				JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReais + " " + " Reais");
			}
			public void ConverterEuroParaReais(double valorRecebido) {
				double moedaReais = valorRecebido * 5.13;
				moedaReais = (double) Math.round(moedaReais * 100d)*100;
				JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReais + " " + " Reais");
			}
			public void ConverterLibrasParaReais(double valorRecebido) {
				double moedaReais = valorRecebido * 5.81;
				moedaReais = (double) Math.round(moedaReais * 100d)*100;
				JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReais + " " + " Reais");
			}
			public void ConverterPesoArgParaReais(double valorRecebido) {
				double moedaReais = valorRecebido * 0.03;
				moedaReais = (double) Math.round(moedaReais * 100d)*100;
				JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReais + " " + " Reais");
			}
			public void ConverterPesoChiParaReais(double valorRecebido) {
				double moedaReais = valorRecebido * 0.06;
				moedaReais = (double) Math.round(moedaReais * 100d)*100;
				JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReais + " " + " Reais");
			}
}

