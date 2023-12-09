public class Modulo extends Binary {
    public Modulo(ArithmeticExp left, ArithmeticExp right) {
        super(left, right, "%");
    }
    @Override
    public int evaluate() {
        int rightValue = right.evaluate();
        if (rightValue == 0) {
            throw new ArithmeticException("Cannot perform modulo by zero.");
        }
        return left.evaluate() % rightValue;
    }
}
