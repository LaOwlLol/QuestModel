package Domain;

import Types.CriteriaType;

public class GameObject {
    protected CriteriaType criteriaType;

    public GameObject(CriteriaType criteriaType) {
        this.criteriaType = criteriaType;
    }

    public CriteriaType getCriteriaType() {
        return criteriaType;
    }

    public void setType(CriteriaType type) {
        this.criteriaType = type;
    }
}
