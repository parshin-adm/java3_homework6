package homework6;

import java.util.Arrays;

public class MethodOne {

    public static void main(String[] args) {

//        int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
//
//        try {
//           int[] array2 = method(array);
//            System.out.println(Arrays.toString(array2));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
    public int[] method(int[] arrayIn) throws Exception {

        if(arrayIn == null) {
            return null;
        }
        if(arrayIn.length == 0) {
            return new int[0];
        }

        int countFour = 0;
        int indexFour = 0;
        for (int i = 0; i < arrayIn.length; i++) {
            if(arrayIn[i] == 4) {
                countFour++;
                indexFour = i;
            }
        }
//        System.out.println(countFour);
//        System.out.println(indexFour);
        if(countFour == 0) {
            throw new Exception();
        }
        int sizeArrayOut = arrayIn.length - indexFour - 1;
        int[] arrayOut = new int[sizeArrayOut];
        for (int i = 0; i < sizeArrayOut; i++) {
            arrayOut[i] = arrayIn[indexFour + 1 + i];
        }

        return arrayOut;
    }
}
