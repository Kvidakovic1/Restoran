package restoran.model;

public class Gost extends Entitet {
	private String ime;
	private String prezime;
	private String brojTelefona;

	public Gost() {
		super();
	}

	public Gost(int sifra, String ime, String prezime, String brojTelefona) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;
		this.brojTelefona = brojTelefona;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

}
