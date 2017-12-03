package Domain;

import Types.GameObjectType;

public class GameObject {
    protected GameObjectType gameObjectType;

    public GameObject(GameObjectType gameObjectType) {
        this.gameObjectType = gameObjectType;
    }

    public GameObjectType getGameObjectType() {
        return gameObjectType;
    }

    public void setType(GameObjectType type) {
        this.gameObjectType = type;
    }
}
