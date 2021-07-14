public class Animal implements Ipuppy{
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void eat(){
        System.out.println("Eat...");
    }

    @Override
    public void drink() {
        System.out.println("Drink milk");
        
    }
}
