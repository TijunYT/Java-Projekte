
public class Tierpfleger {
	
	Tier tier;
	private String name;
	private String titel;
	private double stundenlohn;
	private boolean facharbeiter;
	
	public Tierpfleger() {
		this.name = "Anonym";
		this.titel = "";
		this.stundenlohn = 11.50;
		this.facharbeiter = false;
	}

	public Tierpfleger(String name, String titel, double stundenlohn, boolean facharbeiter) {
		super();
		this.name = name;
		this.titel = titel;
		this.stundenlohn = stundenlohn;
		this.facharbeiter = facharbeiter;
	}

	
	public String toString() {
		String facharbeiter = "kein Facharbeiter";
		if(this.facharbeiter) {
			facharbeiter = "Facharbeiter";
		}
			return "Ich bin Tierpfleger, heiße " + this.titel + this.name + ", bin " + facharbeiter 
					+ " und habe einen Stundenlohn von " + this.stundenlohn + " Euro.“";
	}
	
	public void tierFüttern(Tier tier, String futtername) {
		System.out.println(this.name + " füttert jetzt " + tier.getName() + " mit " + futtername + ".");
		tier.fressen(futtername);
	}
	
}
 