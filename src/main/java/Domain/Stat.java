package Domain;

import Types.GameObjectType;
import Types.StatType;

public class Stat extends GameObject {

    protected StatType statType;
    protected int value;

    public Stat(StatType type, int value) {
        super(GameObjectType.Stat);
        this.statType = type;
        this.value = value;
    }

    public StatType getStatType() {
        return statType;
    }

    public void setType(StatType statType) {
        this.statType = statType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
