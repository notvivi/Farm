public class Kangaroo extends Animal {

    public Kangaroo() {
        super("boxer","juan",Size.SMALL,"ofc");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
