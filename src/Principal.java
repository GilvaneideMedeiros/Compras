import Compra.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("\nDigite o limite do cartão:");
        Double limite =leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair =1;
        while(sair != 0) {
            System.out.println("Digite o nome do produto: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor do produto: ");
            Double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if(compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Saldo atual: " + cartao.getSaldo());

                System.out.println("\nDeseja realizar outra compra?");
                System.out.println("1 - Sim");
                System.out.println("0 - Não");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("==========================================");
        System.out.println("Compras realizadas:\n");
        Collections.sort(cartao.getCompras());
        for(Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - R$" + c.getValor());
        }
        System.out.println("==========================================");

        System.out.println("Saldo do cartão: " + cartao.getSaldo());

    }
}