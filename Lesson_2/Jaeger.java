public class Jaeger {

    private String name;
    public void setName(String name) {
        this.name = name;
    }

    private String mark;
    public void setMark(String mark) {
        this.mark = mark;
    }

    private String origin;
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    private short height;
    public void setHeight(short height) {
        this.height = height;
    }

    private short weight;
    public void setWeight(short weight) {
        this.weight = weight;
    }

    private byte speed;
    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    private byte stregth;
    public void setStregth(byte stregth) {
        this.stregth = stregth;
    }

    private byte armor;
    public void setArmor(byte armor) {
        this.armor = armor;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public boolean scanKaiju() {
        return true;
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }
}