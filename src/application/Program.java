// when the program is not treated, the program will end and
// will show in console which error has occured

package application;

// import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();


		System.out.println("End of program");

	}

	public static void method1() {
		System.out.println("***METHOD1 START***");
		
		method2();
		
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

//		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
/*		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace(); // print the sequence of methods which cause the exception
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
*/		sc.close();
		System.out.println("***METHOD2 END***");
	}

}
