package cz.memorit.bean;

public class Karticka {
	private Integer id_katicka;
	private Integer id_balicek;
	private String front_karta;
	private String back_karta;

	public String getBack_karta() {
		return back_karta;
	}

	public void setBack_karta(String back_karta) {
		this.back_karta = back_karta;
	}

	public String getFront_karta() {
		return front_karta;
	}

	public void setFront_karta(String front_karta) {
		this.front_karta = front_karta;
	}

	public Integer getId_balicek() {
		return id_balicek;
	}

	public void setId_balicek(Integer id_balicek) {
		this.id_balicek = id_balicek;
	}

	public Integer getId_katicka() {
		return id_katicka;
	}

	public void setId_katicka(Integer id_katicka) {
		this.id_katicka = id_katicka;
	}
}
