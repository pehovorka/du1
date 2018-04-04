package com.github.pehovorka.du1.logika;

public class Slovo {
	private String anglicky;
	private String cesky;
	private String img;

	public Slovo(String anglicky, String cesky, String img) {
		this.anglicky = anglicky;
		this.cesky = cesky;
		this.img = img;
	}

	public String getAnglicky() {
		return anglicky;
	}

	public String getCesky() {
		return cesky;
	}

	public String getImg() {
		return img;
	}
	
	@Override
	public
	String toString() {
		return getAnglicky();
	}

}
