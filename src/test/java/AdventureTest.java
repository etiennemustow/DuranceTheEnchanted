import org.junit.Test;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class AdventureTest {


    @Test
    public void durance_weapon_can_be_enchanted_with_ice() {
        Adventure adventure = new Adventure(new Durance(new Weapon("Katana of Hoshi", 10, 5.0f,
                "Blade received by Durance from the Lord of Stars"), new Random()));
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
        Adventure adventure = new Adventure(new Durance(new Weapon("Katana of Hoshi", 10, 5.0f,
                "Blade received by Durance from the Lord of Stars"), new Random()));
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
        Adventure adventure = new Adventure(new Durance(new Weapon("Katana of Hoshi", 10, 5.0f,
                "Blade received by Durance from the Lord of Stars"), new Random()));
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
        Adventure adventure = new Adventure(new Durance(new Weapon("Katana of Hoshi", 10, 5.0f,
                "Blade received by Durance from the Lord of Stars"), new Random()));
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
        Adventure adventure = new Adventure(new Durance(new Weapon("Katana of Hoshi", 10, 5.0f,
                "Blade received by Durance from the Lord of Stars"), new Random()));
        adventure.setRandomisation(6);
        adventure.getDurance().enchant();
        assertEquals(adventure.getDurance().describeWeapon(), "Inferno Katana of Hoshi\n" +
                "10 attack\n" +
                "5.0 attack speed \n" +
                "+5 Fire Damage\n" +
                "Blade received by Durance from the Lord of Stars");
    }

}
