package mhs.soma.br.mhs.deltaj;

/*** added by dSoma
 */
public class Main {
	public static void main(String args []) {
		ValorInteiro n1 = new ValorInteiro(1);
		ValorInteiro n2 = new ValorInteiro(2);
		ExpressaoSoma soma = new ExpressaoSoma(n1, n2);
		System.out.println(soma.avaliar().valor());
	}
}