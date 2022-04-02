public class Main {

    public static void main(String[] args) {
	    Employee sam = new Employee("Sam Emanuel", 1233, "Manager", 123000, 2019);
        System.out.println(sam.getName());
        System.out.println(sam.getHireDate());
        sam.requestPromotion();
    }
}
