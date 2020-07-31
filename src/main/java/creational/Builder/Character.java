package creational.Builder;


public class Character {
    public enum Clan {
        Fairy, Demon, Giant, Human, Witcher
    }

    public enum Ability {
        Fly, Recovery, Strenght, Speed
    }

    private String name;
    private int age;
    private Clan clan;
    private Ability ability;
    private Weapon weapon;
    private Costume costume;


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setClan(Clan clan) {
        this.clan = clan;
    }


    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setCostume(Costume costume) {
        this.costume = costume;
    }

    public static CharacterBuilder builder(){
        return new CharacterBuilder();
    }

    public static class CharacterBuilder {
        protected  Character character = new Character();


        public CharacterBuilder withName(String name){
            character.setName(name);
            return this;
        }

        public CharacterBuilder withAge(int age){
            character.setAge(age);
            return this;
        }

        public CharacterBuilder withClan(Clan clan){
            character.setClan(clan);
            return this;
        }

        public CharacterBuilder withAbility(Ability ability){
            character.setAbility(ability);
            return this;
        }

        public Costume.CostumeBuilder custome(){
            return new Costume.CostumeBuilder(character);
        }

        public Weapon.WeaponBuilder weapon(){
            return new Weapon.WeaponBuilder(character);
        }


        public Character build(){
            return character;
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", clan=" + clan +
                ", ability=" + ability +
                ", weapon=" + weapon +
                ", costume=" + costume +
                '}';
    }
}
