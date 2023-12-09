public class Product extends Binary {
    public Product(ArithmeticExp left, ArithmeticExp right) {
        super(left, right, "*");}

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
