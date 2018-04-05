package com.github.pehovorka.du1.ui;

import java.util.ArrayList;
import java.util.List;

import com.github.pehovorka.du1.logika.Hra;
import com.github.pehovorka.du1.logika.Slovo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class HomeController extends GridPane {

	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;
	@FXML
	private Button button5;
	@FXML
	private Button button6;
	@FXML
	private Button buttonHadej;
	@FXML
	private Label mainLabel;
	@FXML
	private Label labelSkore;
	private Hra hra;
	private List<Slovo> slova;
	private List<Button> tlacitka;
	private Slovo nahodneSlovo;

	public void hadej(ActionEvent e) {
		if (hra.getHraZacala()) {
			Button stisknuteTlacitko = (Button) e.getSource();
			System.out.println(stisknuteTlacitko.getId());
			if (stisknuteTlacitko.getId().equals(nahodneSlovo.getAnglicky())) {
				hra.setSpravne(hra.getSpravne() + 1);
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Výsledek");
				alert.setHeaderText("Správně");
				alert.setContentText("Vybrali jste správný obrázek");
				alert.showAndWait();
			} else {
				hra.setSpatne(hra.getSpatne() + 1);
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Výsledek");
				alert.setHeaderText("Špatně");
				alert.setContentText("Vybrali jste špatný obrázek");
				alert.showAndWait();
			}
			labelSkore.setText("Správně: "+hra.getSpravne().toString()+"\nŠpatně: "+hra.getSpatne().toString());
			buttonHadejKlik();
		}

		else {
			mainLabel.setText("Musíte začít hru stiskem na tlačítko hádej!");
		}
		;

	}

	public void buttonHadejKlik() {
		nahodneSlovo = hra.getNahodneSlovo();
		mainLabel.setText(nahodneSlovo.toString());
		System.out.println(nahodneSlovo + nahodneSlovo.getCesky() + nahodneSlovo.getImg());

	}

	public void inicializuj(Hra hra) {
		this.hra = hra;
		slova = hra.getSlova();
		tlacitka = new ArrayList<Button>();
		String cestaImg = slova.get(0).getImg();
		String cesky = slova.get(0).getCesky();

		Tooltip ceskyNazev = new Tooltip(cesky);
		Image img = new Image(cestaImg);
		ImageView image = new ImageView(img);

		tlacitka.add(button1);
		button1.setGraphic(image);
		button1.setId(slova.get(0).getAnglicky());
		button1.setTooltip(ceskyNazev);
		cestaImg = slova.get(1).getImg();
		img = new Image(cestaImg);
		image = new ImageView(img);
		cesky = slova.get(1).getCesky();
		ceskyNazev = new Tooltip(cesky);
		tlacitka.add(button2);
		button2.setGraphic(image);
		button2.setId(slova.get(1).getAnglicky());
		button2.setTooltip(ceskyNazev);
		cestaImg = slova.get(2).getImg();
		img = new Image(cestaImg);
		image = new ImageView(img);
		cesky = slova.get(2).getCesky();
		ceskyNazev = new Tooltip(cesky);
		tlacitka.add(button3);
		button3.setGraphic(image);
		button3.setId(slova.get(2).getAnglicky());
		button3.setTooltip(ceskyNazev);
		cestaImg = slova.get(3).getImg();
		img = new Image(cestaImg);
		image = new ImageView(img);
		cesky = slova.get(3).getCesky();
		ceskyNazev = new Tooltip(cesky);
		tlacitka.add(button4);
		button4.setGraphic(image);
		button4.setId(slova.get(3).getAnglicky());
		button4.setTooltip(ceskyNazev);
		cestaImg = slova.get(4).getImg();
		img = new Image(cestaImg);
		image = new ImageView(img);
		cesky = slova.get(4).getCesky();
		ceskyNazev = new Tooltip(cesky);
		tlacitka.add(button5);
		button5.setGraphic(image);
		button5.setId(slova.get(4).getAnglicky());
		button5.setTooltip(ceskyNazev);
		cestaImg = slova.get(5).getImg();
		img = new Image(cestaImg);
		image = new ImageView(img);
		cesky = slova.get(5).getCesky();
		ceskyNazev = new Tooltip(cesky);
		tlacitka.add(button6);
		button6.setGraphic(image);
		button6.setId(slova.get(5).getAnglicky());
		button6.setTooltip(ceskyNazev);

	}
}
