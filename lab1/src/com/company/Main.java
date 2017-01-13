package com.company;
// task 1
public class Main {
    public static void main(int[] arr) {
        for (int k = arr.length / 2; k >= 0; k--) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
    }
}

//task 2
public class Merger {
    public static int[] merge (int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        int index = 0;
        while (fstIndex < fst.length && sndIndex < snd.length) {
            if (fst[fstIndex] < snd[sndIndex]) {
                result[index++] = fst[fstIndex++];
            } else {
                result[index++] = snd[sndIndex++];
            }
        }
        if (fstIndex< fst.length) {
            System.arraycopy(fst, fstIndex, result, index,fst.length - fstIndex);
        }
        if (sndIndex < snd.length) {
            System.arraycopy(snd, sndIndex, result, index,snd.length - sndIndex);
        }
        return result;
    }
}

//task 3
public class BubbleSorter {
    public static void sort(int[] arr) {
        for (int barrier =0; barrier < arr.length - 1; barrier++) {
            for (int index = arr.length - 1; index > barrier; index--) {
                if (arr[index] > arr[index - 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = tmp;
                }
            }
        }
    }
}

//task 4
public class SelectionSorter {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int minIndex = barrier;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[minIndex] > arr[index]) {
                    minIndex = index;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[barrier];
            arr[barrier] = tmp;
        }
    }
}



// task 5

import static java.util.Arrays.binarySearch;
public class InsertionSorter {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            //int location = k - 1;
            int location = binarySearch(arr, k);
            System.arraycopy(arr, location, arr, location+1, k - location);
            arr[location] = newElement;
        }
    }
}



// task 6.
public class Main {


    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        int k = 4;
        int [] [] a = new int [n] [m];
        int [] [] b = new int [m] [k];
        int [] [] c = matrix(a, b);


    }
    public static int [][] matrix (int [][] a, int [][] b){
        if (a == null || b == null){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < a.length; i++){
            if (a[i] == null){
                throw new IllegalArgumentException();
            }
        }
        for (int i = 0; i < b.length; i++){
            if (b[i] == null){
                throw new IllegalArgumentException();
            }
        }
        for (int i = 0; i < a.length-1; i++){
            if (a[i].length != a[i+1].length){
                throw new IllegalArgumentException();
            }
        }
        for (int i = 0; i < b.length-1; i++){
            if (b[i].length != b[i+1].length){
                throw new IllegalArgumentException();
            }
        }
        if (a[0].length != b.length){
            throw new IllegalArgumentException();
        }
        int n = a.length;
        int m = a[0].length;
        int k = b[0].length;
        int [] [] result = new int [n] [k];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < k; j++){
                int sum = 0;
                for (int z = 0; z < m; z++){
                    sum = sum + a[i][z]*b[z][j];
                }
                result [i] [j] = sum;
            }

        }
        return result;
    }
}
