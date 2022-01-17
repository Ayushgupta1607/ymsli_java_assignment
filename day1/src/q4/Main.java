package q4;

//Write a boolean method called copyOf(), which an int Array and returns a copy of the given 
//array. The method's signature is as follows:
//public static int[] copyOf(int[] array)
public class Main {

	public static int[] copyOf(int[] a) {
		int newArray[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			newArray[i] = a[i];
		}
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4 };
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		int b[] = copyOf(a);
		for (int i : b) {
			System.out.print(i + " ");
		}
	}

}
