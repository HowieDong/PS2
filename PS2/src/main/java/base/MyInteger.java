package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		if (iValue % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isOdd(){
		if (isEven()){
			return false;
		}
		else{
			return true;
		}
	}
	public boolean isPrime(){
		if (iValue > 2){
			for (int n = 2; n <= iValue/2; n++){
				if (iValue % n == 0){
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isEven(int i){
		if (i % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(int i){
		if (isEven(i)){
			return false;
		}
		else{
			return true;
		}
	}
	public static boolean isPrime(int i){
		if (i > 2){
			for (int n = 2; n <= i/2; n++){
				if (i % n == 0){
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger i){
		return i.isEven(); 
	}
	public static boolean isOdd(MyInteger i){
		return i.isOdd();
	}
	public static boolean isPrime(MyInteger i){
		return i.isPrime();
	}
	
	public boolean equals(int i){
		if (iValue == i){
			return true;
		}
		return false;
	}
	public boolean equals(MyInteger i){
		return i.equals(iValue);
	}
	
	
}
