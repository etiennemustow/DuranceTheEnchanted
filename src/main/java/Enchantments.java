public enum Enchantments {
    ICE(new Enchantment("Ice ", "+5 Ice Damage")),
    FIRE(new Enchantment("Inferno ", "+5 Fire Damage")),
    LIFESTEAL(new Enchantment("Vampire ", "+5 Lifesteal")),
    AGILITY(new Enchantment("Quick ", "+5 Agility")),
    STRENGTH(new Enchantment("Angry ", "+5 Strength"));

    public String prefix;
    public String attributes;

    Enchantments(Enchantment enchantment) {
        this.prefix = enchantment.getPrefix();
        this.attributes = enchantment.getAttributes();
    }
}
