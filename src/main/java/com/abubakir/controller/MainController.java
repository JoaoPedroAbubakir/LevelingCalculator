package com.abubakir.controller;

import com.abubakir.controller.generic.GenericActionCalculator;
import com.abubakir.controller.ishgard.IshgardActionCalculator;
import com.abubakir.controller.shared.LevelController;
import com.abubakir.view.InputView;

public class MainController {

    private IshgardActionCalculator ishgardActionCalculator;
    private GenericActionCalculator genericActionCalculator;
    private LevelController levelController;
    private InputView inputView;

    public MainController() {
        this.ishgardActionCalculator = new IshgardActionCalculator();
        this.genericActionCalculator = new GenericActionCalculator();
        this.levelController = new LevelController();
        this.inputView = new InputView();
    }

    public void calculateIshgardActions() {
        int currentLevel = askForCurrentLevel();
        int currentExp = askForCurrentExp();
        int targetLevel = askForTargetLevel();
        this.ishgardActionCalculator.calculateActions(currentLevel, this.levelController.calculateExpNeeded(currentLevel,
                currentExp, targetLevel));
    }

    public void calculateGenericActions() {
        int currentLevel = askForCurrentLevel();
        int currentExp = askForCurrentExp();
        int targetLevel = askForTargetLevel();
        int expRewarded = askForRewardedExp();
        this.genericActionCalculator.calculateActions(this.levelController.calculateExpNeeded(currentLevel,
                currentExp, targetLevel), expRewarded);
    }

    private int askForCurrentLevel() {
        return this.inputView.askForIntegerInput("Enter current level");
    }

    private int askForCurrentExp() {
        return this.inputView.askForIntegerInput("Enter current exp");
    }

    private int askForTargetLevel() {
        return this.inputView.askForIntegerInput("Enter target level");
    }

    private int askForRewardedExp() {
        return this.inputView.askForIntegerInput("Enter rewarded exp for action");
    }


}
