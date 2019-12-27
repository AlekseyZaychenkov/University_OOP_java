package Binomial_distribution;

import org.apache.commons.math3.distribution.BinomialDistribution;

import java.util.Random;

/**
 * Created by Aleksey Zaychenkov on 26.12.2019.
 */
public class MyBinomialDistribution {

    static int getBinomialRandom(int n, int k, double pSuccess){
        BinomialDistribution binomialDistribution = new BinomialDistribution(n, pSuccess);


        Random r = new Random();
        double L = Math.exp(-pSuccess);
        double p = binomialDistribution.getProbabilityOfSuccess();

        do {
            p = p * r.nextDouble();
            k++;
        } while (p > L);
        return k - 1;


    }




    static boolean isEqual(double x, double y, double eps) {
        return Math.abs(x - y) < eps;
    }

    static boolean isBinomialDistribution(long[] arr, int n, int k, double pSuccess) {
        double sum = 0, sum2 = 0, mx, dx;

        for (int i = 0; i < arr.length; i++) {
            if (binomialProbability(n, k, pSuccess) >= pSuccess)
                sum++;
        }

        sum =  sum  / arr.length;
        mx = Math.round(sum);
        sum2 = sum2 / arr.length;
        dx = Math.round(sum2 - sum * sum);

        System.out.println(mx);
        System.out.println(dx);

        if (sum > sum2) {
            return true;
        }



        return false;
    }





    // function to calculate nCr i.e., number of
    // ways to choose r out of n objects
    static int nCr(int n, int r)
    {
        // Since nCr is same as nC(n-r)
        // To decrease number of iterations
        if (r > n / 2)
            r = n - r;

        int answer = 1;
        for (int i = 1; i <= r; i++) {
            answer *= (n - r + i);
            answer /= i;
        }

        return answer;
    }

    // function to calculate binomial r.v. probability
    static double binomialProbability(int n, int k, double p) {
        return nCr(n, k) * (double)Math.pow(p, k) *
                (double)Math.pow(1 - p, n - k);
    }
}

