package com.abubakir.controller.shared;

import com.abubakir.model.shared.LEVEL_THRESHOLD;

import java.util.Arrays;

public class LevelController {


    public LevelController() {

    }

    public Integer calculateExpNeeded(Integer currentLevel, Integer currentExp, Integer targetLevel) {
        return calculateExpDistance(calculateCurrentTotalExp(currentLevel, currentExp), calculateExpNeededOnTargetLevel(targetLevel));
    }

    private Integer calculateExpDistance(Integer currentExp, Integer targetExp) {
        return targetExp - currentExp;
    }

    private Integer calculateCurrentTotalExp(Integer currentLevel, Integer currentExp) {
        //easier to work with total exp. Get total on start of current level, add current exp
        LEVEL_THRESHOLD anteriorLevel = getThresholdBylevel(currentLevel - 1);
        return anteriorLevel.getTotalExperienceOnStartOfNextLevel() + currentExp;
    }

    private Integer calculateExpNeededOnTargetLevel(Integer targetLevel) {
        return getThresholdBylevel(targetLevel - 1).getTotalExperienceOnStartOfNextLevel();
    }

    private LEVEL_THRESHOLD getThresholdBylevel(Integer level) {
        return Arrays.stream(LEVEL_THRESHOLD.values()).filter(lv -> lv.getLevel().equals(level)).findFirst().orElse(null);
    }
}
