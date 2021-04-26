package com.abubakir.view;

import com.abubakir.controller.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    private JButton ishgardCalculatorButton;
    private JButton genericCalculatorButton;
    private JButton exitButton;
    private JPanel mainPanel;
    private MainController mainController;

    public MainMenu() {
        this.mainController = new MainController();
        JFrame frame = new JFrame();
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createListeners();
        frame.pack();
        frame.setVisible(true);
    }

    private void createListeners() {
        exitButton.addActionListener(e -> System.exit(0));

        genericCalculatorButton.addActionListener(e -> mainController.calculateGenericActions());

        ishgardCalculatorButton.addActionListener(e -> mainController.calculateIshgardActions());
    }

}
