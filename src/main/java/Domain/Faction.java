package Domain;

import Types.GameObjectType;
import Types.FactionType;

public class Faction extends GameObject implements FactionAligned {
    protected String name;
    protected FactionType factionType;

    public Faction(String name, FactionType factionType) {
        super(GameObjectType.Faction);
        this.name = name;
        this.factionType = factionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FactionType getFactionType() {
        return factionType;
    }

    public void setFactionType(FactionType factionType) {
        this.factionType = factionType;
    }

    @Override
    public FactionType alignment() {
        return this.factionType;
    }

    @Override
    public String toString() {
        return "Faction -> " +
            name + ": " + factionType;
    }
}
