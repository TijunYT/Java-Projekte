
public class Hauptklasse {

	public static void main(String[] args) {
		Tier t = new Tier("Pferd", "Gustav", 2, false);
		Tierpfleger h = new Tierpfleger("Die Olga", "", 500, true);
		System.out.println(t);
		System.out.println(h);
		h.tierF�ttern(t, "Hafer");
		t.schlafen(3);
		h.tierF�ttern(t, "Mensch");
	}

}
