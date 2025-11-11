package MultiDimensionalArrays;

public class InstantInitialise {
    public static void main(String[] args) {
//        int[][] Man = {{1,2,3},{2,4,5,6},{3,4,5,5}};//Jagged Array

        int[][] Man = {{1,2,3},{2,4,5,6},{3,4,5,5}};
//        for (int i = 0; i < Man.length; i++) {
//            for (int j = 0; j < Man[i].length; j++) {
//                System.out.print(Man[i][j] + " ");
//            }
//            System.out.println(); // New line after each row
//        }


        int m = Man.length, n = Man[0].length;
        for (int[] arr1D : Man){
            for (int ele : arr1D){
                System.out.print(ele+" ");
            }
            System.out.println();
        }




    }
}

