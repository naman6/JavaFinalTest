public abstract class Binary extends ArithmeticExp {
    protected ArithmeticExp left;
    protected ArithmeticExp right;
    private String operator;

    public Binary(ArithmeticExp left, ArithmeticExp right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toStringRepresentation() {
        return "(" + left.toStringRepresentation() + " " + operator + " " + right.toStringRepresentation() + ")";
    }
}
