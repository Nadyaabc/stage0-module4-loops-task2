package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int k = 1;
        int result = 1;
        if (printToInclusive == 0) System.out.println(1);
        else {
            System.out.println(1);
            while (i <= printToInclusive) {
                while (k <= i) {
                    result *= k;
                    k++;
                }
                k = 1;
                System.out.println(result);
                i++; result = 1;
            }
        }
    }
}
