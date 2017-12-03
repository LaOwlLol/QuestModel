package Factory;

import Domain.Criteria;
import Domain.GameObject;

import java.nio.file.Path;
import java.util.List;

public interface Directory {
    void GenerateAssets(Path source);
    List<GameObject> Distribute(int[] assetIDs);
    Integer[] Search(Criteria[] criteria);
}
