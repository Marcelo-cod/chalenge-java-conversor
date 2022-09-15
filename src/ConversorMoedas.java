
import javax.swing.JOptionPane;

public class ConversorMoedas {

	public static void main(String[] args) {
FuncaoConverter converter = new FuncaoConverter();
		
		while(true) {
			String opcao = JOptionPane.showInputDialog(null, "Escolha uma opcção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moeda", "Conversor de temperatura"}, " Escolha").toString();
			String moeda = JOptionPane.showInputDialog(null, "Escolha uma opcção para converter", "Conversor de Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Reais para Dolares", "Reais para Euros"}, " Escolha").toString();
			String temperatura = JOptionPane.showInputDialog(null, "Escolha uma opcção para converter", "Conversor de temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Celsius para far", "graus para radianos"}, " Escolha").toString();
			
			if(opcao == "Conversor de Moeda") {
				switch (moeda) {
				case "Reais para Dolares": {
					String input = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorRecebido = Double.parseDouble(input);
					converter.ConverterReaisParaDolar(valorRecebido);
					break;
				}
				case "Reais para Euros": {
					String moed = JOptionPane.showInputDialog("Insira um valor em euros");
					double valor = Double.parseDouble(moed);
					converter.ConverterReaisParaEuro(valor);
					break;
				}
				
				}
				
			}if(opcao == "Conversor de temperatura") {
				
				switch (temperatura) {
				case "Celsius para far": {
					String input = JOptionPane.showInputDialog("Insira o valor");
					double valorRecebido = Double.parseDouble(input);
					converter.ConverterReaisParaDolar(valorRecebido);
					break;
				}
				case "Reais para Euros": {
					String moed = JOptionPane.showInputDialog("Insira um");
					double valor = Double.parseDouble(moed);
					converter.ConverterReaisParaEuro(valor);
					break;
				}
				
				}
			}
				
				
				
				
			
			
			
//			switch(opcao) {
//				case "Conversor de Moeda":
//					
//				case "Reais para Dolares":	
//					String input = JOptionPane.showInputDialog("Insira um valor em reais");
//					double valorRecebido = Double.parseDouble(input);
//					converter.ConverterReaisParaDolar(valorRecebido);
//					break;
//				case "Reais para Euros":
//					String moed = JOptionPane.showInputDialog("Insira um valor em euros");
//					double valor = Double.parseDouble(moed);
//					converter.ConverterReaisParaEuro(valor);
//					break;
					
				
					
					
					
			}
    }

	}


