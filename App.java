
import java.util.Scanner;
import java.util.ArrayList;


class App{

    public static void main(String[] args) {
       
        ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
        
        contas.add(new ContaCorrente(200));
        contas.add(new ContaCorrente());
        contas.add(new ContaCorrente(1000, "marcos"));

        System.out.println("\n\nLeitura de saldos: \n");
    
        contas.forEach((conta) ->  System.out.println("Conta : "+ conta.getSaldo() + " Titular: " + conta.getTitular()));

    }
    
}