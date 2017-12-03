package Domain;

import Types.GameObjectType;

import java.util.ArrayList;
import java.util.List;

public class Quest extends GameObject{

    protected String name;
    protected String description;
    protected List<QuestResult> results;

    public Quest(String name, String description) {
        super(GameObjectType.Quest);
        this.name = name;
        this.description = description;
        this.results = new ArrayList<QuestResult>();
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

    public List<QuestResult> getResults() {
        return results;
    }

    public void addResult(QuestResult result) {
        this.results.add(result);
    }
}
