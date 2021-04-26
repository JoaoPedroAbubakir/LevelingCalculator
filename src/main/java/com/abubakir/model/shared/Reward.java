package com.abubakir.model.shared;

public abstract class Reward {

    private int minimumCollectivity;
    private int scriptsRewarded;
    private int experienceRewarded;

    protected Reward(int minimumCollectivity, int scriptsRewarded, int experienceRewarded) {
        this.minimumCollectivity = minimumCollectivity;
        this.scriptsRewarded = scriptsRewarded;
        this.experienceRewarded = experienceRewarded;
    }

    public String generateRewardMessage(int experienceRequired) {
        return buildMessage(calculateActions(experienceRequired));
    }

    private String buildMessage(int actionsNeeded) {
        Integer scriptsAwarded = actionsNeeded * this.scriptsRewarded;
        Integer totalExperienceAwarded = actionsNeeded * this.experienceRewarded;
        StringBuilder sb = new StringBuilder();
        sb.append("Collectivity at least: ").append(this.minimumCollectivity).append("\n");
        sb.append("Actions needed: ").append(actionsNeeded).append("\n");
        sb.append("Total scripts awarded: ").append(scriptsAwarded).append("\n");
        sb.append("Total exp awarded: ").append(totalExperienceAwarded).append("\n");
        sb.append("---------------------------------------------------------------").append("\n");
        return sb.toString();
    }

    private int calculateActions(int experienceRequired) {
        return (int) Math.ceil((double) experienceRequired / this.experienceRewarded);
    }

    public int getMinimumCollectivity() {
        return minimumCollectivity;
    }

    public void setMinimumCollectivity(int minimumCollectivity) {
        this.minimumCollectivity = minimumCollectivity;
    }

    public int getScriptsRewarded() {
        return scriptsRewarded;
    }

    public void setScriptsRewarded(int scriptsRewarded) {
        this.scriptsRewarded = scriptsRewarded;
    }

    public int getExperienceRewarded() {
        return experienceRewarded;
    }

    public void setExperienceRewarded(int experienceRewarded) {
        this.experienceRewarded = experienceRewarded;
    }
}
