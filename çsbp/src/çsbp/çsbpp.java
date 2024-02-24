package çsbp;

import java.util.Scanner;

public class çsbpp {
	public static void main(String[] args) {
		Scanner inpuScanner = new Scanner(System.in);
		System.out.print("Sayi Giriniz: ");
		int number= inpuScanner.nextInt();
		
		for (int i = 1; i <= number; i++){
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}

}
