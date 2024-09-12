package CSC340.demo;


public class CatFact {
    private String fact;
    private int length;

    // Constructor
    public CatFact(String fact, int length) {
        this.fact = fact;
        this.length = length;
    }

    // Getters and Setters
    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public String toString() {
        return "CatFact{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }
}
