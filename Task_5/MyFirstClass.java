import myfirstpackage.*;

public class MyFirstClass {
	public static void main(String[] args) {
		MySecondClass mySecClass = new MySecondClass();
		int i, j;
		for (i = 1; i <= 8; i++){
			for(j = 1; j <= 8; j++){
				mySecClass.SetFieldA(i);
				mySecClass.SetFieldB(j);
				System.out.print(mySecClass.Action());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}