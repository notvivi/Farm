import java.util.ArrayList;

public class Farm {
    private int area = 100;
    private ArrayList <Flower> garden = new ArrayList<>();
    private ArrayList <Animal> barn = new ArrayList<>();

    public void addFlower(Flower flower){
        for(Flower f: garden){
            if(area - f.getNeededArea() > 0){
                garden.add(flower);
            }else{
                System.out.println("jsi chudy zebrak");
            }
        }
    }

    public void addAnimal(Animal animal){
        int counter = 0;
        int counter2 = 0;
        for(Animal a: barn){
            if(a.getSize().equals(Size.BIG)){
                counter++;
                if(counter > 10){
                    System.out.println("jsi opice, prodej se do otroctvi");
                }else{
                    barn.add(animal);
                }
            }else {
               counter2++;
               if(counter2 > 10){
                   System.out.println("smoulo\uD83E\uDD76\uD83E\uDD76");
               }else{
                   barn.add(animal);
               }
            }
        }

    }
}
