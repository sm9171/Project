package test.object.io;

public class TestObjectIO {

	public static void main(String[] args) {
		// 객체 입/출력 스트림 테스트
		ObjectIOSample osamp= new ObjectIOSample();
		osamp.testObjectOutputStream();
		osamp.testObjectInputStream();

	}

}
