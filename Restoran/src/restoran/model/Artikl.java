package restoran.model;

public class Artikl extends Entitet {
	private String naziv;
	private float cijena;
	private String kategorija;

	public Artikl() {
		super();
	}

	public Artikl(int sifra, String naziv, float cijena, String kategorija) {
		super(sifra);
		this.naziv = naziv;
		this.cijena = cijena;
		this.kategorija = kategorija;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public float getCijena() {
		return cijena;
	}

	public void setCijena(float cijena) {
		this.cijena = cijena;
	}

	public String getKategorija() {
		return kategorija;
	}

	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}

}
