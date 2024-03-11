public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    Farmer farmer;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    public void wasser(){
        if(farmer.water()){
            chanceOfGrowth += 100;
        }

    }
    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
