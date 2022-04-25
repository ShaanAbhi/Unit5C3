import java.io.*;
import java.util.Scanner;

public class UniqueWord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = scanner.nextLine();
		
		
		String newStr[] = str.split(" ");
		int count=0;
		//System.out.println("The unique words are "+count);
		System.out.println("The unique word of this string is :");
		for(int i=0;i<newStr.length;i++) {
			for(int j=0;j<newStr.length;j++) {
				
				
				String temp1 = newStr[i];
				String temp2 = newStr[j];
				
				
				if(j<i && temp1.equals(temp2)) {
					break;
				}
				
				
				if(j==newStr.length-1) {
				count++;
					System.out.println(newStr[i]);
				}
			}
		}
		 System.out.println("The unique words are "+count);
	}
}