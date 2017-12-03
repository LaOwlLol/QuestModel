package Factory;

import Domain.GameObject;
import Types.CriteriaType;

import java.nio.file.Path;
import java.util.List;

public interface Directory {
    void GenerateAssets(Path source);
    List<GameObject> Distribute(int[] assetIDs);
    Integer[] Search(CriteriaType[] criteria);
}
