package Domain;

import Types.QuestResultType;

public class QuestResult implements Applyable {

    protected QuestResultType resultType;

    QuestResult(QuestResultType resultType) {
        this.resultType = resultType;
    }

    public QuestResultType getResultType() {
        return resultType;
    }

    public void setResultType(QuestResultType resultType) {
        this.resultType = resultType;
    }

    @Override
    public void apply(GameObject gameObject) {
        //TODO what is default apply like?
    }
}
