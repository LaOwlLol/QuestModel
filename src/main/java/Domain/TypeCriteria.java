package Domain;

import Types.GameObjectType;

public class TypeCriteria implements Criteria {
    GameObjectType type;

    public TypeCriteria(GameObjectType type) {
        this.type = type;
    }

    @Override
    public boolean isMatch(GameObject gameObject) {
        return this.type == gameObject.getGameObjectType();
    }
}
