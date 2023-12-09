class Number extends ArithmeticExp {
    private int value;
    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}

abstract class Binary extends ArithmeticExp {
    protected ArithmeticExp left;
    protected ArithmeticExp right;

    public Binary(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }
}

class Sum extends Binary {
    public Sum(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }
    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}

class Product extends Binary {
    public Product(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }@Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}

public class Main {
    public static void main(String[] args) {
        ArithmeticExp term = new Sum(
                new Number(3),
                new Product(new Number(2), new Number(5))
        );

        System.out.println(evaluate(term));
    }

    public static int evaluate(ArithmeticExp term) {
        return term.evaluate();
    }
}
