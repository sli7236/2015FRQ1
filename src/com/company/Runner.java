package com.company;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[][] arr2 = {{3,6,7,3}, {2,5,6,3}, {3,6,2,11}, {12,1,3,5}};
        int[][] arr3 = {{1,1,1,1}, {1,1,1,1}, {1,2,1,1}, {1,1,3,4,}};

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++)
        {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }
            else
            {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Array Sum: " + arraySum(arr));
        printArr(arr2);
        System.out.println("Array Row Sums: " + Arrays.toString(rowSums(arr2)));
        System.out.println("Diverse: " + isDiverse(arr2));
        printArr(arr3);
        System.out.println("Array Row Sums: " + Arrays.toString(rowSums(arr3)));
        System.out.println("Diverse: " + isDiverse(arr3));
    }

    public static void printArr(int[][] arr)
    {
        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("[");
            for (int x = 0; x < arr.length; x++)
            {
                if (x == arr.length - 1) {
                    System.out.print(arr[i][x]);
                }
                else
                {
                    System.out.print(arr[i][x] + ", ");
                }
            }
            System.out.print("]");
        }
        System.out.println();
    }

    public static int arraySum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr2D){
        int [] sumArr = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++){
            sumArr[i] = arraySum(arr2D[i]);
        }
        return sumArr;
    }

    public static boolean isDiverse(int[][] arr2D){
        int [] sumArr = rowSums(arr2D);
        for(int i = 0; i < sumArr.length; i++){
            for(int j = i+1; j < sumArr.length; j++){
                if(sumArr[i] == sumArr[j]){
                    return false;
                }
            }
        }  return true;
    }
}
