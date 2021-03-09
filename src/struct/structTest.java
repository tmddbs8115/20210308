package struct;

public class structTest {
	
	
public static void getMagicianStatus(Magician ac) {
		
		System.out.println("마법사 아이디 조회중...");
		System.out.println("아이디 : " + ac.id);
		System.out.println("레벨 : " + ac.level);
		System.out.println("마법공격력 : " + ac.matk);
		System.out.println("마력 : " + ac.mp);
		
	}
	
	

	//전사에게 몬스터 사냥기능 추가

	public static void huntMonster(structEx ac) {
		System.out.println("전사가 몬스터를 잡습니다.");
		ac.hp -= 3;
		ac.level += 1;
		
		
	}
	public static void getWarriorStatus(structEx ac) {
		
		
		System.out.println("전사 아이디 조회중...");
		System.out.println("아이디 : " + ac.id);
		System.out.println("레벨 : " + ac.level);
		System.out.println("공격력 : " + ac.atk);
		System.out.println("체력 : " + ac.hp);
	}
	
	public static void main(String[] args) {
		structEx w1 = new structEx();
		//w1 내부 변수에 임의의 값을 부여해주세요.
		w1.atk = 3;
		w1.hp = 20;
		w1.level = 1;
		w1.id = "전사1";
		
		getWarriorStatus(w1);
		huntMonster(w1);
		getWarriorStatus(w1);
		huntMonster(w1);
		getWarriorStatus(w1);
		
		structEx w2 = new structEx();
		
		w2.atk = 2;
		w2.hp = 30;
		w2.level = 1;
		w2.id = "전사2";
		
		getWarriorStatus(w2);
		
		Magician m1 = new Magician();
		
		m1.matk = 5;
		m1.mp = 15;
		m1.level = 1;
		m1.id = "마법사1";
		
		getMagicianStatus(m1);
		
		Magician m2 = new Magician();
		
		m2.matk = 7;
		m2.mp = 13;
		m2.level = 1;
		m2.id = "마법사2";
		
		getMagicianStatus(m2);
		
		
	}
}
