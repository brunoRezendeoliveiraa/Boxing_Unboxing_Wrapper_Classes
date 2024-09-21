
public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Wrapper Classes */
		
		//As wrapper classes tem o objetivo de tratar os objetivos primitivos como classe, sem a necessidade de fazer conversões ou castings.
		// E é melhor o tipo Wrapper class do que o tipo primivito porque ele aceita o valor nulo.
		
		int x = 20;
		
		//int obj = x;
		Integer obj = x;
		
		System.out.println(obj);
		
		//int y = (int) obj;
		int y = obj * 2;
		
		System.out.println(y);
	}

}
