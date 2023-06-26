package org.example;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task2 {

    public static int[] subtractArrays(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) throw new RuntimeException("Разная длинна массивов!");
        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i] - secondArray[i];
        }
        return resultArr;
    }
}
