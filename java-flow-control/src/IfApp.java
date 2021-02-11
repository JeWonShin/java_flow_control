
public class IfApp {

	public static void main(String[] args) {

		System.out.println("a");

		if (false) { // 소괄호부분(조건식) 이 true일 때만 중괄호에 있는 문장이 실행된다. 따라서 해당 문장은 실행x
			System.out.println(1);
		} else { 	// if 문의 조건식이 false일 때 else 부분의 문장이 출력된다.
			System.out.println(2);
		}

		System.out.println("b");

//---------------------------------------------		
		if (false) {
			System.out.println(1);
		} else {
			if (true) { // if-else문은 중첩되어 사용가능하다. 하지만 해당 문장을 더 깔끔히 하는 방법이 있다.
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}

		System.out.println("b");

//---------------------------------------------			
		if (false) {
			System.out.println(1);
		} else if (true) { //else if를 사용하면 두가지 이상의 경우에 대한 조건문을 사용할 수 있다.
			System.out.println(2);
		} else {
			System.out.println(3);
		}

		System.out.println("b");

//---------------------------------------------	

	}

}
