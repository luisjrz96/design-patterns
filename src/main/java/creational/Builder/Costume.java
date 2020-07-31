package creational.Builder;



public class Costume {
    private String color;
    private Armor armor;
    private boolean camouflage;


    public void setColor(String color) {
        this.color = color;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setCamouflage(boolean camouflage) {
        this.camouflage = camouflage;
    }

    public enum Armor{
        Low, Medium, High
    }


    public static class CostumeBuilder extends Character.CharacterBuilder {
        private Costume costume = new Costume();

        public CostumeBuilder(Character character){
            this.character = character;
            character.setCostume(costume);
        }

        public CostumeBuilder withColor(String color){
            costume.setColor(color);
            return this;
        }

        public CostumeBuilder withArmor(Armor armor){
            costume.setArmor(armor);
            return this;
        }

        public CostumeBuilder isCamouflaged(boolean camouflaged){
            costume.setCamouflage(camouflaged);
            return this;
        }
    }

    @Override
    public String toString() {
        return "Costume{" +
                "color='" + color + '\'' +
                ", armor=" + armor +
                ", camouflage=" + camouflage +
                '}';
    }
}
