public class ExceptionHandling {

	public static void main(String[] args) {
		int a = 1;
		ExceptionHandling eh = new ExceptionHandling();
		eh.get_volume(a);

		String s = "11";
		eh.fun(s);

		int n = 11;
		int p = 3;
		Calculator myCalculator = new Calculator();
		try {
			int ans = myCalculator.power(n, p);
			System.out.println(ans);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public double get_volume(int a) {
		if (a < 0) {
			throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
		}
		return a * a * a;
	}

	static void fun(String s) {
		Integer i = null;
		try {
			i = Integer.valueOf(s);
		} catch (NumberFormatException e) {
			System.out.println("Caught inside fun().");
			throw e; // rethrowing the exception
		}
		if (i != null)
			System.out.println(i);
	}

}

class Calculator {
	protected int power(int n, int p) {
		if (n < 0 || p < 0) {
			throw new IllegalArgumentException("n and p should be non-negative");
		} else
			return (int) Math.pow(n, p);
	}
}
