//U10416021 張馨容
import java.math.*;

public class AcNumber {
	//data field
	BigDecimal n1,n2,ad,sub,mul,div;
	int p;
	//constuctor
	AcNumber(BigDecimal number1,BigDecimal number2,int pre){
		n1 = number1;
		n2 = number2;
		p = pre;
		//add
		ad = n1.add(n2);
		System.out.println("number1 + number2 is " + ad);
		//subtract
		sub = n1.subtract(n2);
		System.out.println("number1 - number2 is " + sub);
		//multiply with precision which user entered.
		MathContext mc = new MathContext(p);
		mul = n1.multiply(n2,mc);
		System.out.println("number1 x number2 is " + mul);
		//divide with precision which user entered.
		div = n1.divide(n2, p, RoundingMode.CEILING);
		System.out.println("number1 / number2 is " + div);
	}
}