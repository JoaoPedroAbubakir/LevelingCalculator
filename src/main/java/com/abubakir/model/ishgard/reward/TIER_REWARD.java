package com.abubakir.model.ishgard.reward;

import com.abubakir.model.ishgard.reward.HighReward;
import com.abubakir.model.ishgard.reward.LowReward;
import com.abubakir.model.ishgard.reward.MediumReward;

public enum TIER_REWARD {

    T20(new LowReward(50, 3, 60480),
            new MediumReward(80, 4, 107430),
            new HighReward(105, 5, 153534)),
    T40(new LowReward(90, 7, 233729),
            new MediumReward(150, 8, 459534),
            new HighReward(380, 9, 928236)),
    T60(new LowReward(300, 11, 1285456),
            new MediumReward(850, 13, 1420821),
            new HighReward(1320, 15, 1771387)),
    T70(new LowReward(480, 18, 2263139),
            new MediumReward(2180, 20, 3123696),
            new HighReward(2880, 22, 4466794)),
    T80(new LowReward(1350, 31, 4877967),
            new MediumReward(1890, 47, 5365763),
            new HighReward(3150, 63, 5853560));

    private final LowReward lowReward;
    private final MediumReward mediumReward;
    private final HighReward highReward;

    TIER_REWARD(LowReward lowReward, MediumReward mediumReward, HighReward highReward) {
        this.lowReward = lowReward;
        this.mediumReward = mediumReward;
        this.highReward = highReward;
    }

    public LowReward getLowReward() {
        return lowReward;
    }

    public MediumReward getMediumReward() {
        return mediumReward;
    }

    public HighReward getHighReward() {
        return highReward;
    }
}
