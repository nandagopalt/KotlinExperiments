package Logical;

public class Power {

    public static void main(String args[]) {
        // Power power = new Power();
        // double result = power.pow(5, 3);
        // double result1 = Math.pow(5, 3);

        PowInterface pow = (int baseValue, int poweringFactor) -> {
            int value = baseValue;
            for (int i = 1; i < poweringFactor; i++) {
                value = value * baseValue;
            }
            return (double) value;
        };
        System.out.println(pow.pow(5, 5));
        System.out.println(Math.pow(5, 5));

        //System.out.print(result + "," + result1);
    }

    /*private double pow(int baseValue, int poweringValue) {
        int result = baseValue;
        for (int i = 1; i < poweringValue; i++) {
            result = result * baseValue;
        }
        return result;
    }*/

    // pow(2,3)
    // 2 * 2 * 2
    // i = 1 -> 2 * 2 = 4
    // i = 2 -> 4 * 2 = 8
    // i = 3 -> 8 * 2 = 16

}
