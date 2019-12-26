package Binomial_distribution;

/**
 * Created by Aleksey Zaychenkov on 26.12.2019.
 */
public class Main {
    public static void main(String[] args) {
        long[] array = new long[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] =  MyBinomialDistribution.getBinomialRandom(3, 15, 0.7);
            System.out.println("array["+i+"]: "+ array[i]);
        }
        System.out.println(MyBinomialDistribution.isBinomialDistribution(array, 3, 15, 0.7));
    }
}
