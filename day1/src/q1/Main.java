package q1;

//Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where 
//F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
//The first 20 Fibonacci numbers are:
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//The average is 885.5
public class Main {
	public static void fibonacci(int n) {
		int sum = 1;
		int prev = 0, next = 1;
		for (int i = 0; i < n; i++) {

			if (i == 0) {
				System.out.print(next + " ");
				continue;
			}
			int temp = next;
			next = prev + next;
			prev = temp;
			System.out.print(next + " ");
			sum += next;
		}
		System.out.println();
		System.out.println("The average is :" + sum / n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		fibonacci(n);

	}

}
