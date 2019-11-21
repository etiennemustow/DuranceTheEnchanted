import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuranceTest {

    private Durance durance;

    @Before
    public void setUp() {
        durance = new Durance(new Weapon("Katana of Hoshi", 10, 5.0f,
                "Blade received by Durance from the Lord of Stars"));
    }

    @Test
    public void durance_weapon_can_be_described() {
        assertEquals(durance.describeWeapon(), "Katana of Hoshi\n" +
                "10 attack\n" +
                "5.0 attack speed \n" +
                "\n" +
                "Blade received by Durance from the Lord of Stars");
    }

    @Test
    public void durance_weapon_can_be_enchanted() {
        durance.enchant();
        assertEquals(durance.describeWeapon(), "Ice Katana of Hoshi\n" +
                "10 attack\n" +
                "5.0 attack speed \n" +
                "+5 Ice Damage\n" +
                "Blade received by Durance from the Lord of Stars");
    }
}
