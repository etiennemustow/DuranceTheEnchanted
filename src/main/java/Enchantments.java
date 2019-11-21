import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Enchantments {
    ICE(new Enchantment("Ice ", "+5 Ice Damage")),
    FIRE(new Enchantment("Inferno ", "+5 Fire Damage")),
    LIFESTEAL(new Enchantment("Vampire ", "+5 Lifesteal")),
    AGILITY(new Enchantment("Quick ", "+5 Agility")),
    STRENGTH(new Enchantment("Angry ", "+5 Strength"));

    public String prefix;
    public String attributes;

    public static List<Enchantments> listOfEnchantments = Arrays.asList(values());

    Enchantments(Enchantment enchantment) {
        this.prefix = enchantment.getPrefix();
        this.attributes = enchantment.getAttributes();
    }
}
