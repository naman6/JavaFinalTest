public class Main {
    public static void main(String[] args) {
        ArithmeticExp term = new Sum(
                new Number(3),
                new Product(new Number(2), new Number(5)));
        System.out.println("Expression: " + term.toStringRepresentation());
        System.out.println("Result: " + evaluate(term));

        ArithmeticExp moduloTerm = new Modulo(
                new Number(15),
                new Number(7)
        );System.out.println("Expression: " + moduloTerm.toStringRepresentation());
        System.out.println("Result: " + evaluate(moduloTerm));
    }






    public static int evaluate(ArithmeticExp term) {
        return term.evaluate();
    }
}
