package main;

import java.sql.Array;
import java.util.Arrays;

public class BonusBinarySearch {



    /**
     * A binary search implementation for integer arrays.
     * <p>
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n             - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;
        while (right >= left) {
            int mid = left + ((right - left) / 2);
            if (sortedNumbers[mid] < n) {
                right = mid;
            } else if (sortedNumbers[mid] > n) {
                left = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        int[] arr = { 5,2,3,40 };
       Arrays.sort(arr);
        for(int a :arr){
            System.out.println(a);}
        int n=50;
        int result = BonusBinarySearch.binarySearch(arr,n);
        System.out.println(result);
        if(result == -1) {
            System.out.println("Element not present");
        } else{
            System.out.println("Element found at index " +result);
            }
        }
    }

