
public class Main {
	public static void main(String[] args) {

		// 新しく５体のキャラクターを生み出す
		Character[] c = new Character[5];
		c[0] = new Wizard();
		c[1] = new Wizard();
		c[2] = new Wizard();
		c[3] = new Wizard();
		c[4] = new Wizard();

		// 全員のHPを回復する
		for (Character ch:c) {
			ch.hp += 50;
		}

		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new DeathBat();
		for (Monster m:monsters) {
			m.run();
		}
	}
}
