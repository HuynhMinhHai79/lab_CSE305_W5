package baitap2;

public class Document {
    private String encryption;
    private String extension;
    public Document(String encryption, String extension) {
        this.encryption = encryption;
        this.extension = extension;
    }
    public String getEncryption() {
        return encryption;
    }
    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    
}