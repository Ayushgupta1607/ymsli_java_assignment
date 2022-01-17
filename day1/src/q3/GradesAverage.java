package q3;

import java.util.Scanner;

//Write a program called GradesAverage, which prompts user for the number of students, reads it
//from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the 
//grades of each of the students and saves them in an int array called grades. Your program shall 
//check that the grade is between 0 and 100. A sample session is as follow:
//Enter the number of students: 3
//Enter the grade for student 1: 55
//Enter the grade for student 2: 108
//Invalid grade, try again...
//Enter the grade for student 2: 56
//Enter the grade for student 3: 57
//The average is: 56.0
public class GradesAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numStudents ;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no. of students :");
		numStudents=scn.nextInt();
		int grades[]=new int[numStudents+1];
		int sum=0;
		for(int i=1;i<=numStudents;i++) {
			int x;
			System.out.print("Enter the grade for student "+i+" : ");
			x=scn.nextInt();
			if(x<=0||x>=100) {
				System.out.println("Invalid grade, try again...");
				i--;
				continue;
			}
			grades[i]=x;
			sum+=x;
			
		}
		System.out.println("The average is: " + sum/numStudents);
	}

}
