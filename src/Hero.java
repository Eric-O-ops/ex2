public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String superAbilityType;


    @Override
    public String applySuperAbility(String superAbilityType) {

        return "применил супер способность:\n" + superAbilityType;

    }
}
