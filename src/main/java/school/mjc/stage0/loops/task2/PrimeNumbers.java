package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int i = 1;
        int k = 1; //variable
        int n = 0; // amount og dividers
        while(i <= printToInclusive)
        {
            while(k != i)
            {
                if (i % k == 0 )
                {
                    n++;
                }
                k++;
            }
            if (n == 2) System.out.println(i);
            i++; n = 0; k = 1;
        }
    }
}
