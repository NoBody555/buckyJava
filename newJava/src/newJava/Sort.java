package newJava;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int data[] = { 4, -5, 2, 6, 1};
		Arrays.sort(data);
		for(int i : data) {
			System.out.print(i+" ");
		}
	}
}
