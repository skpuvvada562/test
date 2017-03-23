package com.array.pair;

public class ArrayPair {

  public static void main(String[] args) {
    int arr[] = { 1, 5, 7, -1, 5 };
    int sum = 10;
    getPairs(arr, sum);
  }

  private static void getPairs(int[] arr, int sum) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == sum) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
