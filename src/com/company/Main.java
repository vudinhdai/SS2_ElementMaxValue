package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m, n;// khai bao so dong so cot cua ma tran
        Scanner scanner = new Scanner(System.in);
        System.out.println("input so dong cua ma tran ");
        m = scanner.nextInt();
        System.out.println("input so cot cua ma tran ");
        n = scanner.nextInt();
        int A[][] = new int[m][n];// khai bao ma tran A co ( m dong , n cot )
        System.out.println(" input element cho ma  tran :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A[" + i + "][" + j + "]");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              if (max<A[i][j]){
                  max=A[i][j];
              }
            }
        }
        System.out.println("Element co value max trong ma tran "+ max);
    }

}