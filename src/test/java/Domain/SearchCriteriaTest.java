package Domain;

import Types.CriteriaType;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SearchCriteriaTest {
    @Test
    public void isMatch() {
        GameObject ego = new GameObject(CriteriaType.Effect);
        GameObject sgo = new GameObject(CriteriaType.Stat);
        SearchCriteria sc = new SearchCriteria(CriteriaType.Effect);

        assertTrue("Failed SearchCriteria isMatch -> true on matching criteria types.", sc.isMatch(ego));
        assertFalse("Failed SearchCriteria isMatch -> false on different criteria types.", sc.isMatch(sgo));
    }
}
