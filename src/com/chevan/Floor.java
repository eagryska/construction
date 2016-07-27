package com.chevan;

/**
 * Created by localadmin on 7/27/16.
 */
public enum Floor {
    Carpet (1.5),
    Tile (2.25),
    Concrete (0.5),
    Hardwood (3.25),
    Trampoline (10.0);

    private final double costPerSqft;

    Floor(double costPerSqft) {
        this.costPerSqft = costPerSqft;
    }

    public double getCostPerSqft() {
        return costPerSqft;
    }
}
