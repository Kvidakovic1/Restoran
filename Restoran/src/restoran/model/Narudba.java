package restoran.model;

public class Narudba extends Entitet {
	private Gost gost;
	private Stol stol;

	public Narudba() {
		super();
	}

	public Narudba(int sifra, Gost gost, Stol stol) {
		super(sifra);
		this.gost = gost;
		this.stol = stol;
	}

	public Gost getGost() {
		return gost;
	}

	public void setGost(Gost gost) {
		this.gost = gost;
	}

	public Stol getStol() {
		return stol;
	}

	public void setStol(Stol stol) {
		this.stol = stol;
	}

}
