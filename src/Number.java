public class Number extends ArithmeticExp {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toStringRepresentation() {
        return Integer.toString(value);
    }
}