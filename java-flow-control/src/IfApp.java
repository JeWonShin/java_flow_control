
public class IfApp {

	public static void main(String[] args) {

		System.out.println("a");

		if (false) { // �Ұ�ȣ�κ�(���ǽ�) �� true�� ���� �߰�ȣ�� �ִ� ������ ����ȴ�. ���� �ش� ������ ����x
			System.out.println(1);
		} else { 	// if ���� ���ǽ��� false�� �� else �κ��� ������ ��µȴ�.
			System.out.println(2);
		}

		System.out.println("b");

//---------------------------------------------		
		if (false) {
			System.out.println(1);
		} else {
			if (true) { // if-else���� ��ø�Ǿ� ��밡���ϴ�. ������ �ش� ������ �� ����� �ϴ� ����� �ִ�.
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}

		System.out.println("b");

//---------------------------------------------			
		if (false) {
			System.out.println(1);
		} else if (true) { //else if�� ����ϸ� �ΰ��� �̻��� ��쿡 ���� ���ǹ��� ����� �� �ִ�.
			System.out.println(2);
		} else {
			System.out.println(3);
		}

		System.out.println("b");

//---------------------------------------------	

	}

}
