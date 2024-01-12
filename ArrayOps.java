public class ArrayOps {
    public static void main(String[] args) {
        int[] a = {1, 3, 3, 4};
        System.out.println(isSorted(a));
    }

     public static int findMissingInt (int [] array) {
        int arrayLength = array.length;
        int arrSum = 0;
        int expectedSum = 0;
        for (int i = 0 ; i <= arrayLength ; i++){
            expectedSum = expectedSum + i;
        }
        for (int j = 0 ; j < arrayLength ; j++){
            arrSum = arrSum + array[j];
        }
        int missintInt = expectedSum - arrSum; 
        return missintInt;
    }

    

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        int max2 = min;
        for (int i = 1; i < array.length; i++) {
            if ((array[i] > max2) && (array[i] != max)) {
                max2 = array[i];
            }
        }
        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean sameElements1 = sameElements(array1, array2);
        boolean sameElements2 = sameElements(array2,array1);
        if (sameElements1 && sameElements2){
            return true;
        }
        return false;
    }
    public  static boolean sameElements(int [] array1,int [] array2){
        boolean sameNums = false;

        for (int i = 0 ; i < array1.length; i++){
            sameNums=false;
            for (int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    sameNums = true;
                    break;
                }
            }

            if(!sameNums){
                return false;
            }
        }
        return true;
    }


    public static boolean isSorted(int [] array) {
        if (isDecreasing(array) || isIncreasing(array)) {
            return true;
        }
        return false;
    }

    public static boolean isIncreasing(int [] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int [] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
