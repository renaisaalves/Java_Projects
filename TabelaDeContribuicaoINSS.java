import java.util.Scanner;

public class TabelaDeContribuicaoINSS {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String empregado = "Sim";
		String resposta;
		double salario;
		double aliquota;
		double taxa;
		
		System.out.println("Seja bem vindo ao programa de Cálculo de Imposto do INSS.\nDescubra quanto você deverá pagar ao mês.");
		System.out.println("Responda algumas perguntas para iniciarmos o Cálculo.\n");
		System.out.println("Você trabalha com carteira assinada, é trabalhador(a) doméstico(a) ou trabalhador avulso?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase(empregado)) {
			System.out.println("\nQual é o valor do seu salário bruto?");
			System.out.print("Salário (R$): ");
			salario = scan.nextDouble();
			if (salario <= 1302.00) {
				aliquota = 7.5;
				taxa = (salario * aliquota) / 100;
				System.out.printf("• Seu salário encontra-se na alíquota de %.1f%" + "%\n• O valor da contribuição mensal é de R$%.2f%n", aliquota, taxa);
			}
			else if (salario <= 2571.29) {
				aliquota = 9;
				taxa = (salario * aliquota) / 100;
				System.out.printf("• Seu salário encontra-se na alíquota de %.0f%" + "%\n• O valor da contribuição mensal é de R$%.2f%n", aliquota, taxa);
			}
			else if (salario <= 3856.94) {
				aliquota = 12;
				taxa = (salario * aliquota) / 100;
				System.out.printf("• Seu salário encontra-se na alíquota de %.0f%" + "%\n• O valor da contribuição mensal é de R$%.2f%n", aliquota, taxa);
			} 
			else if (salario <= 7507.49) {
				aliquota = 14;
				taxa = (salario * aliquota) / 100;
				System.out.printf("• Seu salário encontra-se na alíquota de %.0f%" + "%\n• O valor da contribuição mensal é de R$%.2f%n", aliquota, taxa);
			} else {
				aliquota = 22;
				taxa = (salario * aliquota) / 100;
				System.out.printf("• Seu salário encontra-se na alíquota de %.0f%" + "%\n• O valor da contribuição mensal é de R$%.2f%n", aliquota, taxa);
			}
			
		} else {
			System.out.println("\nEscolha uma categoria de contribuição:\n");
			System.out.println("• CONTRIBUINTE INDIVIDUAL [1]\n• CONTRIBUINTE FACULTATIVO [2]\n");
			System.out.print("Número da categoria: ");
			int categoria = scan.nextInt();
			if (categoria == 1) {
				System.out.println("\nSelecione o plano de contribuição para CONTRIBUINTE INDIVIDUAL [1]: \n");
				System.out.println("• [1007] PLANO NORMAL (20%)\n• [1163] PLANO SIMPLIFICADO (11%)\n");
				System.out.print("Código: ");
				int codigo = scan.nextInt();
			}
		}
	}
}
