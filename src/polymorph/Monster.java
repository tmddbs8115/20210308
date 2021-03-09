package polymorph;

public class Monster {
	
	
	
	
	private int hp;
	private int atk;
	private int def;
	
	public Monster(int hp, int atk, int def) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	public int getDef() {
		return this.def;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
	
}
