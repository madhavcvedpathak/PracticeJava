package Arrays;
import java.util.Arrays;

public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 1, 0, 0, 1};
        // Saglya 0s la left la pathvaycha aani 1s la right la
        zeroOneAlagKar(array);
        // Final result print
        System.out.println("Alag Kelela Array: " + Arrays.toString(array));
    }

    public static void zeroOneAlagKar(int[] array) {
        int pehla = 0; // Suruvaticha index
        int endcha = array.length - 1; // Shevtacha index

        // Jo paryant pehla < endcha ahe to paryant loop
        while (pehla < endcha) {

            // pehla index var 0 asel tar to theek ahe, pudhe ja
            while (array[pehla] == 0 && pehla < endcha) {
                pehla++;
            }

            // endcha index var 1 asel tar to theek ahe, mag maghe ja
            while (array[endcha] == 1 && pehla < endcha) {
                endcha--;
            }

            // ata jar galat disla (1 left la aani 0 right la) tar swap karu
            if (pehla < endcha) {
                array[pehla] = 0;
                array[endcha] = 1;

                // Donhi index pudhe/maghe kar
                pehla++;
                endcha--;
            }
        }
    }
}

