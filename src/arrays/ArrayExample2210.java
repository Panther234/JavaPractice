package arrays;

public class ArrayExample2210 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(a[2]);
//                       (row0)      (row 1)
        int[][] b = {{12,22,33,44},{10,20,30,40}};
        System.out.println(b[1][3] +" "+ b[0][0]);

        for(int i=0; i< b.length; i++){
            for(int j=0; j<b[i].length; j++){
                System.out.print(",");
                System.out.println(b[i][j]);
            }
        }
    }
}
