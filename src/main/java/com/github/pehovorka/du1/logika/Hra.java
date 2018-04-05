package com.github.pehovorka.du1.logika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hra {
	private boolean hraZacala = false;
	private Integer spravne;
	private Integer spatne;
	private List<Slovo> slova;
	private Random nahodnyGenerator;
	private Slovo nahodneSlovo;

	public Hra() {
		slova = new ArrayList<Slovo>();
		spravne = 0;
		spatne = 0;
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

	public void setSpravne(Integer spravne) {
		this.spravne = spravne;
	}

	public Integer getSpravne() {
		return spravne;
	}
	
	public void setSpatne(Integer spatne) {
		this.spatne = spatne;
	}

	public Integer getSpatne() {
		return spatne;
	}

	public boolean getHraZacala() {
		return hraZacala;
	}

	public Slovo getNahodneSlovo() {
		nahodnyGenerator = new Random();
		int index = nahodnyGenerator.nextInt(slova.size());
		nahodneSlovo = slova.get(index);
		hraZacala = true;
		return nahodneSlovo;
	}

}
