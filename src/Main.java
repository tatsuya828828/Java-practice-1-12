
public class Main {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Matango m = new Matango();
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);
		Slime s = new Slime();Monster mon = new Slime();
		s.run(); mon.run();
	}
}
