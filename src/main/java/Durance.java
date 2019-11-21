import java.util.List;
import java.util.Random;

public class Durance{
    Weapon weapon;
    Enchantments current_enchantment;
    Enchantments previous_enchantment;
    Enchantments enchantment;
    Random rand;
    Boolean enchanted = false;

    public Durance(Weapon weapon, Random rand) {
        this.weapon = weapon;
        this.rand = rand;
    }

    public boolean lostEnchantment(){
        boolean lostEnchantment = new Random().nextInt(10)==0;
        return lostEnchantment;
    }

    public void enchant(){
        List<Enchantments> enchantments = Enchantments.listOfEnchantments;
        if(lostEnchantment())
              loseEnchantment();
        else
            getRandomEnchantment(enchantments);
    }

    private void loseEnchantment() {
        enchantment = null;
        current_enchantment = null;
        enchanted = false;
    }

    public void setRand(int seed){
        rand = new Random(seed);
    }

    private void getRandomEnchantment(List<Enchantments> enchantments) {
        setEnchantment(enchantments, rand.nextInt(enchantments.size()));
        while(previous_enchantment == current_enchantment)
            setEnchantment(enchantments, rand.nextInt(enchantments.size()));
        enchanted = true;
        previous_enchantment = enchantment;
    }

    public void setEnchantment(List<Enchantments> enchantments, int index) {
        current_enchantment = enchantments.get(index);
    }

    public String describeWeapon(){
        if (!enchanted)
          return weapon.getName() + "\n"
                  + weapon.getAttackPower() + " attack\n"
                  + weapon.getAttackSpeed() + " attack speed \n"
                  + "\n"
                  + weapon.getDescription();
        return current_enchantment.prefix + weapon.getName() + "\n"
                + weapon.getAttackPower() + " attack\n"
                + weapon.getAttackSpeed() + " attack speed \n"
                + current_enchantment.attributes + "\n"
                + weapon.getDescription();
    }

}

