import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o Limite: ");
        int limite = scanner.nextInt();
        cartao  roxo = new cartao(limite);

        int sair = 1;
        while(sair !=0){
            System.out.println("Descricao da compra:");
            scanner.nextLine();
            String descricao =
                    scanner.nextLine();

            System.out.println("Valor da compra:");
            double valor = scanner.nextDouble();

            compra itens = new compra(descricao,valor);
            boolean efetuado = roxo.lancaCompra(itens);
            if(efetuado){
                System.out.println("Compra efetuada com sucesso!");
                System.out.println("INSIRA 1 PARA MAIS COMPRAS E 0 PARA SAIR!");
                sair = scanner.nextInt();
            }else{
                System.out.println("Limite insuficiente!");
                sair = 0;
            }

        }
    for (compra x : roxo.getCarrinho()){
        System.out.println(x.getDescricao() + " - " + x.getValor());
    }
        System.out.println("\n********************************");
        System.out.println("\nsaldo do cartão: " + roxo.getSaldo());
    }
}
