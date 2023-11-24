import java.util.Scanner;
class ananass {
	public static void pause() {
		try {
			Thread.sleep(120);
		}catch(InterruptedException e){
			System.out.println("error");
		}
	}
	public static void fromStringToLetters(String input) {
		char letter;
		//input = input.replaceAll(" ","");
		//System.out.println(input);
		input = input.toUpperCase();
		for (int i = 0;i<input.length();i++) {
			letter = input.charAt(i);
				printLetter(letter);
		}
			
	}
	public static void printLetter(char letter) {
		switch (letter){
			case 'A':
				System.out.println("   ##   ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("  ####  ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println();
				break;
			case 'B':
				System.out.println("  ###   ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("  ###   ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("  ###   ");
				pause();
				System.out.println();
				break;
			case 'C':
				System.out.println("   ##   ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("  #     ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("   ##   ");
				pause();
				System.out.println();
				break;
			case 'D':
				System.out.println("  ####  ");
				pause();
				System.out.println("  #   # ");
				pause();
				System.out.println("  #   # ");
				pause();
				System.out.println("  #   # ");
				pause();
				System.out.println("  ###   ");
				pause();
				System.out.println();
				break;
			case 'E':
				System.out.println("  ####  ");
				pause();
				System.out.println("  #     ");
				pause();
				System.out.println("  ####  ");
				pause();
				System.out.println("  #     ");
				pause();
				System.out.println("  ####  ");
				pause();
				System.out.println();
				break;
			case 'F':
				System.out.println("  ####  ");
				pause();
				System.out.println("  #     ");
				pause();
				System.out.println("  ####  ");
				pause();
				System.out.println("  #     ");
				pause();
				System.out.println("  #     ");
				pause();
				System.out.println();
				break;
			case 'G':
				System.out.println("   ###  ");
				pause();
				System.out.println("  #     ");
				pause();
				System.out.println("  # ##  ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("   ###  ");
				pause();
				System.out.println();
				break;
			case 'H':
				System.out.println("  #  #  ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("  ####  ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println("  #  #  ");
				pause();
				System.out.println();
				break;
			case 'I':
				System.out.println("  ####  ");
				pause();
				System.out.println("   ##   ");
				pause();
				System.out.println("   ##   ");
				pause();
				System.out.println("   ##   ");
				pause();
				System.out.println("   ##   ");
				pause();
				System.out.println("  ####  ");
				pause();
				System.out.println();
				break;
			case 'J':
				System.out.println("      # ");
				pause();
				System.out.println("      # ");
				pause();
				System.out.println("      # ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println("  ####  ");
				pause();
				System.out.println();
				break;
			case 'K':
				System.out.println(" #    # ");
				pause();
				System.out.println(" #  #   ");
				pause();
				System.out.println(" ##     ");
				pause();
				System.out.println(" #  #   ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println();
				break;
			case 'L':
				System.out.println(" #      ");
				pause();
				System.out.println(" #      ");
				pause();
				System.out.println(" #      ");
				pause();
				System.out.println(" #      ");
				pause();
				System.out.println(" ###### ");
				pause();
				System.out.println();
				break;
			case 'M':
				System.out.println(" #    # ");
				pause();
				System.out.println(" ##  ## ");
				pause();
				System.out.println(" # ## # ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println();
				break;
			case 'N':
				System.out.println(" #    # ");
				pause();
				System.out.println(" ##   # ");
				pause();
				System.out.println(" # ## # ");
				pause();
				System.out.println(" #   ## ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println();
				break;
			case 'O':
				System.out.println("  ####  ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println("  ####  ");
				pause();
				System.out.println();
				break;
			case 'P':
				System.out.println(" #####  ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println(" #####  ");
				pause();
				System.out.println(" #      ");
				pause();
				System.out.println(" #      ");
				pause();
				System.out.println(" #      ");
				pause();
				System.out.println();
				break;
			case 'R':
				System.out.println(" #####  ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println(" #####  ");
				pause();
				System.out.println(" # #    ");
				pause();
				System.out.println(" #  #   ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println();
				break;
			case 'S':
				System.out.println("  ####  ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println("   #    ");
				pause();
				System.out.println("     #  ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println("  ####  ");
				pause();
				System.out.println();
				break;
			case 'T':
				System.out.println("########");
				pause();
				System.out.println("   ##   ");
				pause();
				System.out.println("   ##   ");
				pause();
				System.out.println("   ##   ");
				pause();
				System.out.println("   ##   ");
				pause();
				System.out.println("   ##   ");
				pause();
				System.out.println();
				break;
			case 'V':
				System.out.println("#       #");
				pause();
				System.out.println(" #     # ");
				pause();
				System.out.println("  #   #  ");
				pause();
				System.out.println("   # #   ");
				pause();
				System.out.println("    #    ");
				pause();
				System.out.println();
				break;
			case 'U':
				System.out.println(" #    # ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println(" #    # ");
				pause();
				System.out.println("  ####  ");
				pause();
				System.out.println();
				break;
			case 'Z':
				System.out.println("####### ");
				pause();
				System.out.println("     #  ");
				pause();
				System.out.println("   ##   ");
				pause();
				System.out.println("  #     ");
				pause();
				System.out.println(" #######");
				pause();
				System.out.println();
				break;
			default:
				System.out.println("\n");
				pause();
				System.out.println("\n");
				pause();
				break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		sc.close();
		fromStringToLetters(userInput);
	}

}

