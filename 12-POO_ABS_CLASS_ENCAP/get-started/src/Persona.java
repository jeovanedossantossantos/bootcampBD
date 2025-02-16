public class Persona {
    private String name;
    private int years;

    public Persona(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
