//U10416021 張馨容
import java.util.Scanner;
import java.math.BigDecimal;

public class TestAcNumber {
	//main class
	public static void main(String[] args){
		//create a scanner
		Scanner input = new Scanner(System.in);
		//let user to input two numbers and precision
		System.out.println("Please enter number1 ,number2 and the precision.");
		BigDecimal number1 = input.nextBigDecimal();
		BigDecimal number2 = input.nextBigDecimal();
		int pre = input.nextInt();
		//create a AcNumber and pass informations.
		AcNumber acn = new AcNumber(number1,number2,pre);
	}
}
