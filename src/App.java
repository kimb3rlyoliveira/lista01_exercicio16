import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    int tamanhometros;
    int quantidadelatas;
    double preco;
    int resto;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Me informe o tamanho em metros quadrados da área a ser pintada");
    tamanhometros= teclado.nextInt();

    quantidadelatas = tamanhometros / (3 * 18);
    resto = tamanhometros - (3 * 18 * quantidadelatas);
    
    if (resto > 0) {
      quantidadelatas += 1;
                   }
    preco = quantidadelatas * 80;
    System.out.println(quantidadelatas);
    System.out.println("R$"+preco);
  }
}