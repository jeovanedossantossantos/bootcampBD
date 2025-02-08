/**
 * A simple calculator class.
 * <p>
 * This class provides methods to set and get two numbers, and to sum them.
 * </p>
 * 
 * <pre>
 * Example usage:
 * Calc calc = new Calc();
 * calc.setNum1(5);
 * calc.setNum2(10);
 * int result = calc.somar(); // result is 15
 * </pre>
 * 
 * @see java.lang.Math
 * @since 1.0
 */
public class Calc {
    private int num1;
    private int num2;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    /**
     * Gets the first number.
     * 
     * @return the first number
     * @since 1.0
     */
    public int getNum1() {
        return num1;
    }

    /**
     * Sets the first number.
     * 
     * @param num1 the first number to set
     * @since 1.0
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * Gets the second number.
     * 
     * @return the second number
     * @since 1.0
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Sets the second number.
     * 
     * @param num2 the second number to set
     * @since 1.0
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * Sums the two numbers.
     * 
     * @return the sum of num1 and num2
     * @since 1.0
     */
    public int somar() {
        return num1 + num2;
    }
}
