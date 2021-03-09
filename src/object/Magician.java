package object;

public class Magician {
	public String id;
	public int level;
	public int mp;
	public int gold;
	public int atk;
	
	
	public Magician(String userId){
		System.out.println("전사 아이디 생성중입니다...");
		level = 1;
		mp = 20;
		atk = 3;
		gold = 200;
		id = userId;
	}

	public void getStatus() {
		System.out.println("아이디 : " + id);
		System.out.println("레벨 : " + level);
		System.out.println("마력 : " + mp);
		System.out.println("공격력 : " + atk);
		System.out.println("소지골드 : " + gold);
	}
	
	public void huntMonster() {
		
		
		System.out.println("마법사가 몬스터를 사냥합니다.");
		mp -= 3;
		level += 1;
		
	}
	
	public void healMagician() {
		System.out.println("회복을 사용합니다.");
		
		mp = 20;
		
		
	}
}