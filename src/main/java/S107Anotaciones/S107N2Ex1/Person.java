package S107Anotaciones.S107N2Ex1;

@SerializeToJson(directory = "src/main/java/S107Anotaciones/S107N2Ex1/")
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters y setters (omitiendo por brevedad)

    public static void main(String[] args) {
        Person person = new Person("John Doe", 25);
        JsonSerializer.serializeToJson(person, person.getClass().getAnnotation(SerializeToJson.class).directory());
    }
}
