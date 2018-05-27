import java.text.DecimalFormat;

public class QuadraticEquation {

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private double root1, root2, a, b, c, axis, discriminant, maxMinPoint;
	DecimalFormat df = new DecimalFormat("###,##0.####");
	
	public void solveEquation() {
		solvingRoots();
		solvingAxis();
		solvingDiscriminant();
		solvingMaxMinPoint();
	}

	public String solutionString() {
		return rootsString() + "\n" + 
			   axisString() + "\n" + 
			   maxMinPointString() + "\n" +
			   yInterceptString();
	}

	public void solvingRoots() {
		root1 = ((-1 * b + Math.sqrt(axis)) / (2 * a));
		root2 = ((-1 * b - Math.sqrt(axis)) / (2 * a));
	}

	public void solvingAxis() {
		axis = -b / 2 * a;
	}

	public void solvingDiscriminant() {
		discriminant = -1 * b / (2 * a);
	}

	public void solvingMaxMinPoint() {
		maxMinPoint = a * Math.pow(discriminant, 2) + b * discriminant + c;
	}

	@Override
    public String toString() {
		return df.format(a) + "x^2 + " + df.format(b) + "x + " + df.format(c);
	}

	public String rootsString() {
		if (axis < 0) {
			return "There are no roots";
		} else if (axis == 0) {
			return "The root is " + root1;
		} else if (axis > 0) {
			return "The two roots are " + root1 + " " + root2;
		}
		return "Roots error";
	}

	public String axisString() {
		return "The axis of symmetry is x = " + axis;
	}

	public String maxMinPointString() {
		if (a > 0) {
			return "The minimum point is: " + "(" + discriminant + "," + maxMinPoint + ")";
		} else {
			return "The maximum point is: " + "(" + discriminant + "," + maxMinPoint + ")";
		}

	}

	public String yInterceptString() {
		return "The y - intercept is " + c;
	}
}