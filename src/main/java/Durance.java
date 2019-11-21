import java.util.Random;

public class Durance{
    Weapon weapon;
    String enchantment = "";

    public Durance(Weapon weapon) {
        this.weapon = weapon;
    }

    public void enchant(){
        weapon.setName(Enchantments.ICE.prefix + weapon.getName());
        enchantment = Enchantments.ICE.attributes;
    }

    public String describeWeapon(){
        return weapon.getName() + "\n"
                + weapon.getAttackPower() + " attack\n"
                + weapon.getAttackSpeed() + " attack speed \n"
                + enchantment + "\n"
                + weapon.getDescription();
    }
}

