package polymorph;

public class GameMain {
	public static void main(String[] args) {
		// 전사를 생성해주세요
		Warrior w1 = new Warrior(20, 5, 0);
		
		Monster silam = new Monster(6, 1, 0);
		
		Orc orc = new Orc();
		
		
		w1.hunt(orc);
		w1.hunt(silam);
		w1.showHp();
		
	}
}
