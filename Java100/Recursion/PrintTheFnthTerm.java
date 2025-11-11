package Java100.Recursion;

public class PrintTheFnthTerm {
    public static void main (String args[])
    {
        int n = 3;
        System.out.println (term (1, 1, n));
    }

//    static int term (int calculated, int current, int N)
//    {
//        int i, cur = 1; // Base Condition
//        if (current == N + 1)
//            return 0;
//        for (i = calculated; i < calculated + current; i++) // product of terms till current
//            cur *= i;
//        return cur + term (i, current + 1, N);
//    }


    static int term (int calculated, int current, int N)
    {
        int i, result = 0;
        while (current != N + 1)
        {
            int cur = 1;
            for (i = calculated; i < calculated + current; i++) // product of terms till current
                cur *= i;
            calculated = i;
            result += cur;
            current++;
        }
        return result;
    }



}
