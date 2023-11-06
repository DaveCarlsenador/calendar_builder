package javaapplication113; 
import java.util.Scanner; 

public class Gradingsystem { 


    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        System.out.println("enter your average in calculus1"); 
        int cal = sc.nextInt(); 
        System.out.println("Enter your a verage in computer programming"); 
        int programming = sc.nextInt(); 
        System.out.println("Enter your average in computer fundamental"); 
        int fundamental = sc.nextInt(); 
        System.out.println("Enter your average in Understanding the self"); 
        int UTS = sc.nextInt(); 
        System.out.println("Enter your average in Euthenics"); 
        int euthenics = sc.nextInt(); 

        if (cal>=80) { 
            System.out.println("Your average in calculus is"+cal+" :You passed!"); 
        } 
        else {  
            System.out.println("Your average in calculus is "+cal+" :You failed!"); 
        } 

        if (programming>=80) { 
            System.out.println("Your average in computer programming is"+programming+" :You passed!"); 
        } 
        else {  
            System.out.println("Your average in computer programming is "+programming+" :You failed!"); 

        }  
        if (UTS>=80) { 
            System.out.println("Your average in Understanding the self is"+UTS+" :You passed!"); 
        } 
        else { 
            System.out.println("Your average in understanding the self is"+UTS+" :You failed!");         
        } 
           if (fundamental>=80) { 
            System.out.println("Your average in Computer fundamental is"+fundamental+" :You passed!"); 
        } 
        else { 
            System.out.println("Your average in computer fundamental is"+fundamental+" :You failed!");     
        } 
         if (euthenics>=80) { 
            System.out.println("Your average in Euthenics is"+euthenics+" :You passed!"); 
        } 
        else { 
            System.out.println("Your average in Euthenics is"+euthenics+" :You failed!");    

        } 

    } 

} 


