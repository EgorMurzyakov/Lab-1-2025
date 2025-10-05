package myfirstpackage;

public class MySecondClass {
	private int fieldA;
	private int fieldB;
	
	public MySecondClass() { // Конструктор по умолчацию
		this.fieldA = 0;
		this.fieldB = 0;
	}
	public MySecondClass(int _a, int _b){ // Конструктор, инициализирующий значение полей входящими значениями
		this.fieldA = _a;
		this.fieldB = _b;
	}

	public void SetFieldA(int _a) { // Изменение значений
		fieldA = _a;
	}
	public void SetFieldB(int _b) {
		fieldB = _b;
	}

	public int GetFieldA() { // Получение значений
		return fieldA;	
	}
	public int GetFieldB() {
		return fieldB;	
	}

	public int Action() { // A * B - A + B
		return fieldA * fieldB - fieldA + fieldB;
	}
}