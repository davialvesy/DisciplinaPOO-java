public class Person {
    private String name;
    private int age;
    private String country;

    public Person() {
        this.age = 0;
    } // Define um valor padrão para a idade.

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    } // Método Construtor*

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } // set => definir

    public int getAge() {
        return age;
    } // get => obter

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
