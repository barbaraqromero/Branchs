package br.com.zup;

import java.util.Scanner;

public class NewBranch {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    Scanner leitor = new Scanner(System.in);

    System.out.println("Olá, digite o seu nome: ");
    String nomeDoUsuário = leitor.nextLine();
  }
}
