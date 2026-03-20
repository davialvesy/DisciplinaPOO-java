/*
    Com base nos conceitos aprendidos (modificadores de visibilidade e
    construtores), crie uma classe em Java para representar uma Disciplina.
    A classe possui os seguintes atributos privados: código, quantidade de
    créditos, nome, turmo e curso. A classe deve conter os métodos get&#39;s e
    set's para todos os atributos e um método para exibir todos os dados da
    disciplina.
    Garanta que a quantidade de créditos não receba valores menores do
    que zero. Garanta que nome e curso não recebam valores nulos. Na
    classe principal, instancie um objeto da classe Disciplina, faça uso dos
    métodos set's para atribuir os valores dos atributos e informe-os através
    do método exibirDados().
    Com base no novo conceito aprendido, crie um construtor que receba
    valores para todos os atributos da classe Disciplina. Na classe principal,
    instancie três objetos da classe Disciplina e usando o construtor criado,
    adicione os seus respectivos valores.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Disciplina disc = new Disciplina();

        System.out.print("Digite seu nome: ");
        disc.setNome(Scanner.nextString());

        System.out.print("Digite sua turma: ");
        disc.setTurma(Scanner.nextString());

        System.out.print("Digite sua classe: ");
        disc.setCurso(Scanner.nextString());

        System.out.print("Digite seu código: ");
        disc.setCodigo(Scanner.nextInt());

        System.out.print("Digite sua classe: ");
        disc.setQntdCreditos(Scanner.nextInt());

        scanner.close();
    }
}
