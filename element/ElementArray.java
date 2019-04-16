package hw5;

public class ElementArray {

    public static void main(String[] args) {
	// write your code here

        Element[] element= new Element[5];
element[0]=new MetalElement("ahan",12,2);
element[0].describeElement();
        element[1]=new MetalElement("mangenez",15,3);
        element[1].describeElement();
        element[2]=new NonMetalElement("ahan",11,78);
        element[2].describeElement();
        element[3]=new MetalElement("ahan",34,26);
        element[3].describeElement();
        element[4]=new NonMetalElement("ahan",54,4);
        element[4].describeElement();

    }
}
