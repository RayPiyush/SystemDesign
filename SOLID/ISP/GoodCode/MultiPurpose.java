package GoodCode;


public class MultiPurpose implements Manager1,Manager2,Manager3{
    
    @Override
    public void openDoc(){
        System.out.println("Opening the Doc");
    }

    @Override
    public void closeDoc(){
        System.out.println("Closing the Doc");
    }

    @Override
    public void styleDoc(){
        System.out.println("Styling the Doc");
    }

    @Override
    public void editDoc(){
        System.out.println("Edit the Doc");
    }
}
