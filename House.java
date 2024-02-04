public class House {
    private String name;
    private String founder;
    private String[] colors;

    public House(String name, String founder, String[] colors) {
        this.name = name;
        this.founder = founder;
        this.colors = colors;
    }

    public String toString() {
        String colorString = "";
        for (String c : colors) {colorString += c + " ";}
        return "House name: " + name + "\nFounder: " + founder + "\n colors: " + colorString;
    }
}