package Factory;

import Domain.Criteria;
import Domain.Faction;
import Domain.GameObject;
import Types.FactionType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FactionDirectory implements Directory {

    private HashMap<Integer, Faction> factions;
    private int last;

    public FactionDirectory() {
        this.factions = new HashMap<Integer, Faction>();
        this.last = 0;
    }

    @Override
    public void GenerateAssets(Path source) {
        try (Stream<String> data = Files.lines(source)) {
            data.map((line) -> {
                String[] row = line.split(",");
                return new Faction(row[0], FactionType.valueOf(row[1]));
            }).forEach((f) -> factions.put(last++, f));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<GameObject> Distribute(int[] assetIDs) {
        //TODO Distribute selected IDs
        return factions.values().stream().collect(Collectors.toList());
    }

    @Override
    public List<GameObject> Search(Criteria[] criteria) {
        //TODO filter by criteria.
        return factions.values().stream().filter((f) ->
           Arrays.stream(criteria).map((c)-> c.isMatch(f)).reduce(Boolean::logicalOr).isPresent()
        ).collect(Collectors.toList());
    }

}
