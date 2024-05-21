package baitap2;

public class Client {
    public static void main(String[] args) {
        IDocument normalDoc = new NormalDoc();
        normalDoc.SetEncryption("Normal Encryption");
        normalDoc.SetExtension("Normal Extension");
        Document normalDocument = normalDoc.buildDoc();
        System.out.println("Normal Document: " + normalDocument.getEncryption() + " " + normalDocument.getExtension());

    }
}