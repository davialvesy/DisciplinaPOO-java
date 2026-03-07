/*
Faça um programa que tenha a classe Calculadora e nela faça as
operações básicas. Lembre de colocar construtores e os get e set para
todos, além de colocar os atributos como privado e criar os objetos na
classe principal.
*/

public class Calculadora {
    // public class Calculadora -> Cria uma classe chamada Calculadora pública. 
    private double num1;
    private double num2;
    /*
        private double num1;
        private double num2;

        Essa é uma declaração de variável private, o que significa que
        não é tão simples modificar essas variáveis. Chamamos isso de
        encapsulamento, onde o conceito é proteger e controlar os dados 
        conta acesso direto.

        Impossível de altera essas variáveis?
            Não, para alterá-la é necessário um método, e é ai que surge
            os métodos get e set, onde um lê e o outro altera.

            Veremos mais adiante.
    */

    public Calculadora(){
        this.num1 = 0;
        this.num2 = 0;
    }
    /*
        public Calculadora() -> Contrutor Padrão

            Um construtor é um metodo especial que é executado assim que o
            objeto é criado. Ele serve para inicializar e definir valores
            iniciais para as variáveis, preparando o objeto para o uso.

            this. -> É uma referência
                    "O atributo num1 desse objeto"

            Ou seja, num1 e num2 começam valendo 0.

    */

    public Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    /*
        public Calculadora(double num1, double num2) -> Construtor com parâmetros

            Esse construtor significa que ao criar um objeto podemos
            passar valores.

            Calculadora calcu = new Calculadora(10,5);

            num1 = 10
            num2 = 5
    */

    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }
    /*
        public double getNum1()
        public double getNum2()

            São os métodos getter.
            Eles retornam o valor de um atributo privado,
            visto que não é possível acessar diretamente.

            O return devolve o valor do atributo.
    */


    public void setNum1(double num1){
        this.num1 = num1;
    }
    public void setNum2(double num2){
        this.num2 = num2;
    }
    /*
        public void setNum1(double num1)
        public void setNum2(double num1)

            São os metodos setter.
            Se os get apenas retornam os valores privados,
            os set são responsáveis por alterá-los.
    */


    /*
        Os métodos abaixo são os responsáveis por fazer os cáculos,
        eles são bem simples e diretos, soma x + y, e retorna o resultado.

        Com excessão da divisão, todos são quase iguais e seguem a mesma
        premissa. A divisão precisa de uma cautela maior em particular,
        pois divisão por 0 é considerado um absurdo matemática e não possui resolução,
        chamamos isso de indeterminação. Dessa forma, é precisso fazer um if
        verificando a procedencia da divisão, onde se o divisor for 0, enviar uma
        mensagem de erro e encerra o programa.
    */
    public double sum(){
        return num1 + num2;
    }

    public double sub(){
        return num1 - num2;
    }

    public double mult(){
        return num1 * num2;
    }

    public double div(){
        if(num2 != 0){
            return num1 / num2;
        }else{
            System.out.println("Ideterminação: divisão por zero.\n");
            return 0;
        }
    }
}
