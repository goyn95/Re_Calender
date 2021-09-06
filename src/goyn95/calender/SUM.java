package goyn95.calender;

import java.util.Scanner;

public class SUM {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.next();
		String splitValue[] = inputValue.split(",");
		int i = Integer.parseInt(splitValue[0]);
		int j = Integer.parseInt(splitValue[1]);
		System.out.printf("두 수의 합은 %d입니다.",i+j);
	}
}
