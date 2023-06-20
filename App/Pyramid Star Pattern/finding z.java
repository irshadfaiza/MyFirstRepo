
import java.io.*;
public class Main {

static void findTwoNumbers(int X, int Y, int Z) {

	int A, B, C;
	A = B = C = 1;

	for (int i = 1; i <= X - 1; i++) {
	A = A * 10;
	}
	for (int i = 1; i <= Y - 1; i++) {
	B = B * 10;
	}
	for (int i = 1; i <= Z - 1; i++) {
	C = C * 10;
	}

	A = A + C;

	System.out.println("A = " + A + " B = " + B);
}


public static void main(String args[]) {
	int X = 2, Y = 3, Z = 1;
	findTwoNumbers(X, Y, Z);
}
}


