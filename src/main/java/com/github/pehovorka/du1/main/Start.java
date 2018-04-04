package com.github.pehovorka.du1.main;

import com.github.pehovorka.du1.ui.HomeController;
import com.github.pehovorka.du1.logika.Hra;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Start extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/MainWindow.fxml"));
		Parent root = loader.load();

		HomeController controller = loader.getController();
		Hra hra = new Hra();
		controller.inicializuj(hra);

		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		primaryStage.setTitle("Angličtina");
		primaryStage.setMinWidth(1024);
		primaryStage.setMinHeight(768);
		primaryStage.setMaxWidth(1600);
		primaryStage.setMaxHeight(1069);
	}

}
