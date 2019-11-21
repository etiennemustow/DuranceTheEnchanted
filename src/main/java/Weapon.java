public class Weapon{
    private String name;
    private int attackPower;
    private float attackSpeed;
    private String description;

    public Weapon(String name, int attackPower, float attackSpeed, String description) {
        this.name = name;
        this.attackPower = attackPower;
        this.attackSpeed = attackSpeed;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public float getAttackSpeed() {
        return attackSpeed;
    }

    public String getDescription() {
        return description;
    }
}
