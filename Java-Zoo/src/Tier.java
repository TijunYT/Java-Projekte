
public class Tier {

	private String tierart;
	private String name;
	private int alter;
	private boolean hungrig;
	
	public Tier() {
		this.tierart = "unbekannt";
		this.name = "anonym";
		this.alter = 0;
		this.hungrig = false;
	}
	

	public Tier(String tierart, String name, int alter, boolean hungrig) {
		this.tierart = tierart;
		this.name = name;
		this.alter = alter;
		this.hungrig = hungrig;
	}


	public String toString() {
		String hungerstatus = "satt";
		if(this.hungrig) {
			hungerstatus = "hungrig";
		}
		return "Ich bin ein Tier, genauer ein / eine " + tierart + ", heiﬂe " + name + ", bin " + alter + " Jahre alt und " + hungerstatus + ".";
	}
	
	public String getTierart() {
		return tierart;
	}
	
	public String getName() {
		return name;
	}
	
	public void fressen(String futtername) {
		if(this.hungrig) {
			System.out.println(this.name + " frisst jetzt " + futtername + ".");
			this.hungrig = false;
		} else {
			System.out.println(this.name + " ist grade nicht hungrig.");
		}
	}
	
	public void schlafen(int stunden_schlaf) {
		if(this.hungrig) {
			System.out.println(this.name + " kann grade nicht schlafen. Es ist hungrig.");
		} else {
			System.out.println(this.name + " schl‰ft jetzt " + stunden_schlaf + " Stunden. Es ist jetzt hungrig.");
			this.hungrig = true;
		}
	}
	
}
