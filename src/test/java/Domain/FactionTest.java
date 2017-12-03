package Domain;

import Types.FactionType;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class FactionTest {

    @Test
    public void isGoodFaction() {
        Faction g = new Faction( "Good", FactionType.Good);
        Faction n = new Faction("Neutral", FactionType.Neutral);
        Faction e = new Faction("Evil", FactionType.Evil);
        assertTrue("Failed isGoodFaction -> true with good faction.", g.isGoodFaction());
        assertFalse("Failed isGoodFaction -> with evil faction.", e.isGoodFaction());
        assertFalse("Failed isGoodFaction -> with neutral faction", n.isGoodFaction());
    }

    @Test
    public void isEvilFaction() {
        Faction e = new Faction("Evil", FactionType.Evil);
        Faction g = new Faction( "Good", FactionType.Good);
        Faction n = new Faction("Neutral", FactionType.Neutral);
        assertTrue("Failed isEvilFaction -> true with evil faction.", e.isEvilFaction());
        assertFalse("Failed isEvilFaction -> false with good faction.", g.isEvilFaction());
        assertFalse("Failed isEvilFaction -> false with neutral faction.", n.isEvilFaction());
    }

    @Test
    public void isNeutralFaction() {
        Faction n = new Faction("Neutral", FactionType.Neutral);
        Faction e = new Faction("Evil", FactionType.Evil);
        Faction g = new Faction( "Good", FactionType.Good);
        assertTrue("Failed isNeutralFaction -> true with neutral faction.", n.isNeutralFaction());
        assertFalse("Failed isNeutralFaction -> false with good faction.", g.isNeutralFaction());
        assertFalse("Failed isNeutralFaction -> false with evil faction.", e.isNeutralFaction());
    }

    @Test
    public void isAligned() {
        Faction g = new Faction("Good", FactionType.Good);
        Faction g2 = new Faction( "AlsoGood", FactionType.Good);
        Faction e = new Faction("Evil", FactionType.Evil);

        assertTrue("Failed isAligned -> true with aligned factions.", g.isAligned(g2.alignment()));
        assertFalse("Failed isAligned -> false with two opposing factions.", g.isAligned(e.alignment()));

    }

    @Test
    public void isNeutral() {
        Faction n = new Faction("Neutral", FactionType.Neutral);
        Faction e = new Faction("Evil", FactionType.Evil);
        Faction e2 = new Faction( "AlsoEvil", FactionType.Evil);
        Faction g = new Faction( "Good", FactionType.Good);
        Faction g2 = new Faction( "AlsoGood", FactionType.Good);

        assertTrue("Failed isNeutral -> true with two good factions.", g.isNeutral(g2.alignment()));
        assertTrue("Failed isNeutral -> true with two evil factions.", e.isNeutral(e2.alignment()));
        assertFalse("Failed isNeutral -> false with two opposing factions", g.isNeutral(e.alignment()));
        assertTrue("Failed isNeutral -> true with good and neutral factions.", g.isNeutral(n.alignment()));
        assertTrue("Failed isNeutral -> true with evil and neutral factions.", e.isNeutral(n.alignment()));
    }

    @Test
    public void isOpposed() {
        Faction n = new Faction("Neutral", FactionType.Neutral);
        Faction e = new Faction("Evil", FactionType.Evil);
        Faction e2 = new Faction( "AlsoEvil", FactionType.Evil);
        Faction g = new Faction( "Good", FactionType.Good);
        Faction g2 = new Faction( "AlsoGood", FactionType.Good);

        assertFalse("Failed isOpposed -> false with two good factions.", g.isOpposed(g2.alignment()));
        assertFalse("Failed isOpposed -> false with two evil factions.", e.isOpposed(e2.alignment()));
        assertTrue("Failed isOpposed -> true with two opposing factions", g.isOpposed(e.alignment()));
        assertFalse("Failed isOpposed -> false with good and neutral factions.", g.isOpposed(n.alignment()));
        assertFalse("Failed isOpposed -> false with evil and neutral factions.", e.isOpposed(n.alignment()));
    }
}
