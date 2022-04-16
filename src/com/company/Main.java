package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] inputArray(int n, int a, int b) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= random.nextInt(a, b);
        }
        return arr;
    }
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[][] inputArray(int n, int m, int a, int b) {
        Random random = new Random();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(a, b);
            }
        }

        return arr;
    }
    public static void printArray(int[][] arr, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println();
        }

    }
    public static void task5 (int [][]arr, int n, int m){
        boolean check;
        int count = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                check = true;
                for (int f = i-1; f<=i+1;f++){
                    for (int k=j-1; k<=j+1; k++){
                        if (f>=0 && f<n && k>=0 && k<m &&!(f==i &&k               ==j)){
                            if (arr[f][k]>=arr[i][j]){
                                check = false;
                                break;
                            }
                        }
                    }
                }
                if (check){
                    count++;
                    System.out.println(count + " Число = " + arr[i][j]);
                    System.out.println("Индекс " + i + " " + j);
                }
            }
        }
        if (count==0){
            System.out.println("чисел нет");
        }
    }
    public static void main(String[] args) {
        taskTwo5();
    }
    //Одномерные массивы
    public static void taskOne1234(){
        int n = 20;
        int a[] = inputArray(n,0,20);
        printArray(a,n);
        int min = 0;
        int max = 0;
        for (int i = 0; i<n; i++){
            if (a[i]<a[min]){
                min = i;
            }
            if (a[i]>a[max]){
                max = i;
            }
        }
        System.out.print("Минимальный элемент массива = " + a[min]);
        System.out.print("\nИндекс минимального элемента массива = " + min);
        System.out.print("\nМаксимальный элемент массива = " + a[max]);
        System.out.print("\nИндекс максимального элемента массива = " + max);
    }
    public static void taskOne5(){
        int n = 10;
        int sum = 0;
        int a[] = inputArray(n, 0,10);
        printArray(a,n);
        for (int i = 0; i<n; i++){
            if (i%2!=0){
                sum+=a[i];
            }
        }
        System.out.print(sum);

    }
    public static void taskOne6(){
        int n = 20;
        int a[] = inputArray(n,0,20);
        printArray(a,n);
        int start = 0;
        int end = n-1;
        for (int i = 0; i<n/2; i++) {
            while (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
        printArray(a,n);

    }
    public static void taskOne7(){
        int n = 20;
        int count = 0;
        int a[] = inputArray(n, 0,20);
        printArray(a,n);
        for (int i = 0; i<n; i++){
            if (a[i]%2!=0){
                count++;
            }
        }
        System.out.print(count);
    }
    public static void taskOne8(){
        int n = 10;
        int a[] = inputArray(n,0,10);
        printArray(a,n);
        int start;
        if (n%2==0){
            start = n/2;
        }
        else {
            start = n/2+1;
        }
        for (int i = 0; i<n/2; i++) {
            int temp = a[i];
            a[i] = a[start+i];
            a[start+i] = temp;
        }

        printArray(a,n);

    }
    public static void taskOne9() {
        int n = 20;
        int a[] = inputArray(n, 0, 20);
        printArray(a, n);
        for (int i = 1; i < n; i++) {
            int current = a[i];
            int j = i;
            while (j>0&&a[j-1]>current){
                a[j] = a[j-1];
                j--;
            }
            a[j] = current;
        }
        printArray(a,n);
    }
    public static void taskOne10() {
        int n = 20;
        int a [] = inputArray(n, 0, 20);
        printArray(a, n);
        boolean flag;
        for (int k = 0; k < n-1; k++) {
            flag = false;
            for (int i = 1; i < n; i++) {
                if (a[i] > a[i - 1]) {
                    flag  = true;
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
            if (!flag) break;

        }
        printArray(a, n);
    }

    // Двумерные массивы
    public static void taskTwo1234() {
        int n = 3;
        int m = 3;
        int a[][] = inputArray(n,m,0,10);
        int minN = 0;
        int minM = 0;
        int maxN = 0;
        int maxM = 0;
        printArray(a,n,m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[minN][minM] > a[i][j]) {
                    minN = i;
                    minM =j;
                }
                if (a [maxN][maxM] < a[i][j]) {
                    maxN = i;
                    maxM = j;
                }
            }
        }
        System.out.print("\nМинимальный элемент массива = " + a[minN][minM]);
        System.out.print("\nИндекс минимального элемента массива = " + minN + ", " + minM);
        System.out.print("\nМаксимальный элемент массива = " + a[maxN][maxM]);
        System.out.print("\nИндекс максимального элемента массива = " + maxN + ", " + maxM);

    }
    public static void taskTwo5(){
        int n = 5;
        int m = 6;
        int a[][] = inputArray(n,m,0,100);
        printArray(a,n,m);
        task5(a,n,m);
    }
    public static void taskTwo6(){
        int n = 5;
        int m = 5;
        int a[][] = inputArray(n,m,0,10);
        printArray(a,5,5);
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < m; j++) {
                int temp = a[i][j];
                a[i][j] = a [j][i];
                a [j][i] = temp;
            }
        }
        System.out.println();
        printArray(a,5,5);
    }
    public static void taskTwo7(){
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int m = 5;
        int a[][] = inputArray(n,m,0,5);
        printArray(a,5,5);
        int k = scanner.nextInt();
        int count = 0;
        boolean[] vector = new boolean [n];
        //1)
        /*for (int i = 0; i<n; i++){
                if (a[i][k] == 0){
                    count++;
                }
            if (count!=0){
              vector[k] = true;
              count = 0;
            }
            else {
              vector[k] = false;
            }
        } */
        //2)
        /*for (int i = 0; i<n-1; i++){
            if (a[k][i] >= a[k][i+1]){
                count++;
            }
            if (count!=0){
                vector[k] = true;
                count = 0;
            }
            else {
                vector[k] = false;
                break;
            }
        }*/
        //3)
        for (int i = 0; i<=n/2; i++) {
            if (a[k][i] == a[k][(n - 1) - i]) {
                count++;
            }
            if (count != 0) {
                vector[k] = true;
                count = 0;
            } else {
                vector[k] = false;
                break;
            }
        }
        System.out.println("Вектор: " + vector[k]);
    }
    public static void taskTwo8(){
        int n = 5;
        int m = 5;
        int a[][] = inputArray(n,m,0,10);
        printArray(a,5,5);
        int sum[] = new int[n];
        int multiply[] = new int[n];
        double average[] = new double[n];
        Arrays.fill(multiply, 1);
        System.out.print("Сумма строк: ");
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                sum[i]+=a[i][j];
            }
            System.out.print(sum[i] + ", ");

        }
        System.out.print("\nПроизведение строк: ");


        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                multiply[i]*=a[i][j];
            }
            System.out.print( + multiply[i] + ", ");
        }
        System.out.print("\nСреднее арифметическое строк: ");
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                average[i]+=a[i][j];
            }
            System.out.print((average[i]/n) + ", ");

        }

    }
    public static void taskTwo9() {
        int n = 2;
        int m = 3;
        int temp;
        int[] min = new int[n];
        int[] max = new int[m];
        boolean check = true;
        int a[][] = {
                {0, 6, 7},
                {8, 4, 9}
        };
        printArray(a, n, m);
        for (int i = 0; i < n; i++) {
            temp = a[i][0];
            for (int j = 1; j < m; j++) {
                if (a[i][j] < temp) {
                    temp = a[i][j];
                }
                min[i] = temp;
            }
        }
        for (int j = 0; j < m; j++) {
            temp = a[0][j];
            for (int i = 1; i < n; i++) {
                if (a[i][j] > temp) {
                    temp = a[i][j];
                }
                max[j] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == max[j] && a[i][j] == min[i]) {
                    System.out.print("\nСедловая точка - " + a[i][j] + "; Индекс седловой точки = " + i + ", " + j);
                    check = false;
                }
            }
        }

        if (check) {
            System.out.print("\nСедловой точки нет");
        }
    }
    public static void taskTwo10(){
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int m = 7;
        int sum = 0;
        int k = scanner.nextInt();
        if ((k<0) || (k>m+n)) {
            System.out.print("\nВведи другое число");
        }
        else {
            int a[][] = inputArray(n,m,0,10);
            printArray(a,n,m);
            for (int i = 0; i<n; i++){
                for (int j = 0; j<m; j++){
                    if (i+j==k){
                        System.out.print("\nИндексы: " + i + " " + j + ";");
                        sum += a[i][j];
                    }
                }
            }
            System.out.print("\nСумма элементов = "+ sum);
        }
    }
    public static void taskTwo11() {
        int n = 3;
        int m = 3;
        int a[][] = inputArray(n, m, 0, 10);
        int minN = 0;
        int minM = 0;
        int maxN = 0;
        int maxM = 0;
        int tempMaxN, tempMaxM, tempMinN, tempMinM;
        printArray(a, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[minN][minM] > a[i][j]) {
                    minN = i;
                    minM =j;
                }
                if (a[maxN][maxM] < a[i][j]) {
                    maxN = i;
                    maxM = j;
                }
            }
        }
        System.out.println("Максимальный элемент массива = " + a[maxN][maxM] + "; Индекс: " + maxN + " " + maxM);
        System.out.println("Минимальный элемент массива = " + a[minN][minM] + "; Индекс: " + minN + " " + minM);
        if (maxN == 0 && maxM == 0) {
            System.out.println("Индекс максимального элемента без изменений");
        } else {
            for (int i = maxN; i != 0; i--) {
                tempMaxN = a[i][maxM];
                a[i][maxM] = a[i - 1][maxM];
                a[i - 1][maxM] = tempMaxN;
            }
            for (int j = maxM; j != 0; j--) {
                tempMaxM = a[0][j];
                a[0][j] = a[0][j - 1];
                a[0][j - 1] = tempMaxM;
            }
        }
        if (minN == n-1 && minM == m-1) {
            System.out.println("Индекс минимального элемента без изменений");
        } else {
            for (int i = minN; i != n-1; i++) {
                tempMinN = a[i][minM];
                a[i][minM] = a[i + 1][minM];
                a[i + 1][minM] = tempMinN;
            }
            for (int j = minM; j != m-1; j++) {
                tempMinM = a[n-1][j];
                a[n-1][j] = a[n-1][j + 1];
                a[n-1][j + 1] = tempMinM;
            }
        }
        printArray(a, n, m);
    }
    public static void taskTwo12(){
        int n = 6;
        int m = 6;
        int[][] a = new int[n][m];
        int j;
        int i = 0;
        int k = 0;
        int p = 1;
        while (i < n*m) {
            k++;
            for (j = k-1; j<m-k+1; j++) {
                a[k-1][j] = p++;
                i++;
            }
            for (j = k; j<n-k+1; j++){
                a[j][m-k] = p++;
                i++;
            }
            for (j = m-k-1; j>=k-1; j--){
                a[n-k][j] = p++;
                i++;
            }
            for (j = n-k-1; j>=k; j--){
                a[j][k-1]=p++;
                i++;
            }
        }
        printArray(a,n,m);
    }
}
