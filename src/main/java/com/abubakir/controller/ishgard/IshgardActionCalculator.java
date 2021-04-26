package com.abubakir.controller.ishgard;

import com.abubakir.model.ishgard.reward.TIER_REWARD;

import javax.swing.*;

import static com.abubakir.model.ishgard.reward.TIER_REWARD.*;

public class IshgardActionCalculator {

    public IshgardActionCalculator() {

    }

    public void calculateActions(Integer currentLevel, Integer experienceRequired) {
        if (currentLevel >= 20 && currentLevel < 40) {
            JOptionPane.showMessageDialog(null, buildMessage(T20, experienceRequired));
        } else if (currentLevel >= 40 && currentLevel < 60) {
            JOptionPane.showMessageDialog(null, buildMessage(T40, experienceRequired));
        } else if (currentLevel >= 60 && currentLevel < 70) {
            JOptionPane.showMessageDialog(null, buildMessage(T60, experienceRequired));
        } else if (currentLevel >= 70 && currentLevel < 80) {
            JOptionPane.showMessageDialog(null, buildMessage(T70, experienceRequired));
        } else if (currentLevel >= 80) {
            JOptionPane.showMessageDialog(null, buildMessage(T80, experienceRequired));
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    private String buildMessage(TIER_REWARD tierReward, Integer experienceRequired) {
        StringBuilder sb = new StringBuilder();
        sb.append("You need: ").append(experienceRequired).append(" experience to reach target level");
        sb.append("\n\n");
        sb.append(tierReward.getLowReward().generateRewardMessage(experienceRequired));
        sb.append(tierReward.getMediumReward().generateRewardMessage(experienceRequired));
        sb.append(tierReward.getHighReward().generateRewardMessage(experienceRequired));
        return sb.toString();
    }

}
