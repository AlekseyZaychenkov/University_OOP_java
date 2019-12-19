package Normal_spreading;

/**
 * Created by Aleksey Zaychenkov on 20.12.2019.
 */
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args){

        double value = 0.0;
        int[] counters = new int[10];  // массив счетчиков


/// ===================== для 1000 случайных значений =====================
        for (int i = 0; i < 10; i++) { // обнуление массива в цикле
            counters[i] = 0;
        }
        for (int i = 0; i < 1000; i++) {
            value = Math.random();

            if (0 <= value && value < 0.1) {
                counters[0] = counters[0] + 1;
            } else if (0.1 <= value && value < 0.2) {
                counters[1]++;
            } else if (0.2 <= value && value < 0.3) {
                counters[2]++;
            } else if (0.3 <= value && value < 0.4) {
                counters[3]++;
            } else if (0.4 <= value && value < 0.5) {
                counters[4]++;
            } else if (0.5 <= value && value < 0.6) {
                counters[5]++;
            } else if (0.6 <= value && value < 0.7) {
                counters[6]++;
            } else if (0.7 <= value && value < 0.8) {
                counters[7]++;
            } else if (0.8 <= value && value < 0.9) {
                counters[8]++;
            } else if (0.9 <= value && value < 1.0) {
                counters[9]++;
            } else {
                System.out.println("Bad value");
            }
        }

        System.out.println("   OUT OF " + IntStream.of(counters).sum() + " TOTAL VALUES:");
        System.out.println("0.0 <= values < 0.1 total:" + counters[0]);
        System.out.println("0.1 <= values < 0.2 total:" + counters[1]);
        System.out.println("0.2 <= values < 0.3 total:" + counters[2]);
        System.out.println("0.3 <= values < 0.4 total:" + counters[3]);
        System.out.println("0.4 <= values < 0.5 total:" + counters[4]);
        System.out.println("0.5 <= values < 0.6 total:" + counters[5]);
        System.out.println("0.6 <= values < 0.7 total:" + counters[6]);
        System.out.println("0.7 <= values < 0.8 total:" + counters[7]);
        System.out.println("0.8 <= values < 0.9 total:" + counters[8]);
        System.out.println("0.9 <= values < 1.0 total:" + counters[9]);
        System.out.println();



/// ===================== для 10000 случайных значений =====================
        for (int i = 0; i < 10; i++) { // обнуление массива в цикле
            counters[i] = 0;
        }
        for (int i = 0; i < 10000; i++) {
            value = Math.random();

            if (0 <= value && value < 0.1) {
                counters[0] = counters[0] + 1;
            } else if (0.1 <= value && value < 0.2) {
                counters[1]++;
            } else if (0.2 <= value && value < 0.3) {
                counters[2]++;
            } else if (0.3 <= value && value < 0.4) {
                counters[3]++;
            } else if (0.4 <= value && value < 0.5) {
                counters[4]++;
            } else if (0.5 <= value && value < 0.6) {
                counters[5]++;
            } else if (0.6 <= value && value < 0.7) {
                counters[6]++;
            } else if (0.7 <= value && value < 0.8) {
                counters[7]++;
            } else if (0.8 <= value && value < 0.9) {
                counters[8]++;
            } else if (0.9 <= value && value < 1.0) {
                counters[9]++;
            } else {
                System.out.println("Bad value");
            }
        }

        System.out.println("   OUT OF " + IntStream.of(counters).sum() + " TOTAL VALUES:");
        System.out.println("0.0 <= values < 0.1 total:" + counters[0]);
        System.out.println("0.1 <= values < 0.2 total:" + counters[1]);
        System.out.println("0.2 <= values < 0.3 total:" + counters[2]);
        System.out.println("0.3 <= values < 0.4 total:" + counters[3]);
        System.out.println("0.4 <= values < 0.5 total:" + counters[4]);
        System.out.println("0.5 <= values < 0.6 total:" + counters[5]);
        System.out.println("0.6 <= values < 0.7 total:" + counters[6]);
        System.out.println("0.7 <= values < 0.8 total:" + counters[7]);
        System.out.println("0.8 <= values < 0.9 total:" + counters[8]);
        System.out.println("0.9 <= values < 1.0 total:" + counters[9]);
        System.out.println();



/// ===================== для 10000000 случайных значений =====================
        for (int i = 0; i < 10; i++) { // обнуление массива в цикле
            counters[i] = 0;
        }
        for (int i = 0; i < 10000000; i++) {  // для 10000000 случайных значений
            value = Math.random();

            if (0 <= value && value < 0.1) {
                counters[0] = counters[0] + 1;
            } else if (0.1 <= value && value < 0.2) {
                counters[1]++;
            } else if (0.2 <= value && value < 0.3) {
                counters[2]++;
            } else if (0.3 <= value && value < 0.4) {
                counters[3]++;
            } else if (0.4 <= value && value < 0.5) {
                counters[4]++;
            } else if (0.5 <= value && value < 0.6) {
                counters[5]++;
            } else if (0.6 <= value && value < 0.7) {
                counters[6]++;
            } else if (0.7 <= value && value < 0.8) {
                counters[7]++;
            } else if (0.8 <= value && value < 0.9) {
                counters[8]++;
            } else if (0.9 <= value && value < 1.0) {
                counters[9]++;
            } else {
                System.out.println("Bad value");
            }
        }

        System.out.println("   OUT OF " + IntStream.of(counters).sum() + " TOTAL VALUES:");
        System.out.println("0.0 <= values < 0.1 total:" + counters[0]);
        System.out.println("0.1 <= values < 0.2 total:" + counters[1]);
        System.out.println("0.2 <= values < 0.3 total:" + counters[2]);
        System.out.println("0.3 <= values < 0.4 total:" + counters[3]);
        System.out.println("0.4 <= values < 0.5 total:" + counters[4]);
        System.out.println("0.5 <= values < 0.6 total:" + counters[5]);
        System.out.println("0.6 <= values < 0.7 total:" + counters[6]);
        System.out.println("0.7 <= values < 0.8 total:" + counters[7]);
        System.out.println("0.8 <= values < 0.9 total:" + counters[8]);
        System.out.println("0.9 <= values < 1.0 total:" + counters[9]);
        System.out.println();




/// ===================== для 10000 Rx и Ry случайных значений =====================
        int[] countersBelow = new int[10];
        int[] countersAbove = new int[10];

        double Rx = 0.0;
        double Ry = 0.0;

        double[] RxArray = new double[10000];
        double[] RyArray = new double[10000];
        for (int i = 0; i < 10; i++) { // обнуление массива в цикле
            countersAbove[i] = 0;
            countersBelow[i] = 0;
        }
        for (int i = 0; i < 10000; i++) {  // для 10000000 случайных значений
            Rx = Math.random();
            Ry = Math.random();
            RxArray[i] = Rx;            // Rx сохранение для построение графика
            RyArray[i] = Ry;            // Ry сохранение для построение графика
            if (0 <= Rx && Rx < 0.1) {
                if (Ry > 2 * Rx)  // условие прохождения над линией в первой половине графика
                    countersAbove[0]++;
                else
                    countersBelow[0]++;
            } else if (0.1 <= Rx && Rx < 0.2) {
                if (Ry > 2 * Rx)  // условие прохождения над линией в первой половине графика
                    countersAbove[1]++;
                else
                    countersBelow[1]++;
            } else if (0.2 <= Rx && Rx < 0.3) {
                if (Ry > 2 * Rx)  // условие прохождения над линией в первой половине графика
                    countersAbove[2]++;
                else
                    countersBelow[2]++;
            } else if (0.3 <= Rx && Rx < 0.4) {
                if (Ry > 2 * Rx)  // условие прохождения над линией в первой половине графика
                    countersAbove[3]++;
                else
                    countersBelow[3]++;
            } else if (0.4 <= Rx && Rx < 0.5) {
                if (Ry > 2 * Rx)  // условие прохождения над линией в первой половине графика
                    countersAbove[4]++;
                else
                    countersBelow[4]++;


            } else if (0.5 <= Rx && Rx < 0.6) {
                if (Ry > 2 *(1 -  Rx))  // условие прохождения над линией во второй половине графика
                    countersAbove[5]++;
                else
                    countersBelow[5]++;
            } else if (0.6 <= Rx && Rx < 0.7) {
                if (Ry > 2 * (1 - Rx))  // условие прохождения над линией во второй половине графика
                    countersAbove[6]++;
                else
                    countersBelow[6]++;
            } else if (0.7 <= Rx && Rx < 0.8) {
                if (Ry > 2 * (1 - Rx))  // условие прохождения над линией во второй половине графика
                    countersAbove[7]++;
                else
                    countersBelow[7]++;
            } else if (0.8 <= Rx && Rx < 0.9) {
                if (Ry > 2 * (1 - Rx))  // условие прохождения над линией во второй половине графика
                    countersAbove[8]++;
                else
                    countersBelow[8]++;
            } else if (0.9 <= Rx && Rx < 1.0) {
                if (Ry > 2 * (1 - Rx))  // условие прохождения над линией во второй половине графика
                    countersAbove[9]++;
                else
                    countersBelow[9]++;
            } else {
                System.out.println("Bad value");
            }
        }




// ===================== вывод сумм Rx и Ry по участкам =====================
        //
        System.out.println("   OUT OF " + (IntStream.of(countersAbove).sum()+IntStream.of(countersBelow).sum()) + " TOTAL VALUES:");
        System.out.println("   ValuesAbove :");
        System.out.println(countersAbove[0]);
        System.out.println(countersAbove[1]);
        System.out.println(countersAbove[2]);
        System.out.println(countersAbove[3]);
        System.out.println(countersAbove[4]);
        System.out.println(countersAbove[5]);
        System.out.println(countersAbove[6]);
        System.out.println(countersAbove[7]);
        System.out.println(countersAbove[8]);
        System.out.println(countersAbove[9]);
        System.out.println("Total: "+IntStream.of(countersAbove).sum());
        System.out.println("      ");
        System.out.println("   ValuesBelow :");
        System.out.println(countersBelow[0]);
        System.out.println(countersBelow[1]);
        System.out.println(countersBelow[2]);
        System.out.println(countersBelow[3]);
        System.out.println(countersBelow[4]);
        System.out.println(countersBelow[5]);
        System.out.println(countersBelow[6]);
        System.out.println(countersBelow[7]);
        System.out.println(countersBelow[8]);
        System.out.println(countersBelow[9]);
        System.out.println("Total: "+IntStream.of(countersBelow).sum());
        System.out.println("      ");
        System.out.println();

    }
}
