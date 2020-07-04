package ru.geekbrains.lesson_2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main_APP {

    public static void main(String[] args) {
        invertArray();
        numArray();
        changeArray();
        fillDiagonal();
        getMinMaxArray();
        System.out.println(checkBalance());
        changePartArray();
    }
    public static void invertArray() {
        System.out.println("Task_1");
        int[] arr = {0, 1, 0, 0, 0, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
    }
    public static void numArray() {
        System.out.println(" ");
        System.out.println("Task_2");
        int[] numArr = new int[8];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i * 3;
            System.out.print(numArr[i] + " ");
        }
    }
    public static void changeArray() {
        System.out.println(" ");
        System.out.println("Task_3");
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
            System.out.print(w[i] + " ");
        }
    }
    public static void fillDiagonal() {
        System.out.println(" ");
        System.out.println("Task_4");
        int[][] sqrArr = new int[5][5];
        for (int i = 0; i < sqrArr.length; i++) {
            for (int j = 0; j < sqrArr.length; j++) {
                if (i == j) {
                    sqrArr[i][j] = 1;
                } else {
                    sqrArr[i][j] = 0;
                }
                sqrArr[i][(sqrArr.length - 1) - i] = 1;
                System.out.print(sqrArr[i][j] + " ");
            }
        }
    }
    public static void getMinMaxArray() {
        System.out.println(" ");
        System.out.println("Task_5");
        int[] array = {25, 54, 5, 79, 125, 2, 12};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum " + min);
        System.out.println("Maximum " + max);
    }
    public static boolean checkBalance() {
        //System.out.println(" ");
        System.out.println("Task_6");
        int[] arr = {2, 5, 3, 11, 4, 2, 1, 5, 6, 3};
        int summ1 = 0;
        for (int i = 0; i < arr.length; i++) {
            summ1 += arr[i];
            int summ2 = 0;
            for (int j = i+1; j < arr.length; j++) {
                summ2 = summ2 + arr[j];
            }
            if (summ1 == summ2){
                return true;
            }
        } return false;
    }
    public static void changePartArray (){
        //System.out.println(" ");
        System.out.println("Task_7");
        int[] array = {6, 5, 2, 7, 3, 2, 4, 0};
        int n = 3;
        // Дальше не понимаю как решить!
    }
}
