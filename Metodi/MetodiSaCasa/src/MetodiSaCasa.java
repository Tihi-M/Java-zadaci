//import java.util.Scanner;
public class MetodiSaCasa {
	public static void printPyramid(int n) {
		int i =1;
		int j =1;
		while (i <= n) {
		        while (j <= (n*2-1)){
		          if ((j == i) || (j == n*2-1)) {
		            System.out.print(' ');
		          }
		            else
		            System.out.print('1');
		          j = j + 1;
		        }
		        System.out.print("\n");
		        //firstPos := firstPos + 1;
		        //lastPos := lastPos - 1;
		        i=i+1;
		        j=1;
		        }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPyramid(5);
	}

}
