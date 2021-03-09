package polymorph;

public class Warrior {
	private int hp;
	private int atk;
	private int def;
	
	public Warrior(int hp, int atk, int def) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public void hunt(Monster monster) {
		int result = monster.getHp() - this.atk;
		monster.setHp(result);
		
		
		result = this.hp - monster.getAtk();
		this.hp = result;
	}
	
	
	public void showHp() {
		System.out.println("전사의 남은 체력 : " + this.hp);
	}
	public void hunt(Dragon dragon) {
		int result = dragon.getHp() - this.atk;
		dragon.setHp(result);
		
		
		result = this.hp - dragon.getAtk();
		this.hp = result;
	}
	
	

}
