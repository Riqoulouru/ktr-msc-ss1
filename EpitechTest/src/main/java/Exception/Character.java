package Exception;

public abstract class Character implements Movable {

    protected String name;
    protected double life;
    protected double agility;
    protected double strenght;
    protected double wit;
    private String RPGClass;

    public Character(String name, String RPGClass) {
        this.name = name;
        this.life = 50;
        this.agility = 2;
        this.strenght = 2;
        this.wit = 2;
        this.RPGClass = RPGClass;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    public void setRPGClass(String RPGClass) {
        this.RPGClass = RPGClass;
    }

    public void attack(String weapon) throws WeaponException {
        System.out.println(name + " : Rrrrrrrr..." );
    }

    @Override
    public void moveRight() {
        System.out.println(name + " : moves right");
    }

    @Override
    public void moveLeft(){
        System.out.println(name + " : moves left");
    }

    @Override
    public void moveForward(){
        System.out.println(name + " : moves forward");
    }

    @Override
    public void moveBack(){
        System.out.println(name + " : moves back");
    }

    public void unsheathe(){
        System.out.println(name + " : unsheathes his weapon.");
    }
}
