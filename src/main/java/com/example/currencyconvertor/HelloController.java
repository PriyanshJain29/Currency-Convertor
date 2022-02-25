package com.example.currencyconvertor;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Region;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

	@FXML
	public Label WelcomeLabel;

	@FXML
	public ChoiceBox <String> choiceBox;

	private static final String INDIAN_RUPEE = "Indian Rupee";
	private static final String UAE = "United Arabian Amirates";
	private static final String US_Dollar = "Us Dollar";
	private static final String Aus_Dollar = "Austrailan Dollar";
	private static final String British = "British Pound";

	@FXML
	public ChoiceBox <String> choiceBox2;
	private static final String INDIAN = "Indian Rupee";
	private static final String U_A_E = "United Arabian Amirates";
	private static final String US__Dollar = "Us Dollar";
	private static final String Aus__Dollar = "Austrailan Dollar";
	private static final String British_pound = "British Pound";


	@FXML
	public TextField textfield;

	@FXML
	public Button convertButton;

	// For Indian

	private boolean is_Indian = true;
	private boolean is__USDOLLAR = true;
	private boolean is__UAE = true;
	private boolean is__Aus = true;
	private boolean is__British = true;

	// For UAE

	private boolean isIs__UAE = true;
	private boolean isIs_Indian = true;
	private boolean isIs__USDOLLAR = true;
	private boolean isIs__Aus = true;
	private boolean isIs__British = true;

	// For US Dollar

	private boolean isIsIs__USDOLLAR;
	private boolean isISIs__Indian;
	private boolean isIsIs__UAE;
	private boolean isIsIs__Aus;
	private boolean isIsIs__British;

	// For Australian

	private boolean isISISIS__Aus;
	private boolean isISISIS_INDIAN;
	private boolean isISISIS_UAE;
	private boolean isISISIS__USDOLLAR;
	private boolean isISISIS__British;

	// For British Pound

	private boolean isISISISIS__British;
	private boolean isISISISIS__INDIAN;
	private boolean isISISISIS__UAE;
	private boolean isISISISIS__USDOLLAR;
	private boolean isISISISIS__Aus;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

		choiceBox.getItems().add(INDIAN);
		choiceBox.getItems().add(UAE);
		choiceBox.getItems().add(US_Dollar);
		choiceBox.getItems().add(Aus_Dollar);
		choiceBox.getItems().add(British);

		choiceBox.setValue(US_Dollar);

		// Choice Box -2

		choiceBox2.getItems().add(INDIAN_RUPEE);
		choiceBox2.getItems().add(U_A_E);
		choiceBox2.getItems().add(US__Dollar);
		choiceBox2.getItems().add(Aus__Dollar);
		choiceBox2.getItems().add(British_pound);

		choiceBox2.setValue(INDIAN_RUPEE);

		choiceBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {

				//-------------------INDIA-------------//

				if(newValue.equals(INDIAN))
				{
					is_Indian = true;
				}
				else
				{
					is_Indian = false;
				}

				// ----------------UAE-------------//


				if(newValue.equals(UAE))
				{
					isIs__UAE = true;
				}
				else
				{
					isIs__UAE = false;
				}

				//--------------- US DOLLAR ---------------//

				if(newValue.equals(US_Dollar))
				{
					isIsIs__USDOLLAR = true;
				}
				else
				{
					isIsIs__USDOLLAR = false;
				}

				//----------------- Australian Dollar -----------//

				if(newValue.equals(Aus_Dollar))
				{
					isISISIS__Aus = true;
				}
				else
				{
					isISISIS__Aus = false;
				}

				//-------------- British Pound ---------------//

				if(newValue.equals(British))
				{
					isISISISIS__British = true;
				}
				else
				{
					isISISISIS__British = false;
				}

			}
		});
		choiceBox2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {

				// --------- Indian Rupee---------//

				// For Us Dollar

				if (newValue.equals(US__Dollar)) {
					is__USDOLLAR = true;
				}
				else {
					is__USDOLLAR = false;
				}

				// For UAE

				if (newValue.equals(U_A_E)) {
					is__UAE = true;
				} else {
					is__UAE = false;
				}

				// For Australian Dollar

				if (newValue.equals(Aus__Dollar)) {
					is__Aus = true;
				}
				else {
					is__Aus = false;
				}

				// For British Pound

				if (newValue.equals(British_pound)) {
					is__British = true;
				}
				else {
					is__British = false;
				}

				//-------------UAE--------------//

				// For Indian Rupee

				if (newValue.equals(INDIAN_RUPEE)) {
					isIs_Indian = true;
				}
				else {
					isIs_Indian = false;
				}

				// For US Dollar

				if (newValue.equals(US__Dollar)) {
					isIs__USDOLLAR = true;
				}
				else {
					isIs__USDOLLAR = false;
				}

				// For Australian Dollar

				if (newValue.equals(Aus__Dollar)) {
					isIs__Aus = true;
				}
				else {
					isIs__Aus = false;
				}

				// For British pound

				if (newValue.equals(British_pound)) {
					isIs__British = true;
				}
				else {
					isIs__British = false;
				}

				//------------ US Dollar---------//

				// For Indian Rupee

				if(newValue.equals(INDIAN_RUPEE))
				{
					isISIs__Indian = true;
				}
				else
				{
					isISIs__Indian = false;
				}

				// For UAE
				if(newValue.equals(U_A_E))
				{
					isIsIs__UAE = true;
				}
				else
				{
					isIsIs__UAE = false;
				}

				// FOR Australian Dollar

				if(newValue.equals(Aus__Dollar))
				{
					isIsIs__Aus = true;
				}
				else
				{
					isIsIs__Aus = false;
				}

				// For British Pound

				if(newValue.equals(British_pound))
				{
					isIsIs__British = true;
				}
				else
				{
					isIsIs__British = false;
				}

				//----------------- Australian Dollar -----------//

				// For Indian Rupee

				if(newValue.equals(INDIAN_RUPEE))
				{
					isISISIS_INDIAN = true;
				}
				else
				{
					isISISIS_INDIAN = false;
				}

				// For UAE

				if(newValue.equals(U_A_E))
				{
					isISISIS_UAE = true;
				}
				else
				{
					isISISIS_UAE = false;
				}


				// For US Dollar

				if(newValue.equals(US__Dollar))
				{
					isISISIS__USDOLLAR = true;
				}
				else
				{
					isISISIS__USDOLLAR = false;
				}

				// For British Pound

				if(newValue.equals(British_pound))
				{
					isISISIS__British = true;
				}
				else
				{
					isISISIS__British = false;
				}

				//-------------- British Pound ---------------//

				// For Indian Rupee

				if(newValue.equals(INDIAN_RUPEE))
				{
					isISISISIS__INDIAN = true;
				}
				else
				{
					isISISISIS__INDIAN = false;
				}

				// For UAE

				if(newValue.equals(U_A_E))
				{
					isISISISIS__UAE = true;
				}
				else
				{
					isISISISIS__UAE = false;
				}

				// For US Dollar

				if(newValue.equals(US__Dollar))
				{
					isISISISIS__USDOLLAR = true;
				}
				else
				{
					isISISISIS__USDOLLAR = false;
				}

				// For Australian Dollar

				if(newValue.equals(Aus__Dollar))
				{
					isISISISIS__Aus = true;
				}
				else
				{
					isISISISIS__Aus = false;
				}


			}
		});

		convertButton.setOnAction(event->
		{
			convert();
		});
	}

	private void convert() {
		String input = textfield.getText();
		double enteredCurrency = 0.0;
		try {
			enteredCurrency = Double.parseDouble(input);
		}
		catch (Exception exception)
		{
			warnuser();
			return;
		}
		double newCurrency = 0.0;

		//---------------- Indian Rupee-------------//

		// For Indian to US Currency

		if(is_Indian && is__USDOLLAR)
		{
			newCurrency = (enteredCurrency * 0.014);
		}

		// For Indian to UAE Currency

		else if(is_Indian && is__UAE)
		{
			newCurrency = (enteredCurrency * 0.050);
		}

		// For Indain To Australian Dollar

		else if(is_Indian && is__Aus)
		{
			newCurrency = (enteredCurrency * 0.019);
		}

		// For Indian to British Pound

		else if(is_Indian && is__British)
		{
			newCurrency = (enteredCurrency * 0.0099);
		}

		// ---------------- UAE----------------//

		// For UAE to Indain Rupee


		else if(isIs__UAE && isIs_Indian)
		{
			newCurrency = (enteredCurrency * 20.10);
		}

		// For UAE to US Dollar

		else if(isIs__UAE && isIs__USDOLLAR)
		{
			newCurrency = (enteredCurrency * 0.27);
		}

		// For UAE to Australian Dollar

		else if(isIs__UAE && isIs__Aus)
		{
			newCurrency = (enteredCurrency * 1.38);
		}

		// For UAE to British Pound

		else if(isIs__UAE && isIs__British)
		{
			newCurrency = (enteredCurrency * 0.20);
		}

		//----------- US Dollar-----------//

		// For US Dollar to Indian Rupee

		else if(isIsIs__USDOLLAR && isISIs__Indian)
		{
			newCurrency = (enteredCurrency * 73.81);
		}

		// For Us Dollar to UAE

		else if(isIsIs__USDOLLAR && isIsIs__UAE)
		{
			newCurrency = (enteredCurrency * 3.67);
		}

		// For US Dollar To Aus Dollar

		else if(isIsIs__USDOLLAR && isIsIs__Aus)
		{
			newCurrency = (enteredCurrency * 1.38 );
		}

		// For US Dollar to British Pound

		else if(isIsIs__USDOLLAR && isIsIs__British)
		{
			newCurrency = (enteredCurrency * 0.73);
		}

		//----------------- Australian Dollar -----------//

		// For Indian Rupee

		else if(isISISIS__Aus && isISISIS_INDIAN)
		{
			newCurrency = (enteredCurrency * 53.60);
		}

		// For UAE

		else if(isISISIS__Aus && isISISIS_UAE)
		{
			newCurrency = (enteredCurrency * 2.67);
		}


		// For US Dollar

		else if(isISISIS__Aus && isISISIS__USDOLLAR)
		{
			newCurrency = (enteredCurrency * 0.73);
		}

		// For British Pound

		else if(isISISIS__Aus && isISISIS__British)
		{
			newCurrency = (enteredCurrency * 0.53);
		}

		//-------------- British Pound ---------------//

		// For Indian Rupee

		else if(isISISISIS__British && isISISISIS__INDIAN)
		{
			newCurrency = (enteredCurrency * 101.01);
		}

		// For UAE

		else if (isISISISIS__British && isISISISIS__UAE)
		{
			newCurrency = (enteredCurrency * 5.03);
		}

		// For US Dollar

		else if (isISISISIS__British && isISISISIS__USDOLLAR)
		{
			newCurrency = (enteredCurrency * 1.37);
		}

		// For Australian Dollar

		else if (isISISISIS__British && isISISISIS__Aus)
		{
			newCurrency = (enteredCurrency * 1.88);
		}

		display(newCurrency);

	}



	private void display(Double newCurrency)
	{
		String unit = (isIs_Indian || isISIs__Indian || isISISIS_INDIAN || isISISISIS__INDIAN) ? "INR" : (is__UAE || isIsIs__UAE || isISISIS_UAE || isISISISIS__UAE) ? "AED" : (is__USDOLLAR || isIs__USDOLLAR || isISISIS__USDOLLAR || isISISISIS__USDOLLAR) ? "USD" : (is__Aus || isIs__Aus || isIsIs__Aus || isISISISIS__Aus) ? "AUD": "GBP";

		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Result");
		alert.setHeaderText("Currency Convertor");
		alert.setContentText(unit + " - " + newCurrency);
		alert.show();
		alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
	}

	private void warnuser()
	{
		Alert alertwarn = new Alert(Alert.AlertType.ERROR);
		alertwarn.setTitle("Error");
		alertwarn.setHeaderText("Invalid Amount Entered");
		alertwarn.setContentText("Enter The Valid Amount");
		alertwarn.show();
		alertwarn.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
	}
}

// INR-indian rupees