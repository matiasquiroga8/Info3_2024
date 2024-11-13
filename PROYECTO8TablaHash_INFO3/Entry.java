package PROYECTO8TablaHash_INFO3;

class Entry {
    private int key;
    private String value;

    // Constructor
    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    // Getters y Setters
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
