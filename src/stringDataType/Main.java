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
			System.out.println("Condi��o � TRUE !");
			System.out.println("Teste da segunda condi��o !");
		}
		else {
			System.out.println("A condi��o � FALSE !");
		}
		
		
		int topScore = 100;
		
		if (topScore < 100) {
			System.out.println("O TopScore n�o permitido para esta a��o !");
		} else {
			System.out.println("O TopScore � permitido para esta a��o !");
		}
		
		int newValue = 10;
		if (newValue ==10) {
			System.out.println("Valor � 10 !");
		} else {
			System.out.println("O valor � diferente de 10.");
		}
		
		
		boolean isCar = true;
		if (isCar == true) {
			System.out.println("Este ve�culo � um carro.");
		} else {
			System.out.println("Este ve�culo n�o � um carro.");
		}
			
		
			
	}
}