package Exception;

public class Mage extends Character {

    public Mage(String name) {
        super(name, "Mage");
        life = 70;
        strenght = 3;
        agility = 10;
        wit = 10;
        System.out.println(name + " :  May the gods be with me." );
    }

    @Override
    public void attack(String weapon) throws WeaponException {
        if(weapon.equals("")){
            throw new WeaponException(name + " : I refuse to fight with my bare hands.");
        } else {
            if(weapon.equals("magic") || weapon.equals("wand")){
                super.attack(weapon);
                System.out.println(name + " : Feel the power of my " + weapon);
            } else {
                throw new WeaponException(name + " : I don 't need this stupid " + weapon + " ! Don 't misjudge my powers !");
            }
        }
    }

    @Override
    public void moveRight() {
        System.out.println(name + " : moves right furtively");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + " : moves left furtively");
    }

    @Override
    public void moveForward() {
        System.out.println(name + " : moves forwartd furtively");
    }

    @Override
    public void moveBack() {
        System.out.println(name + " : moves back furtively");
    }
}
