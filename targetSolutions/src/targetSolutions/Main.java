package targetSolutions;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Primeiro desafio:
		int indice = 13;
		int soma = 0;
		int k = 0;

		while (k < indice) {
			k = k + 1;
			soma = soma + k;
		}
		System.out.println("Resultado 1: " + soma);
		pause();

		// Segundo desafio
		System.out.println("Digite um número para verificar se ele está na sequência de Fibonacci:");
		Scanner input = new Scanner(System.in);
		int insira = input.nextInt();

		int primeiroNum = 0;
		int segundoNum = 1;
		int reserva = 0;
		while (primeiroNum < insira && segundoNum < insira) {
			reserva = segundoNum;
			segundoNum += primeiroNum;
			primeiroNum = reserva;
		}
		if (insira == primeiroNum || insira == segundoNum) {
			System.out.println("Sim! " + insira + " está na sequência de Fibonacci!");
		} else {
			System.out.println("Não. " + insira + " não está na sequência de Fibonacci.");
		}

		pause();

		// Terceiro desafio
		int diasNoMes = 20;
		double[] faturamentoDiario = new double[diasNoMes];
		Random random = new Random();

		for (int i = 0; i < diasNoMes; i++) {
			faturamentoDiario[i] = 1000 + (2000 * random.nextDouble());
		}

		double menorFaturamento = Double.MAX_VALUE;
		double maiorFaturamento = Double.MIN_VALUE;
		double somaFaturamento = 0.0;
		int diasAcimaDaMedia = 0;

		for (double faturamento : faturamentoDiario) {
			if (faturamento < menorFaturamento) {
				menorFaturamento = faturamento;
			}
			if (faturamento > maiorFaturamento) {
				maiorFaturamento = faturamento;
			}
			somaFaturamento += faturamento;
		}

		double mediaFaturamento = somaFaturamento / faturamentoDiario.length;

		for (double faturamento : faturamentoDiario) {
			if (faturamento > mediaFaturamento) {
				diasAcimaDaMedia++;
			}
		}

		System.out.println("Faturamento Diário: ");
		for (double faturamento : faturamentoDiario) {
			System.out.printf("R$ %.2f%n", faturamento);
		}
		System.out.printf("\nMenor Faturamento: R$ %.2f%n", menorFaturamento);
		System.out.printf("Maior Faturamento: R$ %.2f%n", maiorFaturamento);

		if (diasAcimaDaMedia == 0) {
			System.out.println("Não há dias com faturamento acima da média");
		} else {
			System.out.printf("Dias com Faturamento acima da média: %d%n", diasAcimaDaMedia); // Corrigido para usar %d
		}
		pause();
		

		// Quarto desafio
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double resto = 19849.53;

		double total = sp + rj + mg + es + resto;

		System.out.printf("Faturamento Total: R$ %.2f%n%n", total);

		calcularPercentual("SP", sp, total);
		calcularPercentual("RJ", rj, total);
		calcularPercentual("MG", mg, total);
		calcularPercentual("ES", es, total);
		calcularPercentual("Outros", resto, total);

		pause();

		// Quinto desafio
		input.nextLine();
		System.out.print("Digite uma string aqui e veja a mágica: ");
		String string = input.nextLine();
		String stringInvertida = inverterString(string);
		System.out.println("String invertida: " + stringInvertida);

		input.close();
	}

	public static void calcularPercentual(String estado, double faturamento, double total) {
		double percentual = (faturamento / total) * 100;
		System.out.printf("Percentual de %s: %.2f%%%n", estado, percentual);
	}

	public static String inverterString(String str) {
		StringBuilder inversa = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			inversa.append(str.charAt(i)); //
		}
		return inversa.toString();
	}

	public static void pause() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("A pausa foi interrompida.");
		} finally {
			for (int i = 0; i < 5; i++) {
				System.out.println("");
			}
		}
	}
}
