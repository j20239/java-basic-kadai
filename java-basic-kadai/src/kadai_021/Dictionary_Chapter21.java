package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> dictionary = new HashMap<String, String>();
	String[] eng = { "apple", "peach", "banana", "lemon", "pear", "kiwi", "strawberry", "grape", "muscat",
			"cherry" };
	String[] jpn = { "りんご", "桃", "バナナ", "レモン", "梨", "キウィ", "いちご", "ぶどう", "マスカット", "さくらんぼ" };


	public void setMap() {
		for (int i = 0; i < this.eng.length; i++) {
			if (!dictionary.containsKey(this.eng[i])) {
				dictionary.put(this.eng[i], this.jpn[i]);
			} else {
				System.out.println(dictionary.get(this.eng[i]));
			}
		}
	}

	public void dhisplayMap(String[] eng) {
		for (int i = 0; i < eng.length; i++) {
			if (dictionary.containsKey(eng[i])) {
				System.out.println(eng[i]+"の意味は"+dictionary.get(eng[i]));
			}else {
				System.out.println(eng[i]+"は辞書に存在しません");
			}
		}
	}
}
