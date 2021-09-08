package goyn95.calender;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();

		int month = 1;
		int year = -1;

		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}

			cal.printCalender(year, month);
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
