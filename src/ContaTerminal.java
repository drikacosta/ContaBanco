import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("**************CONTA BANCÁRIA*******************");
		System.out.println();
		System.out.println("Por favor, digite o número da Conta: (utilize - 1021)");
		numero = sc.nextInt();

		System.out.println("Agora digite o número da Agência: (utilize - 067-8)");
		agencia = sc.next();

		System.out.println("Informe seu nome: (utilize o nome Mario Andrade)" );
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("Agora me informa seu saldo atual:(utilise o valor de R$ 237.48) ");
		saldo = sc.nextDouble();

		System.out.println("Olá" + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é" + agencia +", conta" + numero +" e seu saldo " + saldo + "já está disponível para saque.");

		sc.close();
	}

}