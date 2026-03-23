package BadCode;


public class MultiPurposeEditor implements DocumentManager {
    
    @Override
    public void openDoc(){
        System.out.println("Open the doc");
    }

    @Override
    public void closeDoc(){
        System.out.println("Close the doc");
    }

    @Override
    public void styleDoc(){
        System.out.println("Style the doc");
    }

    @Override
    public void editDoc(){
        System.out.println("Edit the doc");
    }
}
