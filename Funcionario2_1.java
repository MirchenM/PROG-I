/*
Autor: Mirchen Miguel D. Maibaze
compilar: 
executar:
*/

import java.util.Scanner;

public class Funcionario2_1 {
    // Atributos
    String nome;
    String sobrenome;
    int horasTrabalhadas;
    float valorPorHora;

    // Método principal
    public static void main(String[] args) {
        int horasTrabalhadas = 10;
        float valorPorHora = 25.50f;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String nome = ler.next(); // Corrigido: Declarando e atribuindo valor a `nome`.
        System.out.println("Insira o sobrenome: ");
        String sobrenome = ler.next(); // Corrigido: Declarando e atribuindo valor a `sobrenome`.

        Funcionario2_1 funcionario = new Funcionario2_1(); // Criando um objeto da classe Funcionario2_1
        funcionario.nomeCompleto(nome, sobrenome); // Corrigido: Chamando método através do objeto
        funcionario.calcularSalario(horasTrabalhadas, valorPorHora); // Corrigido: Chamando método através do objeto
        funcionario.incrementarHoras(horasTrabalhadas); // Corrigido: Chamando método através do objeto
    }

    // Método Nome Completo
    public String nomeCompleto(String nome, String sobrenome) {
        String nomeC = nome.concat(" " + sobrenome); // Adicionando espaço entre nome e sobrenome
        return nomeC;
    }

    // Método calcular salario
    public float calcularSalario(int hora, float valorPorHora) {
        float salario = hora * valorPorHora;
        return salario;
    }

    // Método para incrementar horas
    public void incrementarHoras(int hora) {
        horasTrabalhadas += hora; // Incrementando horas
    }
}
