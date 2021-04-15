public class Jaeger {
    private String name;
    private String mark;
    private String origin;
    private short height;
    private short weight;
    private byte speed;
    private byte stregth;
    private byte armor;

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    public void setStregth(byte stregth) {
        this.stregth = stregth;
    }

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