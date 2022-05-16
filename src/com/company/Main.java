package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Add numbers!");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(3);
        numbers.add(8);
        numbers.add(4);
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(0);
        numbers.add(1);
        System.out.println(numbers);
        long t1 = System.currentTimeMillis();

//        puzSort(numbers);
//        puzSortShake(numbers);
//        minNum(numbers);
        sortChoice(numbers);
//        quickSort(numbers, 0, numbers.size() - 1);
        System.out.println(numbers);
        long t2 = System.currentTimeMillis();
        System.out.println("Lead time = " + (t2 - t1));
    }

    public static List<Integer> puzSort(List<Integer> list) {
        System.out.println("Start puzSort!");
        int a = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < list.get(i - 1)) {
                    a = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, a);
                    System.out.println(list);
                    isSorted = false;
                }
            }
        }
        return list;
    }

    public static List<Integer> puzSortShake(List<Integer> list) {
        System.out.println("Start puzSortShake!");
        int a = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < list.get(i - 1)) {
                    a = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, a);
                    System.out.println(list);
                    isSorted = false;
                }
            }
            for (int i = list.size() - 1; i > 0; i--) {
                if (list.get(i) < list.get(i - 1)) {
                    a = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, a);
                    isSorted = false;
                }
            }
        }
        return list;
    }

    public static void minNum(List<Integer> list) {
        int minValue = list.get(0);
        int minIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minValue) {
                minValue = list.get(i);
                minIndex = i;
            }
        }
        System.out.println("min value = " + minValue);
        System.out.println("min index = " + minIndex);
    }

    public static List<Integer> sortChoice(List<Integer> list) {
        for (int j = 0; j < list.size(); j++) {
            int minValue = list.get(j);
            int minIndex = j;
            for (int i = j; i < list.size(); i++) {
                if (list.get(i) < minValue) {
                    minValue = list.get(i);
                    minIndex = i;
                }
            }
            int temp = list.get(j);
            list.set(j, minValue);
            list.set(minIndex, temp);
            System.out.println(list);
        }
        return list;
    }

    public static void quickSort(List<Integer> list, int from, int to) {
        if (from < to) {
            int divideIndex = partition(list, from, to);

            System.out.println(divideIndex);

            quickSort(list, from, divideIndex - 1);

            quickSort(list, divideIndex, to);
        }
    }

    public static int partition(List<Integer> list, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = list.get(from);
        while (leftIndex <= rightIndex) {
            while (list.get(leftIndex) < pivot) {
                leftIndex++;
            }

            while (list.get(rightIndex) > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(list, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void swap(List<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
