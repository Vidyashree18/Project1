
/* This is the version 3 */
package com.upgrad;
import java.util.Scanner;

public class small {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        int m = s.nextInt();
        numberOfSubArrays(arr, n, d, m);
    }
    static void numberOfSubArrays(int[] arr, int n, int d, int m){
        int count = 0;
        for(int i = 0; i <= n-m; i++){
            int sum = 0;
            for(int j = 1; j < i+m; j++){
                sum += arr[j];
            }
            if(sum == d){
                count++;
            }
        }
        System.out.println(count);
    }
}


