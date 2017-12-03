package Factory;

import Domain.GameObject;
import Types.CriteriaType;

import java.util.List;

public interface Directory {
    void GenerateAssets();
    List<GameObject> Distribute(int[] assetIDs);
    Integer[] Search(CriteriaType[] criteria);
}
