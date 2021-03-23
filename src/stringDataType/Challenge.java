package stringDataType;

public class Challenge {

	public static void main(String[] args) {
		
		
		double firstVar = 20.00d;
		double secondVar = 80.00d;
		
		double thirdVar = (firstVar + secondVar ) * 100.00d;
		double restVar = thirdVar % 40.00d;
		
		if (restVar == 0.00d) {
			boolean restVarBoolean = true;
			System.out.println(restVarBoolean);
		} else {
			boolean restVarBoolean = false;
			System.out.println(restVarBoolean);
			
			if (restVarBoolean == false ) {
				System.out.println("O resto da operação que foi feita é : " + restVar);
			}
		}

			
	}
}