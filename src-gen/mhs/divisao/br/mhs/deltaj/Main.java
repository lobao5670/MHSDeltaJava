package mhs.divisao.br.mhs.deltaj;

/*** added by dDivisao
 */
public class Main {
	public static void main(String args []) {
		ValorInteiro n1 = new ValorInteiro(6);
		ValorInteiro n2 = new ValorInteiro(2);
		ExpressaoDivisao teste = new ExpressaoDivisao(n1, n2);
		System.out.println(teste.avaliar().valor());
	}
}