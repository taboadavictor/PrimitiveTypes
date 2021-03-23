package stringDataType;

public class Main {

	public static void main(String[] args) {
		
		String myString = "Test String";
		System.out.println(myString);
		myString = myString + ", more words in the text ";
		System.out.println(myString);
		myString = myString + "Copyright " + "\u00A9";
		System.out.println(myString);
		
		
		boolean verificaBoolean = true;
		if (verificaBoolean == true) {
			System.out.println("Condição é TRUE !");
			System.out.println("Teste da segunda condição !");
		}
		else {
			System.out.println("A condição é FALSE !");
		}
		
		
		int topScore = 100;
		
		if (topScore < 100) {
			System.out.println("O TopScore não permitido para esta ação !");
		} else {
			System.out.println("O TopScore é permitido para esta ação !");
		}
		
		int newValue = 10;
		if (newValue ==10) {
			System.out.println("Valor é 10 !");
		} else {
			System.out.println("O valor é diferente de 10.");
		}
		
		
		boolean isCar = true;
		if (isCar == true) {
			System.out.println("Este veículo é um carro.");
		} else {
			System.out.println("Este veículo não é um carro.");
		}
			
		
			
	}
}