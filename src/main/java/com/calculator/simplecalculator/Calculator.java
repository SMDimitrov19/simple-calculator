package com.calculator.simplecalculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    TextField textField;

    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));

        textField = new TextField();
        textField.setAlignment(Pos.BASELINE_RIGHT);
        textField.setPrefWidth(230);
        textField.setPrefHeight(100);
        textField.setStyle("-fx-font-size: 36px;");
        textField.setEditable(false);
        textField.setText("0");

        gridPane.add(textField,0,0,4,1);

        Button buttonNumberZero = new Button("0");
        buttonNumberZero.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button buttonNumberOne = new Button("1");
        buttonNumberOne.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button buttonNumberTwo = new Button("2");
        buttonNumberTwo.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button buttonNumberThree = new Button("3");
        buttonNumberThree.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button buttonNumberFour = new Button("4");
        buttonNumberFour.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button buttonNumberFive = new Button("5");
        buttonNumberFive.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button buttonNumberSix = new Button("6");
        Button buttonNumberSeven = new Button("7");
        Button buttonNumberEight = new Button("8");
        Button buttonNumberNine = new Button("9");

        Button buttonAddition = new Button("+");
        Button buttonSubtraction = new Button("-");
        Button buttonMultiplication = new Button("*");
        Button buttonDivision = new Button("/");
        Button buttonEquals = new Button("=");
        Button buttonClear = new Button("C");

        gridPane.add(buttonClear, 2, 1);
        gridPane.add(buttonDivision, 3, 1);

        gridPane.add(buttonNumberSeven,0,2);
        gridPane.add(buttonNumberEight,1,2);
        gridPane.add(buttonNumberNine,2,2);
        gridPane.add(buttonMultiplication,3,2);

        gridPane.add(buttonNumberFour,0,3);
        gridPane.add(buttonNumberFive,1,3);
        gridPane.add(buttonNumberSix,2,3);
        gridPane.add(buttonSubtraction,3,3);

        gridPane.add(buttonNumberOne,0,4);
        gridPane.add(buttonNumberTwo,1,4);
        gridPane.add(buttonNumberThree,2,4);
        gridPane.add(buttonAddition,3,4);

        gridPane.add(buttonNumberZero,1,5);
        gridPane.add(buttonEquals,3,5);

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}