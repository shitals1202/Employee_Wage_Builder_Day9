package Day8.Employee_wage;
 public class Present {
	public static void main( String[] args){
		isPresent();
	}
  static void isPresent() {
	int isfulltime=1;
	double empcheck;
	empcheck = Math.floor(Math.random()*10)%2;
	if (empcheck==isfulltime)
		System.out.println("emp is present");
	else
		System.out.println("emp is absent");
}
}
