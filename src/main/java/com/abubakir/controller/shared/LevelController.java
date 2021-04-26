package com.abubakir.controller.shared;

import com.abubakir.model.shared.LEVEL_THRESHOLD;

import java.util.Arrays;

public class LevelController {


    public LevelController() {

    }

    public int calculateExpNeeded(int currentLevel, int currentExp, int targetLevel) {
        return calculateExpDistance(calculateCurrentTotalExp(currentLevel, currentExp), calculateExpNeededOnTargetLevel(targetLevel));
    }

    private int calculateExpDistance(int currentExp, int targetExp) {
        return targetExp - currentExp;
    }

    private int calculateCurrentTotalExp(int currentLevel, int currentExp) {
        //easier to work with total exp. Get total on start of current level, add current exp
        LEVEL_THRESHOLD anteriorLevel = getThresholdBylevel(currentLevel - 1);
        return anteriorLevel.getTotalExperienceOnStartOfNextLevel() + currentExp;
    }

    private int calculateExpNeededOnTargetLevel(int targetLevel) {
        return getThresholdBylevel(targetLevel - 1).getTotalExperienceOnStartOfNextLevel();
    }

    private LEVEL_THRESHOLD getThresholdBylevel(int level) {
        return Arrays.stream(LEVEL_THRESHOLD.values()).filter(lv -> lv.getLevel() == level).findFirst().orElse(null);
    }
}
