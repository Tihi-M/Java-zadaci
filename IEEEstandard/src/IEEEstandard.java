import java.util.Scanner;
public class IEEEstandard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite zeljeni broj u dekadnom sistemu: ");
		float userInput = sc.nextFloat();
		sc.close();
		int signBit;
		if (userInput > 0) {
			signBit = 0;
		}
		else {
			signBit = 1;
			userInput = -1 * userInput;
		}
		int wholePartInput = (int)userInput;
		float decimalPart = userInput - wholePartInput;
		//System.out.println(wholePartInput);
		//System.out.println(decimalPart);
	
	String wholePartBin = "";
	while(wholePartInput >= 1) {
		if(wholePartInput % 2 == 0) {
			wholePartBin = wholePartBin.concat("0");
		}
		else {
			wholePartBin = wholePartBin.concat("1");
		}
		wholePartInput /= 2;
	}
	String reversedWholePart="";
	int exponent =0;
	for(int i = 0;i< wholePartBin.length();i++) {
		reversedWholePart = wholePartBin.charAt(i)+reversedWholePart;
		exponent = i;
	}
	//System.out.println(reversedWholePart);
	
	String decimalPartBin = "";
	while(decimalPart >0) {
		decimalPart *= 2;
		if(decimalPart >= 1) {
			decimalPartBin = decimalPartBin.concat("1");
			decimalPart = decimalPart-1;
		}
		else {
			decimalPartBin = decimalPartBin.concat("0");
		}
		
	}
	
	//System.out.println(decimalPartBin);
	
	exponent+=127;
	String exp="";
	String reversedExp="";
	while(exponent >= 1) {
		if(exponent % 2 == 0) {
			exp = exp.concat("0");
		}
		else {
			exp = exp.concat("1");
		}
		exponent /= 2;
	}
	
	for(int i = 0;i< exp.length();i++) {
		reversedExp = exp.charAt(i)+reversedExp;
	}
	//System.out.println(reversedExp);
	String userInputIEEE = signBit+" "+reversedExp +" "+ reversedWholePart.substring(1) +decimalPartBin;
	System.out.println("Vas broj u IEEE 754 formi je:");
	int leftOutZeros = 24-reversedWholePart.length()-decimalPartBin.length();
	String zeros ="";
	while(leftOutZeros > 0) {
		zeros = zeros.concat("0");
		leftOutZeros--;
	}
	System.out.println(userInputIEEE+zeros);
	}}