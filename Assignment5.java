import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		
		writeNums(5);
		System.out.println();
		
		writeNums(12);
		System.out.println();
		
	}
	
	public static void writeNums(int n) {
		if  (n < 1) {
			throw new IllegalArgumentException();
		} else if (n <= 1) {
			System.out.print(n);
		} else {
			writeNums(n-1);
			System.out.print(", " + n);
		}
	}

}
