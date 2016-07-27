package com.chevan;

/**
 * Created by localadmin on 7/27/16.
 */
public enum Paint {
    Matte (.50),
    Gloss (.60),
    SemiGloss (.65),
    Chrome (1.00),
    Textured (1.25);

    private final double costPerSqFt;

    Paint(double costPerSqFt) {
        this.costPerSqFt = costPerSqFt;
    }

    public double getCostPerSqFt() {
        return costPerSqFt;
    }
}
