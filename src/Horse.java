public class Horse extends Animal {
    public Horse() {
        super("n1ggorse","Josef",Size.BIG,"yes");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
