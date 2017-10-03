package mhs.comparacao.br.mhs.deltaj;

/*** added by dCompare
 */
public class Main {
	public static void main(String args []) {
		ValorInteiro n1 = new ValorInteiro(1);
		ValorInteiro n2 = new ValorInteiro(2);
		ExpressaoComparacao teste = new ExpressaoComparacao(n1, n2, "<");
		System.out.println(teste.avaliar().valor());
	}
}