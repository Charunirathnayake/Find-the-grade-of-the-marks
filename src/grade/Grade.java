/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade;

/**
 *
 * @author charuni
 */import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int N = input.nextInt();
        double [] marks = new double [N];
        for(int i=0 ; i<N ; i++){
        
            System.out.println("enter the marks");
        marks [i] = input.nextDouble();
        
        
            }
        for(int i=0 ; i<N ; i++){
            System.out.println(marks[i]);
            if(marks[i]>=75){
                System.out.println("A");
            }
            else if(marks[i]>=65){
                System.out.println("B");
            }
            else if(marks[i]>=50){
                System.out.println("C");
            }
            else if(marks[i]>35){
                System.out.println("S");
            }
            else{
                System.out.println("F");
            }
        }
    }
}
