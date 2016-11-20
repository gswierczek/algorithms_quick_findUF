package com.swierczek;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("Entered: " + N);
        QuickFindUF uf = new QuickFindUF(N);


        while (N >= 0){
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            if(!uf.connected(p, q)){
                uf.union(p, q);
                System.out.println(p + " " + q);

            }
        }
        scanner.close();
    }}