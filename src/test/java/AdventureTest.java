import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AdventureTest {

    private Adventure adventure;

    @Before
    public void setUp() throws Exception {
        adventure = new Adventure(new Durance(new Weapon("Katana of Hoshi", 10, 5.0f,
                "Blade received by Durance from the Lord of Stars"), new Random()));
    }

    @Test
    public void durance_weapon_can_be_enchanted_with_ice() {
        adventure.setRandomisation(1);
        adventure.getDurance().enchant();
        assertEquals(adventure.getDurance().describeWeapon(), "Ice Katana of Hoshi\n" +
                "10 attack\n" +
                "5.0 attack speed \n" +
                "+5 Ice Damage\n" +
                "Blade received by Durance from the Lord of Stars");
    }
    @Test
    public void durance_weapon_can_be_enchanted_with_agility() {
        adventure.setRandomisation(2);
        adventure.getDurance().enchant();
        assertEquals(adventure.getDurance().describeWeapon(), "Quick Katana of Hoshi\n" +
                "10 attack\n" +
                "5.0 attack speed \n" +
                "+5 Agility\n" +
                "Blade received by Durance from the Lord of Stars");
    }
    @Test
    public void durance_weapon_can_be_enchanted_with_strength() {
        adventure.setRandomisation(3);
        adventure.getDurance().enchant();
        assertEquals(adventure.getDurance().describeWeapon(), "Angry Katana of Hoshi\n" +
                "10 attack\n" +
                "5.0 attack speed \n" +
                "+5 Strength\n" +
                "Blade received by Durance from the Lord of Stars");
    }

    @Test
    public void durance_weapon_can_be_enchanted_with_life_steal() {
        adventure.setRandomisation(4);
        adventure.getDurance().enchant();
        assertEquals(adventure.getDurance().describeWeapon(), "Vampire Katana of Hoshi\n" +
                "10 attack\n" +
                "5.0 attack speed \n" +
                "+5 Lifesteal\n" +
                "Blade received by Durance from the Lord of Stars");
    }
    @Test
    public void durance_weapon_can_be_enchanted_with_fire() {
        adventure.setRandomisation(6);
        adventure.getDurance().enchant();
        assertEquals(adventure.getDurance().describeWeapon(), "Inferno Katana of Hoshi\n" +
                "10 attack\n" +
                "5.0 attack speed \n" +
                "+5 Fire Damage\n" +
                "Blade received by Durance from the Lord of Stars");
    }

    @Test
    public void only_one_enchantment_can_be_active_at_a_time() {
        adventure.setRandomisation(1);
        adventure.getDurance().enchant();
        adventure.setRandomisation(2);
        adventure.getDurance().enchant();
        assertEquals(adventure.getDurance().describeWeapon(), "Quick Katana of Hoshi\n" +
                "10 attack\n" +
                "5.0 attack speed \n" +
                "+5 Agility\n" +
                "Blade received by Durance from the Lord of Stars");
    }

    @Test
    public void an_enchantment_wont_be_called_if_already_enchanted() {
        adventure.setRandomisation(1);
        adventure.getDurance().enchant();
        adventure.setRandomisation(2);
        adventure.getDurance().enchant();
        assertFalse("Ice Katana was called when it shouldn't have", adventure.getDurance().describeWeapon() == ("Quick Katana of Hoshi\n" +
                "10 attack\n" +
                "5.0 attack speed \n" +
                "+5 Agility\n" +
                "Blade received by Durance from the Lord of Stars"));
    }


}
