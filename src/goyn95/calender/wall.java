package goyn95.calender;

import java.util.Scanner;

public class wall {
	public static void main(String[] args) {
		System.out.println("달을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		if (month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12) {
			int i = 31;
			System.out.printf("%d월은 %d일까지 있습니다.",month, i);
		}else if(month == 4||month == 6||month == 9||month == 11) {
			int i = 30;
			System.out.printf("%d월은 %d일까지 있습니다.",month, i);
		}else {
			int i = 28;
			System.out.printf("%d월은 %d일까지 있습니다.",month, i);
		}
		scan.close();
	}

}
