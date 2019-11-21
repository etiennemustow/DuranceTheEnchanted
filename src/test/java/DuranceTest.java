import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuranceTest {
    @Test
    public void durance_weapon_can_be_described() {
        Durance durance = new Durance(new Weapon("Unrefined Katana of Hoshi", 10, 5.0f,
                "Blade received by Durance from the Lord of Stars"));
        assertEquals(durance.describeWeapon(), "Unrefined Katana of Hoshi\n" +
                "10attack\n" +
                "5.0attack speed \n" +
                "Blade received by Durance from the Lord of Stars");
    }

//    @Test
//    public void durance_weapon_can_be_() {
//    }
}
