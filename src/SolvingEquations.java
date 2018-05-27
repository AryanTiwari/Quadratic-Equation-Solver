import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SolvingEquations {

	static Scanner input = new Scanner(System.in);
	public static DecimalFormat df = new DecimalFormat("###,###,###0.#######");

	public static void main(String[] args) {

		ArrayList<QuadraticEquation> equations = new ArrayList<QuadraticEquation>();

		for (int i = 0; i < 3; i++) {
			System.out.println("What are the new values for a, b, and c?");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();

			QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
			quadraticEquation.solveEquation();
			equations.add(quadraticEquation);
			System.out.println("The previous equations were: " + equations);

			System.out.println(quadraticEquation.solutionString());
		}
	}
}