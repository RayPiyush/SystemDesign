package GoodCode;


public class BasicEditor implements Manager1{
    
    @Override
    public void openDoc(){
        System.out.println("Open the Doc");
    }

    @Override
    public void closeDoc(){
        System.out.println("Close the Doc");
    }
}
