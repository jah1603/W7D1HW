public class Rollercoaster extends Attraction implements ISecurity  {

    public Rollercoaster(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 14 && visitor.getHeight() > 140)
            return true;
        else {return false;}
    }



}