package Domain;

import Types.CriteriaType;

public class SearchCriteria implements Criteria {
    CriteriaType type;

    public SearchCriteria(CriteriaType type) {
        this.type = type;
    }

    @Override
    public boolean isMatch(GameObject gameObject) {
        return this.type == gameObject.getCriteriaType();
    }
}
