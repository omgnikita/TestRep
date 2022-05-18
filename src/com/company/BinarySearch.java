package com.company;

public class BinarySearch {
    public static void main(String[] args) {
//        System.out.println("result = " + binarySearch(new int[] {1,2,3,4,5,10,20,50}, 3));
        System.out.println("result = " + binarySearchRecursion(new int[]{1, 2, 3, 4, 5, 10, 20, 50}, 51, 0, 7));
    }

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] a, int key, int low, int high) {

        int middle = low + (high - low) / 2;

        if (low > high) {
            return -1;
        }

        if (a[middle] > key) {
            high = middle - 1;
            return binarySearchRecursion(a, key, low, high);
        } else if (a[middle] < key) {
            low = middle + 1;
            return binarySearchRecursion(a, key, low, high);
        } else {
            return middle;
        }
    }
}
