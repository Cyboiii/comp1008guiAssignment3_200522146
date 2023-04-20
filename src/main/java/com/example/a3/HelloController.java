package com.example.a3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Random;

public class HelloController {

    @FXML
    private Button Button;

    @FXML
    private Label Colour;

    @FXML
    private Label Label;

    @FXML
    private Label Name;

    @FXML
    private Pane box1;

    @FXML
    private Pane box2;

    @FXML
    private Pane box3;

    @FXML
    private Pane box4;

    @FXML
    private Pane box5;

    @FXML
    private Pane box6;

    @FXML
    private Pane box7;

    @FXML
    private Pane box8;

    @FXML
    private Pane box9;

    @FXML
    private TextField textbox1;

    @FXML
    private TextField textbox2;

    @FXML
    private TextField textbox3;

    @FXML
    private TextField textbox4;

    @FXML
    private TextField textbox5;

    @FXML
    private TextField textbox6;

    @FXML
    private TextField textbox7;

    @FXML
    private TextField textbox8;

    @FXML
    private TextField textbox9;

    @FXML
    private ColorPicker colour;

    @FXML
    private TextField name;

    @FXML
    private Label err;

    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<Color> usedColors = new ArrayList<>();

    @FXML
    void onButtonClick(ActionEvent event) {

        ArrayList<String> seatList = new ArrayList<>();
        seatList.add("box1");
        seatList.add("box2");
        seatList.add("box3");
        seatList.add("box4");
        seatList.add("box5");
        seatList.add("box6");
        seatList.add("box7");
        seatList.add("box8");
        seatList.add("box9");

        err.setText("");

        String receivedStudentName = name.getText().trim();
        Color colorset = colour.getValue();
        if (receivedStudentName.isBlank()) {
            err.setText("Enter the name here");
        } else if (receivedStudentName.length() < 6) {
            err.setText("Name cannot be less then 6 letters");
        } else if (list.contains(receivedStudentName)) {
            err.setText("Student already exists");
        } else if (usedColors.contains(colorset)) {
            err.setText("Color is already in use for another seat");
        } else {
            list.clear();
            list.addAll(seatList);
            Random random = new Random();
            int rand = random.nextInt(list.size());

            // Assign random seat to student
            String seat = list.get(rand);
            list.remove(rand);
            Label.setText(receivedStudentName.toUpperCase());
            Colour.setText(colorset.toString());
            switch (seat) {
                case "box1":
                    box1.setStyle("-fx-background-color: " + colorset.toString().replace("0x", "#") + ";");
                    textbox1.setText(receivedStudentName.toUpperCase());
                    break;
                case "box2":
                    box2.setStyle("-fx-background-color: " + colorset.toString().replace("0x", "#") + ";");
                    textbox2.setText(receivedStudentName.toUpperCase());
                    break;
                case "box3":
                    box3.setStyle("-fx-background-color: " + colorset.toString().replace("0x", "#") + ";");
                    textbox3.setText(receivedStudentName.toUpperCase());
                    break;
                case "box4":
                    box4.setStyle("-fx-background-color: " + colorset.toString().replace("0x", "#") + ";");
                    textbox4.setText(receivedStudentName.toUpperCase());
                    break;
                case "box5":
                    box5.setStyle("-fx-background-color: " + colorset.toString().replace("0x", "#") + ";");
                    textbox5.setText(receivedStudentName.toUpperCase());
                    break;
                case "box6":
                    box6.setStyle("-fx-background-color: " + colorset.toString().replace("0x", "#") + ";");
                    textbox6.setText(receivedStudentName.toUpperCase());
                    break;
                case "box7":
                    box7.setStyle("-fx-background-color: " + colorset.toString().replace("0x", "#") + ";");
                    textbox7.setText(receivedStudentName.toUpperCase());
                    break;
                case "box8":
                    box8.setStyle("-fx-background-color: " + colorset.toString().replace("0x", "#") + ";");
                    textbox8.setText(receivedStudentName.toUpperCase());
                    break;
                case "box9":
                    box9.setStyle("-fx-background-color: " + colorset.toString().replace("0x", "#") + ";");
                    textbox9.setText(receivedStudentName.toUpperCase());
                    break;
            }
            usedColors.add(colorset);
            name.clear();

        }
    }
}