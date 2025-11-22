package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	HashMap<String, String> handName = new HashMap<String, String>();
	
	//コンストラクタ
	public Jyanken_Chapter28() {
		handName.put( "r", "グー"); 
		handName.put( "s", "チョキ"); 
		handName.put( "p", "パー");
	}
	
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		String myChoice = "";
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			myChoice = scanner.next();
			
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				scanner.close();
                break;
            }
			
            System.out.println("不正な入力です。再度入力してください");
		}
		
		
		return myChoice;
		
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		
		// 0～2のいずれかをランダムに生成
		int randNum = (int)(Math.floor( Math.random() * 3));
		
		if (randNum == 0) {
			return "r";
		} else if (randNum == 1) {
			return "s";
		} else {
			return "p";
		}
		
	}
	
	//じゃんけんを行う
	public void playGame(String me, String enemy) {
		
		System.out.println("自分の手は" + handName.get(me) + "、対戦相手の手は" + handName.get(enemy));
		
		
		if (enemy.equals(me)) {
            System.out.println("あいこです");
            return;
		} else if ((me.equals("r") && enemy.equals("s")) || (me.equals("s") && enemy.equals("p")) || (me.equals("p") && enemy.equals("r"))) {
        	System.out.println("あなたの勝ちです");
		} else {
			System.out.println("あなたの負けです");
		}
	}
}
