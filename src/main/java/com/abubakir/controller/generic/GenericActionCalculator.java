package com.abubakir.controller.generic;

import javax.swing.*;

public class GenericActionCalculator {

    public GenericActionCalculator() {

    }

    public void calculateActions(int expNeeded, int expRewarded) {
        JOptionPane.showMessageDialog(null, "You need: "
                + ((int) Math.ceil((double) expNeeded / expRewarded)) + " actions \n"
                + "To reach the target level"
        );
    }
}
