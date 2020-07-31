package creational.Builder;

public class Weapon {


    public enum WeaponKind {
        Gun, Hammer, Sword, Knife, Whip
    }


    private String name;
    private WeaponKind weaponKind;


    public void setName(String name) {
        this.name = name;
    }


    public void setWeaponKind(WeaponKind weaponKind) {
        this.weaponKind = weaponKind;
    }


    public static class WeaponBuilder extends Character.CharacterBuilder {
        private Weapon weapon = new Weapon();

        public WeaponBuilder(Character character){
            this.character = character;
            character.setWeapon(weapon);
        }

        public WeaponBuilder withName(String name){
            weapon.setName(name);
            return this;
        }

        public WeaponBuilder withKindOfWeapon(WeaponKind weaponKind){
            weapon.setWeaponKind(weaponKind);
            return this;
        }

    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", weaponKind=" + weaponKind +
                '}';
    }
}
