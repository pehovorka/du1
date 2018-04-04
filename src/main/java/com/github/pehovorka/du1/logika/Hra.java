package com.github.pehovorka.du1.logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

public class Hra extends Observable {
	private boolean hraZacala = false;
	private Integer skore;
	private List<Slovo> slova;
	private Random nahodnyGenerator;
	private Slovo nahodneSlovo;

	public Hra() {
		slova = new ArrayList<Slovo>();
		skore = 0;
		// Slova: car, tree, pen, rainbow, cat, dog
		Slovo car = new Slovo("car", "auto", "/car.png");
		Slovo tree = new Slovo("tree", "strom", "/tree.png");
		Slovo pen = new Slovo("pen", "pero", "/pen.png");
		Slovo rainbow = new Slovo("rainbow", "duha", "/rainbow.png");
		Slovo cat = new Slovo("cat", "kočka", "/cat.png");
		Slovo dog = new Slovo("dog", "pes", "/dog.png");
		slova.add(car);
		slova.add(tree);
		slova.add(pen);
		slova.add(rainbow);
		slova.add(cat);
		slova.add(dog);
	}

	public List<Slovo> getSlova() {
		return slova;
	}
	
	public void setSkore(Integer skore) {
		this.skore = skore;
	}
	
	public Integer getSkore() {
		return skore;
	}
	
	public boolean getHraZacala() {
		return hraZacala;
	}
	
	
	public Slovo getNahodneSlovo () {
		nahodnyGenerator = new Random();
		int index = nahodnyGenerator.nextInt(slova.size());
		nahodneSlovo = slova.get(index);
		hraZacala = true;
		return nahodneSlovo;
	}
	
}
