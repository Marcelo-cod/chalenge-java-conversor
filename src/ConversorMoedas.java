/**
 * @author Marcelo
 * @version 0.1
 * 
 * 
 */

import javax.swing.JOptionPane;


public class ConversorMoedas {

	public static void main(String[] args) {
FuncaoConverter converter = new FuncaoConverter();
ConverterTemperatura temperatur = new ConverterTemperatura();
String opcao = JOptionPane.showInputDialog(null, "Escolha uma opcção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moeda", "Conversor de Temperatura"}, " Escolha").toString();
String moeda = JOptionPane.showInputDialog(null, "Escolha uma opcção para converter", "Conversor de Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Reais para Dolares", "Reais para Euros", "Reais para Libras", "Reais para Peso Argentino", "Reais para Peso Chileno", "Dolar para Reais", "Euros para Reais", "Libras para Reais", "Peso Argentino para Reais", "Peso Chileno para Reais"}, " Escolha").toString();
//String temperatura = JOptionPane.showInputDialog(null, "Escolha uma opcção para converter", "Conversor de temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Celsius para far", "graus para radianos"}, " Escolha").toString();

		
		while(true) {
			
			if(opcao == "Conversor de Moeda") {
				switch (moeda) {
				case "Reais para Dolares": {
					String dolar = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorRecebido = Double.parseDouble(dolar);
					converter.ConverterReaisParaDolar(valorRecebido);
					break;
				}
				case "Reais para Euros": {
					String euros = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorRecebido = Double.parseDouble(euros);
					converter.ConverterReaisParaEuro(valorRecebido);
					break;
				}
				case "Reais para Libras": {
					String Libras = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorRecebido = Double.parseDouble(Libras);
					converter.ConverterReaisParaLibras(valorRecebido);
					break;
				}
				case "Reais para Peso Argentino": {
					String PesoArg = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorRecebido = Double.parseDouble(PesoArg);
					converter.ConverterReaisParaPesoArg(valorRecebido);
					break;
				}
				case "Reais para Peso Chileno": {
					String pesoChi = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorRecebido = Double.parseDouble(pesoChi);
					converter.ConverterReaisParaPesoChi(valorRecebido);
					break;
				}
				case "Dolar para Reais": {
					String reais = JOptionPane.showInputDialog("Insira um valor em dolar");
					double valorRecebido = Double.parseDouble(reais);
					converter.ConverterDolarParaReais(valorRecebido);
					break;
				}
				case "Euros para Reais": {
					String reais = JOptionPane.showInputDialog("Insira um valor em euros");
					double valorRecebido = Double.parseDouble(reais);
					converter.ConverterEuroParaReais(valorRecebido);
					break;
				}
				case "Libras para Reais": {
					String reais = JOptionPane.showInputDialog("Insira um valor em libras");
					double valorRecebido = Double.parseDouble(reais);
					converter.ConverterLibrasParaReais(valorRecebido);
					break;
				}
				case "Peso Argentino para Reais": {
					String reais = JOptionPane.showInputDialog("Insira um valor em peso argentino");
					double valorRecebido = Double.parseDouble(reais);
					converter.ConverterPesoArgParaReais(valorRecebido);
					break;
				}
				case "Peso Chileno para Reais": {
					String reais = JOptionPane.showInputDialog("Insira um valor em peso chileno");
					double valorRecebido = Double.parseDouble(reais);
					converter.ConverterPesoChiParaReais(valorRecebido);
					break;
				}
				
				
				
				}
			
				
//			}else if (opcao == "Conversor de Temperatura") {
//				
//			} switch (temperatura) {
//					case "Celsius para far": {
//				String input = JOptionPane.showInputDialog("Insira o valor");
//				double valorRecebido = Double.parseDouble(input);
//				temperatur.ConverterCelsiusParaFaraday(valorRecebido);
//				break;
//			}
			
				
				
				
				
				
			
			
			
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
//		if(opcao == "Conversor de Temperatura") {
			
			
//			case "Reais para Euros": {
//				String moed = JOptionPane.showInputDialog("Insira um");
//				double valor = Double.parseDouble(moed);
//				converter.ConverterReaisParaEuro(valor);
//				break;
//			}
			
			
		}}
    }

	


