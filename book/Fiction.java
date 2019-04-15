package hw5;

import javax.xml.stream.FactoryConfigurationError;

public class Fiction extends Book {

public  Fiction(String title){
    super(title);
}
    @Override
    public void setprice() {
        price=24.99;
    }
}

