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
public class Third {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nth number :-");
        int n=sc.nextInt();
        //print 0 and 1 first two elements
        System.out.print(n1+" "+n2);
        
        //i=2 because 0 and 1 already printed
        for(int i=2;i<n;++i){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
