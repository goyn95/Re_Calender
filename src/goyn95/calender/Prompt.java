package goyn95.calender;

import java.util.Scanner;

public class Prompt {

	/**
	 * 
	 * @param week 요일
	 * @return 0~6 (0 = sunday, 6 = saturday)
	 */

	public int parseDay(String week) {
		if (week.equals("su"))
			return 0;
		else if (week.equals("mo"))
			return 1;
		else if (week.equals("tu"))
			return 2;
		else if (week.equals("we"))
			return 3;
		else if (week.equals("th"))
			return 4;
		else if (week.equals("fr"))
			return 5;
		else if (week.equals("sa"))
			return 6;
		else
			return 0;
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();

		int month = 1;
		int year = 2021;
		int weekday = 0;

		while (true) {
			System.out.println("년도를 입력하세요. (exit: -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			System.out.println("첫번째 요일을 입력하세요.(SU, MO, TU, WE, TH, FR, SA");
			System.out.print("WEEKDAY> ");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);

			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}

			cal.printCalender(year, month, weekday);
		}

		System.out.println("fin~");
		scanner.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

	// 숫자로 입력받아 해당하는달의 최대일수를 출력하는 프로그램

}
