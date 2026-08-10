public class Ex3 {
	public static void main (String[] args) {
		int [] vetor = new int[3];
		vetor [0] = 10;
		vetor [1] = 20;
		vetor [2] = 30;

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d. %d\n", i+1, vetor[i]);
		}
	}
}
