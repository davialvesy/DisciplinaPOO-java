public class Main {
    public static void main(String[] args) throws Exception {

        Person p1 = new Person();
        // Cria o objeto "Davi" relacionado a pessoa.

        p1.setName("Davi Leandro Alves");
        p1.setAge(20);
        p1.setCountry("Brasil");

        System.out.printf("Nome: %s\nIdade: %d\nPaís: %s\n", p1.getName(), p1.getAge(), p1.getCountry());
    }
}
