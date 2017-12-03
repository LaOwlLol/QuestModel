package Domain;

import Types.GameObjectType;
import Types.EffectBaseType;
import Types.EffectMechanicType;

public class Effect extends GameObject {

    protected String name;
    protected EffectMechanicType mechanicType;
    protected EffectBaseType baseType;
    protected int value;
    protected int duration;

    public Effect(String name, EffectMechanicType mechanicType, EffectBaseType baseType, int value, int duration) {
        super(GameObjectType.Effect);
        this.name = name;
        this.mechanicType = mechanicType;
        this.baseType = baseType;
        this.value = value;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EffectMechanicType getMechanicType() {
        return mechanicType;
    }

    public void setMechanicType(EffectMechanicType mechanicType) {
        this.mechanicType = mechanicType;
    }

    public EffectBaseType getBaseType() {
        return baseType;
    }

    public void setBaseType(EffectBaseType baseType) {
        this.baseType = baseType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
