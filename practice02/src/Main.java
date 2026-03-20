/*
Faça um programa que tenha a classe Calculadora e nela faça as
operações básicas. Lembre de colocar construtores e os get e set para
todos, além de colocar os atributos como privado e criar os objetos na
classe principal.
*/

import java.util.Scanner;
/*
    import java.util.Scanner --> Funciona como o #include em C/C++

    Possibilita usar métodos de outras classes, onde nesse caso
    possibilidade receber dados de usuários.

    Estrustura

        java -> Pacote principal
        util -> subpacote
        Scanner -> classe
*/

public class Main {
    /*
        public class Main --> Essa é a classe principal, todo código precisa de uma.

            public -> Significa que essa classe pode ser acessada por outras classes.
                      

            class -> Palavra reservada para a criação de uma classe.

            Main -> É o nome da classe criada.
    */
    public static void main(String[] args){
        /* 
            public static void main(String[] args) throws Exception 

                public -> Sempre deve ser public, pois o JVM precisa acessar esse método.

                static -> Significa que o método pertence a classe, e não a um objeto.
                          Dessa forma, você não precisa necessariamente criar um objeto.

                void -> O método não retorna valor algum.

                main -> Nome obrigatório do método principal.
                        O JVM procura exatamente esse nome.

                String[] args -> Cria um vetor args e permite que receba argumentos da linha
                                 de comando.
        */
        Scanner scanner = new Scanner(System.in);
        /*
            Scanner scanner = new Scanner(System.in)

                Cria um objeto Scanner.

                Estrutura

                    Tipo nomeObjeto - new Tipo();

                Scanner -> Tipo da variável
                scanner -> Nome do objeto.
                new Scanner -> Aloca um espaço na memória para o novo objeto.
                System.in -> Entrada padrão do sistema, como uma tecla.

                Dessa forma, isso no geral significa:

                    "Crie um leitor para ler dados digitados pelo usuário."
        */
        Calculadora calcu = new Calculadora();
        /*
            Calculadora calcu = new Calculadora()

                É a mesma ideia do anterior, porém esse cria um objeto chamado calcu,
                onde new Calculadora() é o chamado do construtor da classe Calculadora.
                Dessa forma, possibilita o objeto à usar métodos como calcu.sum, ou calcu.sub.
        */

        System.out.print("Digite um número: ");
        calcu.setNum1(scanner.nextDouble());
        System.out.print("Digite um número: ");
        calcu.setNum2(scanner.nextDouble());
        /* 
            System.out.println("");
                Seria o equivalente ao printf do C/C++, é usado para mostrar algo
                ao usuário no console.
                
            calcu.setNum1(scanner.nextDouble());
            calcu.setNum2(scanner.nextDouble());

                Esses métodos fazem duas coisas ao mesmo tempo,veja:

                    I. scanner.nextDouble() -> Lê um número decimal digitado pelo usuário.
                    II. calcu.setNum1(valor) -> Esse método guarda o valor recebido pelo 
                    usuário dentro da classe Calculadora por meio de 

                        public void setNum1(double num1){
                            this.num1 = num1;
                        }

        */

        System.out.printf("\nSoma = %.2f\nSubtração = %.2f\nMultiplicação = %.2f\nDivisão = %.2f\n", calcu.sum(), calcu.sub(), calcu.mult(), calcu.div());
        /*
            System.out.printf() -> Apenas printa os resultados.
            Uso do printf nesse caso, para possibilitar uma melhor formatação da escrita.
        */
        scanner.close();
        /*
            scanner.close() -> Finalizar o Scanner para que não aconteça perca computacional.
        */
    }
}
