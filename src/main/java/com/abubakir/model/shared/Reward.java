package com.abubakir.model.shared;

public abstract class Reward {

    private Integer minimumCollectivity;
    private Integer scriptsRewarded;
    private Integer experienceRewarded;

    protected Reward(Integer minimumCollectivity, Integer scriptsRewarded, Integer experienceRewarded) {
        this.minimumCollectivity = minimumCollectivity;
        this.scriptsRewarded = scriptsRewarded;
        this.experienceRewarded = experienceRewarded;
    }

    public String generateRewardMessage(Integer experienceRequired) {
        return buildMessage(calculateActions(experienceRequired));
    }

    private String buildMessage(Integer actionsNeeded) {
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

    private Integer calculateActions(Integer experienceRequired) {
        return (int) Math.ceil((double) experienceRequired / this.experienceRewarded);
    }

    public Integer getMinimumCollectivity() {
        return minimumCollectivity;
    }

    public void setMinimumCollectivity(Integer minimumCollectivity) {
        this.minimumCollectivity = minimumCollectivity;
    }

    public Integer getScriptsRewarded() {
        return scriptsRewarded;
    }

    public void setScriptsRewarded(Integer scriptsRewarded) {
        this.scriptsRewarded = scriptsRewarded;
    }

    public Integer getExperienceRewarded() {
        return experienceRewarded;
    }

    public void setExperienceRewarded(Integer experienceRewarded) {
        this.experienceRewarded = experienceRewarded;
    }
}
