package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 43, 54, 25, 74, 3, 56, 7, 4, 1};
        ArrayUtil au = new ArrayUtil();
        au.maxOfArray(array);
        au.minOfArray(array);
        au.evenNum(array);
        au.oddNum(array);
        au.numOfEvenNum(array);
        au.numOfOddNum(array);
        au.arithmeticAverage(array);
        au.sumOfElementArray(array);
        au.firstNumInArray(array);
        au.lastNumInArray(array);
        au.middleNumInArray(array);
    }
}
