
public class employee {
	
	public static void main(String[] args) {
		employee1 e1 = new employee1();
		e1.count();
		employee1 e2 = new employee1();
		e2.count();
		e1.showResult();
		e2.showResult();
	}
	
}

class employee1{
	public static int counter;
	public void count() {
		counter++;
	}
	public void showResult() {
		System.out.println(counter);
	}
}
