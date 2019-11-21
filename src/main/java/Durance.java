import java.util.List;
import java.util.Random;

public class Durance{
    Weapon weapon;
    String current_enchantment = "";
    Enchantment previous_enchantment;
    Enchantments enchantment;
    Random rand;
    Boolean enchanted = false;


    public Durance(Weapon weapon, Random rand) {
        this.weapon = weapon;
        this.rand = rand;
    }

    public Random getRand() {
        return rand;
    }

    public void enchant(){
        List<Enchantments> enchantments = Enchantments.listOfEnchantments;
        getRandomEnchantment(enchantments);
        current_enchantment = enchantment.attributes;
        enchanted = true;
    }

    public void setRand(int seed){
        rand = new Random(seed);
    }

    private void getRandomEnchantment(List<Enchantments> enchantments) {
        setEnchantment(enchantments, rand.nextInt(enchantments.size()));
    }

    public void setEnchantment(List<Enchantments> enchantments, int index) {
        enchantment = enchantments.get(index);
    }

    public String describeWeapon(){
        if (!enchanted)
          return weapon.getName() + "\n"
                + weapon.getAttackPower() + " attack\n"
                + weapon.getAttackSpeed() + " attack speed \n"
                + current_enchantment + "\n"
                + weapon.getDescription();
        return enchantment.prefix + weapon.getName() + "\n"
                + weapon.getAttackPower() + " attack\n"
                + weapon.getAttackSpeed() + " attack speed \n"
                + current_enchantment + "\n"
                + weapon.getDescription();
    }
}

