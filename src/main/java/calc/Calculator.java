package calc;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculator implements Initializable {

	@FXML
	public Button one;
	public Button two;
	public Button three;
	public Button four;
	public Button five;
	public Button six;
	public Button seven;
	public Button eight;
	public Button nine;

	public Button plus;
	public Button minus;
	public Button mal;
	public Button slash;

	public TextField input;
	public Label prom;

	public Button Cr;
	public Button procent;
	public Button zero;
	public Button zerozero;
	public Button dot;
	public Button CC;
	public Button is;

	private double fnumber;
	private double snumber;
	private String operation;

	public void initialize(URL arg0, ResourceBundle arg1) {
	}

	public void one() {
		String oldvalue = input.getText();
		String set = "1";
		input.setText(oldvalue + set);
	}

	public void two() {
		String oldvalue = input.getText();
		String set = "2";
		input.setText(oldvalue + set);
	}

	public void three() {
		String oldvalue = input.getText();
		String set = "3";
		input.setText(oldvalue + set);
	}

	public void four() {
		String oldvalue = input.getText();
		String set = "4";
		input.setText(oldvalue + set);
	}

	public void five() {
		String oldvalue = input.getText();
		String set = "5";
		input.setText(oldvalue + set);
	}

	public void six() {
		String oldvalue = input.getText();
		String set = "6";
		input.setText(oldvalue + set);
	}

	public void seven() {
		String oldvalue = input.getText();
		String set = "7";
		input.setText(oldvalue + set);
	}

	public void eight() {
		String oldvalue = input.getText();
		String set = "8";
		input.setText(oldvalue + set);
	}

	public void nine() {
		String oldvalue = input.getText();
		String set = "9";
		input.setText(oldvalue + set);
	}

	public void dot() {
		String oldvalue = input.getText();
		String set = ".";
		input.setText(oldvalue + set);
	}

	public void zerozero() {
		String oldvalue = input.getText();
		String set = "00";
		input.setText(oldvalue + set);
	}

	public void zero() {
		String oldvalue = input.getText();
		String set = "0";
		input.setText(oldvalue + set);
	}

	public void clear() {
		input.setText("");
		prom.setText("");
		this.fnumber = 0;
		this.snumber = 0;
	}

	public void dziel() {
		String value = input.getText();
		double valuenumber = Double.parseDouble(value);
		this.fnumber = valuenumber;
		input.setText("");
		prom.setText(value + "/");
		operation = "/";

	}

	public void minus() {
		String value = input.getText();
		double valuenumber = Double.parseDouble(value);
		this.fnumber = valuenumber;
		input.setText("");
		prom.setText(value + "-");
		operation = "-";
	}

	public void plus() {
		String value = input.getText();
		double valuenumber = Double.parseDouble(value);
		this.fnumber = valuenumber;
		input.setText("");
		prom.setText(value + "+");
		operation = "+";
	}

	public void mnoz() {
		String value = input.getText();
		double valuenumber = Double.parseDouble(value);
		this.fnumber = valuenumber;
		input.setText("");
		prom.setText(value + "x");
		operation = "x";
	}

	public void procent() {
		String value = input.getText();
		double valuenumber = Double.parseDouble(value) ;
		double valuenumber2 = valuenumber*100;
		this.fnumber = valuenumber2;
		input.setText("");
		prom.setText(fnumber + "%");
		operation = "%";
	}

	public void wybierz_clicka() {
		switch (operation) {
		case "+":
			String value = input.getText();
			
			this.snumber = Double.parseDouble(value);
			double system = this.fnumber + this.snumber;
			input.setText(String.valueOf(system));
			String oldprom = prom.getText();
			prom.setText(oldprom + value);
			break;
		case "-":
			String valuemin = input.getText();
			this.snumber = Double.parseDouble(valuemin);
			double systemmin = this.fnumber - this.snumber;
			input.setText(String.valueOf(systemmin));
			String oldprommin = prom.getText();
			prom.setText(oldprommin + valuemin);
			break;
		case "/":
			String valuedz = input.getText();
			this.snumber = Double.parseDouble(valuedz);
			double systemdz = this.fnumber / this.snumber;
			input.setText(String.valueOf(systemdz));
			String oldpromdz = prom.getText();
			prom.setText(oldpromdz + valuedz);
			break;
		case "x":
			String valuemn = input.getText();
			this.snumber = Double.parseDouble(valuemn);
			double systemmn = this.fnumber * this.snumber;
			input.setText(String.valueOf(systemmn));
			String oldprommn = prom.getText();
			prom.setText(oldprommn + valuemn);
			break;
			}
	}
}
