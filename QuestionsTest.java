public class QuestionsTest {
	public static void main(String[] args) {
		QuestionsTest qt = new QuestionsTest();
		qt.tests();
	}
	
	public void tests() {
		int[] a = {6, 7, 2, 1, 7, 5};
		int[] b = {2, 3, 4, 7, 7, 9};
		int[] c = {2, 6, 4, 1, 7};
		
		if(PreTest.question1(a)==4) {
			if(PreTest.question1(b)==5) {
				System.out.println("question 1 works");
			}
		}
		
		if(PreTest.question2(4, a)==-1) {
			if(PreTest.question2(7, b)==3) {
				System.out.println("question 2 works");
			}
		}
		
		if(PreTest.question3(8, a)) {
			if(!PreTest.question3(3, b)) {
				if(PreTest.question3(5, c)) {
					System.out.println("question 3 works");
				}
			}
		}
	}
}
