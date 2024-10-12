public class ForDemo {
	public static void main(String[] args) {
		System.out.println("*****For Demo******");
		
		for (int cont = 0; cont < 100; cont++) {
			System.out.println(cont);
			if(cont == 47) {
				break;
			}//if 47
		}//for cont
		System.out.println("Ciclo terminado");
		
		System.out.println("****For Demo Continue***");
		for (int i = 0; i < 100; i++) {
			if((i % 2) == 1) {
				continue;
			}//if par
			System.out.println(i);
		}//for continue
	}//main
}//class ForDemo
