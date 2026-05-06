package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		Scanner sc = new Scanner(System.in);
		String choice = null;
		System.out.println("自分のじゃんけんの手を入力しましょう");
		while (true) {
			System.out.println("グーはrockのrを入力しましょう\n"
					+ "チョキはscissorsのsを入力しましょう\n"
					+ "パーはpaperのpを入力しましょう");
			choice = sc.nextLine();
			if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
				sc.close();
				return choice;
			}
				
		}

	}

	public String getRandom() {
		int random = (int) Math.floor(Math.random() * 3);
		String choice = null;
		if (random == 0)
			choice = ("r");
		if (random == 1)
			choice = ("s");
		if (random == 2)
			choice = ("p");
		return choice;

	}

	public void playGame(String pl, String cp) {
		HashMap<String, String> jyanken = new HashMap<String, String>();
		jyanken.put("r", "グー");
		jyanken.put("s", "チョキ");
		jyanken.put("p", "パー");
		System.out.println("自分の手は" + jyanken.get(pl) + ",対戦相手の手は" + jyanken.get(cp));

		if (pl.equals("r")) {
			if (cp.equals("r"))
				System.out.println("あいこです");
			if (cp.equals("s"))
				System.out.println("自分の勝ちです");
			if (cp.equals("p"))
				System.out.println("自分の負けです");
		}
		if (pl.equals("s")) {
			if (cp.equals("r"))
				System.out.println("自分の負けです");
			if (cp.equals("s"))
				System.out.println("あいこです");
			if (cp.equals("p"))
				System.out.println("自分の勝ちです");
		}
		if (pl.equals("p")) {
			if (cp.equals("r"))
				System.out.println("自分の勝ちです");
			if (cp.equals("s"))
				System.out.println("自分の負けです");
			if (cp.equals("p"))
				System.out.println("あいこです");
		}

	}
}
