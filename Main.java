public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

// Expression 1: (3 * 4 + 5 * 7)^2
int expr1 = calculator.square(
  calc.add(calc.multiply(3, 4),calc.multiply(5, 7))
  );

// Expression 2: (4 + 7)^2 + (8 + 3)^2
int expr2 = calculator.add(
calc.square(calc.add(4, 7)),calc.square(calc.add(8, 3))
);

System.out.println("Result of Expression 1: " + expr1);
System.out.println("Result of Expression 2: " + expr2);
    }
}
