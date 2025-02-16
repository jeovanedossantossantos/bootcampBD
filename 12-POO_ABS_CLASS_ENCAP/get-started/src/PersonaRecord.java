
// Record são para trabalhar com valores imutaveis, para apenas leitura
public record PersonaRecord(String name, int age) {

    public PersonaRecord {

    }

    public PersonaRecord(String name) {
        this(name, 0);
    }

    public String getInfo() {

        return "Name: " + name + " Age: " + age;

    }

}