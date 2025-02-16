public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Persona persona = new Persona("Juan", 30);
        System.out.println("Name: " + persona.getName());
        System.out.println("Years: " + persona.getYears());

        var personaRecord = new PersonaRecord("Juan", 0);
        System.out.println("Name: " + personaRecord.name());
    }
}
