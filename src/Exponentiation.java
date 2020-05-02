import java.util.ArrayList;

public class Exponentiation{

    public int binaryMultiplicationCount(int exponent) {
        String binary = Integer.toBinaryString(exponent);
        int count = binary.length() - 1;
        for (char ch: binary.toCharArray()) {
            if (ch == '1') {
                count++;
            }
        }
        return count - 1;
    }

    public double binaryExponentiation(double x, int exponent) {
        String binary = Integer.toBinaryString(exponent);
        char[] binArr = binary.toCharArray();
        double[] multiples = new double[binArr.length];
        multiples[0] = x;
        for (int i = 1; i < binArr.length; i++) {
            multiples[i] = multiples[i-1]*multiples[i-1];
        }
        ArrayList<Double> neededMultiples = new ArrayList<Double>();
        for (int i = 0; i < multiples.length; i++) {
            if (binArr[i] == '1') {
                neededMultiples.add(multiples[i]);
            }
        }
        double result = neededMultiples.get(0);
        for (int i = 1; i < neededMultiples.size(); i++) {
            result *= neededMultiples.get(i);
        }
        return result;
    }
}