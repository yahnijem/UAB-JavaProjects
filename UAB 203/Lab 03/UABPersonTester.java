public class UABPersonTester{
	public static void main(String[] args) {
		UABPerson person1 = new UABPerson("Yahni Jemison", "Female", 20, "yjemison");
		UABPerson person2 = new UABPerson("Kendal", "Male", 22, "bkenjones");
	
		System.out.println(" Testing palidrom method " + person1.checkPalidrom());
		System.out.println(" Testing years to retirment method " + person2.yearsToRetirement());
		System.out.println(" Testing toString method " + person1);
		System.out.println(" Testing toString method " + person2);
	}
}
