package BadCode;



public class BasicEditor implements DocumentManager {
    @Override
    public void openDoc(){
        System.out.println("Opening the Doc");
    }

    @Override
    public void closeDoc(){
        System.out.println("Closing the Doc");
    }

    @Override
    public void editDoc(){
        throw new UnsupportedOperationException("Cant edit");
    }

    @Override
    public void styleDoc(){
        throw new UnsupportedOperationException("Cant style");
    }


}
