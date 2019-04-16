package hw5;

public abstract class Element {
String symbol ;
int atomicNumber;
int atomicweight;
 public  Element(String symbol,int atomicweight,int atomicNumber){
     this.symbol=symbol;
     this.atomicNumber=atomicNumber;
     this.atomicweight=atomicweight;
 }



    public String getSymbol(){
     return symbol;
}
public  int getAtomicNumber(){
     return  atomicNumber;
}
public  int getAtomicweight(){
     return atomicweight;
}
 public abstract void describeElement();
}
