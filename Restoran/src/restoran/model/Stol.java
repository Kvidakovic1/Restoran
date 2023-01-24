package restoran.model;

public class Stol extends Entitet {
	private int brojStola;
	private Konobar konobar;

	public Stol() {
		super();
	}

	public Stol(int sifra, int brojStola, Konobar konobar) {
		super(sifra);
		this.brojStola = brojStola;
		this.konobar = konobar;
	}

	public int getBrojStola() {
		return brojStola;
	}

	public void setBrojStola(int brojStola) {
		this.brojStola = brojStola;
	}

	public Konobar getKonobar() {
		return konobar;
	}

	public void setKonobar(Konobar konobar) {
		this.konobar = konobar;
	}
}
