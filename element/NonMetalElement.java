package hw5;

public class NonMetalElement extends Element {
    public  NonMetalElement(String symbol,int atomicweight ,int atomicNumber){
        super(symbol,atomicweight,atomicNumber);
    }
    @Override
    public void describeElement() {
        System.out.println(" nonmetals are poor conductors . ");
    }
}
