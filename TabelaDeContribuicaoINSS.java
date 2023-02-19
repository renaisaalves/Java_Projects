import java.util.Scanner;

public class TabelaDeContribuicaoINSS {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String seguradoObrigatorio = "Sim";
		String resposta;
		String resposta1;
		double salario;
		double aliquota;
		double taxa;
		double taxaContIndividual;
		double taxaContFacultativo;
		double salarioLiquido;
		double salarioMinimo = 1302.00;
		int ano = 2023;
		int plano;
		
		System.out.println("Seja bem vindo ao programa de Cálculo de Imposto do INSS.\nDescubra quanto você deverá pagar ao mês.");
		System.out.println("Responda algumas perguntas para iniciarmos o Cálculo.\n");
		System.out.println("1) Você exerce alguma atividade remunerada?");
		System.out.print("Resposta: ");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase(seguradoObrigatorio)) {
			System.out.println("\nSe você exerce alguma atividade remunerada, você é um SEGURADO OBRIGATÓRIO.\nIsso significa que você é obrigado a contribuir para o INSS.\nResta saber de qual forma.");
			System.out.println("\n2) Você trabalha com carteira assinada (CLT), é trabalhador(a) doméstico(a) ou trabalhador(a) avulso(a)?");
			System.out.print("Resposta: ");
			resposta1 = scan.next();
			if (resposta1.equalsIgnoreCase(seguradoObrigatorio)) {
				System.out.println("\n3) Qual é o seu salário? (Digite o valor bruto)");
				System.out.print("Salário (R$): ");
				salario = scan.nextDouble();
				if (salario <= 1302.00) {
					aliquota = 7.5;
					taxa = (salario * aliquota) / 100;
					salarioLiquido = salario - taxa;
					System.out.printf("\n• Seu salário encontra-se na alíquota de %.1f%" + "%\n• O valor da contribuição mensal para INSS é de R$%.2f%n" + "• Dedução da contribuição do INSS sobre o salário bruto: R$%.2f%n", aliquota, taxa, salarioLiquido);
				}
				else if (salario <= 2571.29) {
					aliquota = 9;
					taxa = (salario * aliquota) / 100;
					salarioLiquido = salario - taxa;
					System.out.printf("\n• Seu salário encontra-se na alíquota de %.1f%" + "%\n• O valor da contribuição mensal para INSS é de R$%.2f%n" + "• Dedução da contribuição do INSS sobre o salário bruto: R$%.2f%n", aliquota, taxa, salarioLiquido);
				}
				else if (salario <= 3856.94) {
					aliquota = 12;
					taxa = (salario * aliquota) / 100;
					salarioLiquido = salario - taxa;
					System.out.printf("\n• Seu salário encontra-se na alíquota de %.1f%" + "%\n• O valor da contribuição mensal para INSS é de R$%.2f%n" + "• Dedução da contribuição do INSS sobre o salário bruto: R$%.2f%n", aliquota, taxa, salarioLiquido);
				} 
				else if (salario <= 7507.49) {
					aliquota = 14;
					taxa = (salario * aliquota) / 100;
					salarioLiquido = salario - taxa;
					System.out.printf("\n• Seu salário encontra-se na alíquota de %.1f%" + "%\n• O valor da contribuição mensal para INSS é de R$%.2f%n" + "• Dedução da contribuição do INSS sobre o salário bruto: R$%.2f%n", aliquota, taxa, salarioLiquido);
				} else {
					aliquota = 22;
					taxa = (salario * aliquota) / 100;
					salarioLiquido = salario - taxa;
					System.out.printf("\n• Seu salário encontra-se na alíquota de %.1f%" + "%\n• O valor da contribuição mensal para INSS é de R$%.2f%n" + "• Dedução da contribuição do INSS sobre o salário bruto: R$%.2f%n", aliquota, taxa, salarioLiquido);
				}
			} else {
				System.out.println("\nComo você exerce alguma atividade remunerada, mas não trabalha para pessoa jurídica (CNPJ), você precisa contribuir de forma individual para o INSS.\nA categoria CONTRIBUINTE INDIVIDUAL corresponde aos trabalhadores autônomos (que trabalham por conta própria).\n\nDentro da categoria CONTRIBUINTE INDIVIDUAL, existe duas modalidades de contribuição:\n• [Código 1007] PLANO NORMAL (20%)\n• [Código 1163] PLANO SIMPLIFICADO (11%)\n\nEsses valores são calculados em cima do salário mínimo vigente.\nNeste caso, como estamos no ano de " + ano + ", o salário mínimo vigente é R$" + salarioMinimo + ".\nDigite o número do plano ou código correspondente para calcular o valor da parcela.");
				System.out.print("\nNº do plano ou código: ");
				plano = scan.nextInt();
				if (plano == 20 || plano == 1007) {
					System.out.println("\nPlano escolhido: PLANO NORMAL (20%)");
					taxaContIndividual = (salarioMinimo * 20) / 100;
					System.out.printf("Salário mínimo vigente (" + ano + "): R$" + "%.2f%n", salarioMinimo);
					System.out.printf("A parcela a ser paga nessa modalidade é: R$" + "%.2f%n", taxaContIndividual);
				} else if (plano == 11 || plano == 1163) {
					System.out.println("\nPlano escolhido: PLANO SIMPLIFICADO (11%)");
					taxaContIndividual = (salarioMinimo * 11) / 100;
					System.out.printf("Salário mínimo vigente (" + ano + "): R$" + "%.2f%n", salarioMinimo);
					System.out.printf("A parcela a ser paga nessa modalidade é: R$" + "%.2f%n", taxaContIndividual);
				}
				
			}
		} else {
			System.out.println("\nSEGURADOS FACULTATIVOS são pessoas que não exercem atividade remunerada.\nExemplos: donas de casa, estudantes e desempregados.\n\nDentro da categoria CONTRIBUINTE FACULTATIVO, existe três modalidades de contribuição:\n• [Código 1406] PLANO NORMAL (20%)\n• [Código 1473] PLANO SIMPLIFICADO (11%)\n• [Código 1929] PLANO BAIXA RENDA (5%)\n\nEsses valores são calculados em cima do salário mínimo vigente.\nNeste caso, como estamos no ano de " + ano + ", o salário mínimo vigente é R$ " + salarioMinimo + ".\nDigite o número do plano ou código correspondente para calcular o valor da parcela.");
		}
	}
}
