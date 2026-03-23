package BadCode;

import BadCode.MultiPurposeEditor;

public class Main {
    
    public static void main(String[] args) {
        DocumentManager documentManager=new BasicEditor();
        documentManager.openDoc();
        documentManager.styleDoc();

        DocumentManager documentManager1=new MultiPurposeEditor();
        documentManager1.openDoc();
        documentManager1.styleDoc();
    }


}
