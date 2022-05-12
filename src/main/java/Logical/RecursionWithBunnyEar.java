package Logical;

public class RecursionWithBunnyEar {
    public static void main(String[] args) {
        RecursionWithBunnyEar bunnyEar = new RecursionWithBunnyEar();
        int numberOfEar = bunnyEar.bunnyEars2(10);
        System.out.println(numberOfEar);
    }

    public int bunnyEars2(int bunnies) {
        boolean isEvenBunny = bunnies % 2 == 0;
        if (bunnies == 0) {
            return 0;
        } else if (bunnies == 1) {
            return 2;
        } else {
            if (!isEvenBunny) {
                return 2 + bunnyEars2(bunnies - 1);
            }
            return 3 + bunnyEars2(bunnies - 1);
        }
    }
}

