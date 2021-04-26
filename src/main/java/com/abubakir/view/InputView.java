package com.abubakir.view;

import javax.swing.*;

public class InputView {

    public InputView() {

    }

    public Integer askForIntegerInput(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

}
