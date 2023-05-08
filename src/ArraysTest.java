import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

         //double[] marks = new double[10];

        //System.out.println(Arrays.toString(marks));
        //for(int a: marks){
        //    System.out.println(a);
        //}

        //int[] array = {1,2,3,4,5};
        //System.out.println(Arrays.toString(array));

        //int[] array = new int[5];
        //array[0]=4;
        //array[3]=7;
        //array[2]=1;
        //System.out.println(Arrays.toString(array));


        //int[] number = new int[]{4,5,8};
        //System.out.println(number[2]);

        //Int[][][] a= new int[2][][];

//        x[0] = new int[3][];
  //      x[0][0] = new int[3];
    //    x[0][1]=new int[2];
      //  X[0][1] = new int[1];
//
//        Int[0][1] = new int[2][2];

        int[][] x=new int[3][2];
        System.out.println(x[0].length);
        x[0] = new int[4];
        System.out.println(x[0].length);


        x[0]= new int[]{2,3,4,5,6,7,8};
        x[1]= new int[]{2,3,4,5,6,7,8};
        x[2]= new int[]{2,3,4,5,6,7,8};

        System.out.println(x[0].length );

    }
}