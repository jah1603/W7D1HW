public class Playground extends Attraction implements ISecurity {

    public Playground(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() < 16)
        return true;
        else return false;
    }



}