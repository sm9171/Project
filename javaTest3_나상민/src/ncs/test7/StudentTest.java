package ncs.test7;

public class StudentTest {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0]=new Student("ȫ���",25,171,81,"201401","�������");
		students[1]=new Student("�ѻ��",23,183,72,"201402","������");
		students[2]=new Student("�Ӳ���",26,175,65,"201403","ü����");
		for(int i=0;i<students.length;i++){
			System.out.println(students[i].toString());
		}

	}

}
