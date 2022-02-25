package com.example.currencyconvertor;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
		VBox rootNode = fxmlLoader.load();

		MenuBar menuBar = createMenu();
		rootNode.getChildren().add(0,menuBar);

		Scene scene = new Scene(rootNode);

		primaryStage.setTitle("Currency Convertor");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);
	}

	public MenuBar createMenu()
	{
		// Menu

		Menu filemenu = new Menu("File");

		MenuItem newmenuItem = new MenuItem("New");

		newmenuItem.setOnAction(event->
		{
			System.out.println("New------> ");
		});

		SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();

		MenuItem exitmenuItem = new MenuItem("Exit");
		exitmenuItem.setOnAction(event->
		{
			Platform.exit();
		});
		filemenu.getItems().addAll(newmenuItem, separatorMenuItem, exitmenuItem);
		
		// Help 
		
		Menu helpmenu = new Menu("Help");
		MenuItem aboutmenuItem = new MenuItem("About");
		aboutmenuItem.setOnAction(event->
		{
			AboutUs();
		});
		helpmenu.getItems().addAll(aboutmenuItem);

		MenuBar menubar = new MenuBar();
		menubar.getMenus().addAll(filemenu, helpmenu);

		return menubar;

	}

	private void AboutUs() {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("About");
		alert.setHeaderText("Currency Convertor");
		alert.setContentText("This is currency converter.");
		alert.show();
	}

	public static void main(String [] args)
	{
		launch(args);
	}

}


