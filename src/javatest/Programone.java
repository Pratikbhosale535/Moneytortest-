/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Programone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:-");
        int a=sc.nextInt();
         System.out.println("Enter number 1:-");
        int b=sc.nextInt();
        
        long result = 1;

        while (b != 0)
        {
            result *= a;
            --b;
        }

        System.out.println("Answer = " + result);
    }
}
