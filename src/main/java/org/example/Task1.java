package org.example;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task1 {

    // Деление на 0
    public static void division(double firstNum, double secondNum){
        if(secondNum ==  0) throw new ArithmeticException("На ноль делить нельзя!");
        double result = firstNum/secondNum;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
    }
    // Выход за пределы массива
    public static void printValueByIndex(int[] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

    //Ссылка на объект, имеющий нулевое значение
    public static void printStringArray(String[] stringArray){
        for (String item: stringArray){
            if(item == null) throw new NullPointerException("Такого элемента нет");
            System.out.println(item);
        }
    }
}
