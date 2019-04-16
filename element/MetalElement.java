package hw5;

public class MetalElement extends Element {

public  MetalElement(String symbol,int atomicweight ,int atomicNumber){
   super(symbol,atomicweight,atomicNumber);
}
    @Override
    public void describeElement() {
        System.out.println(" metals are good conductors of electricity");
    }
}
