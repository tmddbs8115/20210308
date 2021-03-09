package object;

public class Warrior {
	//전사가 사용할 스탯을 적어주세요
	public String id;
	public int level;
	public int hp;
	public int atk;
	
	
	public void getStatus() {
		System.out.println("아이디 : " + id);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + atk);
	}
	
	//생성자 정의
	public Warrior(String userId){
		System.out.println("전사 아이디 생성중입니다...");
		level = 1;
		hp = 20;
		atk = 3;
		id = userId;
	}
	
	
	public void huntMonster() {
		
		
		System.out.println("몬스터를 사냥합니다.");
		hp -= 3;
		level += 1;
		
	}
	
	public void heal() {
		
		System.out.println("체력을 회복합니다.");
		hp = 20;
	}
	
	
}
