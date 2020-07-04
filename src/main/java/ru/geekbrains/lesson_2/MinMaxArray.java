package ru.geekbrains.lesson_2;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] array = {25, 54, 5, 79, 125, 2, 12};
        int min = getMin(array);
        int max = getMax(array);
        System.out.println("Minimum " + min);
        System.out.println("Maximum " + max);

    }
    public static int getMin (int[] inputArr){
        int min = inputArr[0];
        for (int i = 0; i < inputArr.length; i++){
            if (inputArr[i] < min){
                min = inputArr[i];
            }
        }
        return min;
    }
    public static int getMax (int[] inputArr){
        int max = inputArr[0];
        for (int i = 0; i < inputArr.length; i++){
            if (inputArr[i] > max){
                max = inputArr[i];
            }
        }
        return max;
    }

}
