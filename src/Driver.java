public class Driver {

    public static void main(String[] args) {

        Exponentiation exp = new Exponentiation();

        double base = 3.0;
        int exponent = 15;

        double result = exp.binaryExponentiation(base, exponent);
        double correctResult = Math.pow(base, exponent);

        int numberOfMultiplications = exp.binaryMultiplicationCount(exponent);

        System.out.println("Result: " + result + " (Correct result = "+ correctResult + ")");
        System.out.println("Number of multiplications needed: " + numberOfMultiplications);

    }

}