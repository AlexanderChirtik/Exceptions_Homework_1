package org.example;

public class Task3 {

    public static int[] divideArrays(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null) throw new RuntimeException("Массивы не заданы!");
        if(firstArray.length != secondArray.length) throw new RuntimeException("Разная длинна массивов!");

        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i]/secondArray[i];
        }
        return resultArr;
    }
}
