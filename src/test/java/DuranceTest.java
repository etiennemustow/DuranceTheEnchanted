import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class DuranceTest {

    private Durance durance;

    @Before
    public void setUp() {
        durance = new Durance(new Weapon("Katana of Hoshi", 10, 5.0f,
                "Blade received by Durance from the Lord of Stars"), new Random());
    }

    @Test
    public void durance_weapon_can_be_described() {
        assertEquals(durance.describeWeapon(), "Katana of Hoshi\n" +
                "10 attack\n" +
                "5.0 attack speed \n" +
                "\n" +
                "Blade received by Durance from the Lord of Stars");
    }


}
