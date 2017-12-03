package Domain;

import Types.GameObjectType;
import Types.LootSlotType;

import java.util.ArrayList;
import java.util.List;

public class Loot extends GameObject {
    protected String name;
    protected String description;
    protected LootSlotType slotType;
    protected boolean equipped;
    protected List<Stat> stats;
    protected List<Effect> effects;

    public Loot(String name, String description, LootSlotType slotType) {
        super(GameObjectType.Loot);
        this.name = name;
        this.description = description;
        this.slotType = slotType;
        this.equipped = false;
        this.stats = new ArrayList<Stat>();
        this.effects = new ArrayList<Effect>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LootSlotType getSlotType() {
        return slotType;
    }

    public void setSlotType(LootSlotType slotType) {
        this.slotType = slotType;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public boolean equip() {
        if (this.equipped) {
            return false;
        }
        else {
            this.equipped = true;
            return true;
        }
    }

    public boolean unequip() {
        if (this.equipped) {
            this.equipped = false;
            return true;
        }
        else {
            return false;
        }
    }

    public void addStat(Stat stat) {
        this.stats.add(stat);
    }

    public void addEffect(Effect effect) {
        this.effects.add(effect);
    }
}
