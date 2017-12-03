package Domain;

import Types.FactionType;

public interface FactionAligned {

    public FactionType alignment();

    default boolean isEvilFaction() {
        return this.alignment() == FactionType.Evil;
    }

    default boolean isNeutralFaction() {
        return this.alignment() == FactionType.Neutral;
    }

    default boolean isGoodFaction() {
        return this.alignment() == FactionType.Good;
    }

    default boolean  isAligned(FactionType alignment) {
        return this.alignment() == alignment;
    }

    default boolean isNeutral(FactionType alignment) {
        return this.alignment() == alignment || this.isNeutralFaction() || alignment == FactionType.Neutral;
    }

    default boolean isOpposed(FactionType alignment) {
        return !this.isAligned(alignment) && !this.isNeutral(alignment);
    }

}
