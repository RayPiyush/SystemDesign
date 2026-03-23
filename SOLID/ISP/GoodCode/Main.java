package GoodCode;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Basic Editor =====");

        // BasicEditor - can only open and close
        Manager1 basicEditor = new BasicEditor();
        basicEditor.openDoc();
        basicEditor.closeDoc();

        // ISP Proof - BasicEditor cannot style or edit
        // basicEditor.styleDoc();  // Compile Error!
        // basicEditor.editDoc();   // Compile Error!

        System.out.println("-----------------------");
        System.out.println("===== Multi Purpose Editor =====");

        // MultiPurpose - can do everything
        MultiPurpose multiPurpose = new MultiPurpose();
        multiPurpose.openDoc();
        multiPurpose.closeDoc();
        multiPurpose.styleDoc();
        multiPurpose.editDoc();

        System.out.println("-----------------------");
        System.out.println("===== Polymorphism Demo =====");

        // Using interface references - only specific methods visible
        Manager1 m1 = new MultiPurpose();
        m1.openDoc();
        m1.closeDoc();
        // m1.styleDoc() // Compile Error - Manager1 doesn't have styleDoc!
        // m1.editDoc()  // Compile Error - Manager1 doesn't have editDoc!

        Manager2 m2 = new MultiPurpose();
        m2.styleDoc();
        // m2.openDoc()  // Compile Error!

        Manager3 m3 = new MultiPurpose();
        m3.editDoc();
        // m3.openDoc()  // Compile Error!
    }
}