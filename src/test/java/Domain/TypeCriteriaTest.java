package Domain;

import Types.GameObjectType;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TypeCriteriaTest {
    @Test
    public void isMatch() {
        GameObject ego = new GameObject(GameObjectType.Effect);
        GameObject sgo = new GameObject(GameObjectType.Stat);
        TypeCriteria sc = new TypeCriteria(GameObjectType.Effect);

        assertTrue("Failed TypeCriteria isMatch -> true on matching criteria types.", sc.isMatch(ego));
        assertFalse("Failed TypeCriteria isMatch -> false on different criteria types.", sc.isMatch(sgo));
    }
}
