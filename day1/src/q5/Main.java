package q5;

import java.util.Scanner;

//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 
//1 2 3 4 5 6 
//1 2 3 4 5 6 7 
//1 2 3 4 5 6 7 8
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter No. of Rows : ");
		
		int n=scn.nextInt();
		
		
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		scn.close();
	}

}
