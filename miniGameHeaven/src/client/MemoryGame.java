package client;

import java.util.*;

public class MemoryGame {

	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	int count = 1;

	ArrayList alist = new ArrayList();
	ArrayList alist1 = new ArrayList();

	public String[] howTo() {
		String[] howTo = new String[] { "***** ȭ��ǥ ��� ���� *****", "W/S/A/D�� ���� ��, �Ʒ�, ����, �������� �Է��մϴ�.",
				"���� �þ�� ȭ��ǥ���� ������ �� ����ϼ���!" };

		return howTo;

	}

	public String question(int count) {

		count++;

		alist.removeAll(alist);
		alist1.removeAll(alist1);

		// 4���� 1Ȯ���� ��, �Ʒ�, ����, ������ ȭ��ǥ ����
		for (int i = 1; i < count; i++) {

			int random = r.nextInt(4) + 1;

			if (random == 1) {
				alist.add("up");
			}
			if (random == 2) {
				alist.add("down");
			}
			if (random == 3) {
				alist.add("left");
			}
			if (random == 4) {
				alist.add("right");
			}

		}

		// 4���� 1Ȯ���� ��, �Ʒ�, ����, ������ ȭ��ǥ ����
		String question = null;
		for (int i = 0; i < count - 1; i++) {
			question += alist.get(i).toString()+" ";
		}

		return question;
	}

	public boolean answerCheck(String input){
		
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == 'w') {
					alist1.add("up");
				}
				if (input.charAt(i) == 's') {
					alist1.add("down");
				}
				if (input.charAt(i) == 'a') {
					alist1.add("left");
				}
				if (input.charAt(i) == 'd') {
					alist1.add("right");
				}
			}

			if (alist.equals(alist1)) {
				return true;
			}
			
		return false;

	}

	// public int start() {
	// int count = 1;
	//
	// ArrayList alist = new ArrayList();
	// ArrayList alist1 = new ArrayList();
	//
	// do {
	// count++;
	//
	// alist.removeAll(alist);
	// alist1.removeAll(alist1);
	//
	// // 4���� 1Ȯ���� ��, �Ʒ�, ����, ������ ȭ��ǥ ����
	// for (int i = 1; i < count; i++) {
	//
	// int random = r.nextInt(4) + 1;
	//
	// if (random == 1) {
	// alist.add("up");
	// }
	// if (random == 2) {
	// alist.add("down");
	// }
	// if (random == 3) {
	// alist.add("left");
	// }
	// if (random == 4) {
	// alist.add("right");
	// }
	//
	// }
	//
	// // 4���� 1Ȯ���� ��, �Ʒ�, ����, ������ ȭ��ǥ ����
	//
	// try {
	// Thread.sleep(1000);
	// System.out.println((count - 1) + "�ܰ� ���� : ");
	// for (int i = 0; i < count - 1; i++) {
	// System.out.printf(alist.get(i).toString() + " ");
	// Thread.sleep(1000);
	// }
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	//
	// System.out.print("�Է��ϼ���");
	// String input = sc.next();
	//
	// for (int i = 0; i < input.length(); i++) {
	// if (input.charAt(i) == 'w') {
	// alist1.add("up");
	// }
	// if (input.charAt(i) == 's') {
	// alist1.add("down");
	// }
	// if (input.charAt(i) == 'a') {
	// alist1.add("left");
	// }
	// if (input.charAt(i) == 'd') {
	// alist1.add("right");
	// }
	// }
	//
	// System.out.println("\n���� : " + alist);
	// System.out.println("���� �� �� : " + alist1 + "\n");
	//
	// if (alist.equals(alist1)) {
	// try {
	// Thread.sleep(1000);
	// System.out.println("Correct!!!");
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// }
	//
	// } while (alist.equals(alist1));
	//
	// try {
	// Thread.sleep(1000);
	// System.out.println("Wrong!!!");
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	//
	// System.out.println("���� ���� �ܰ� : " + (count - 1));
	//
	// return count - 1;
	//
	// }

}
