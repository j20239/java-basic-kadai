package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName = "加藤";//性を表す
	public String givenName;//名を表す
	public String address = "東京都中野区〇×";//住所を表す

	public void commonlntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}

	abstract public void eachIntroduce();

	public void execIntroduce() {
		this.commonlntroduce();
		this.eachIntroduce();
		System.out.println();
	}
}
