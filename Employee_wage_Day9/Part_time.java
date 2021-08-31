package Day8.Employee_wage;
public class Part_time {
	public static int ispart_time=1;
	public static int isfulltime=2;
	public static int emp_rate_per_hr=20;

	public static void main(String[] args){
		isPartTime();
	}
	public static void isPartTime(){
		int emp_hr=8;
		double empcheck=Math.floor(Math.random()*10)%2;
		if (isfulltime==empcheck) {
			int salary=emp_rate_per_hr*emp_hr;
			System.out.println("Employee is present");
			System.out.println("Salary is:"+salary);
		}
	else if(ispart_time == empcheck){
			int emp_hrs=4;
			int salary=emp_rate_per_hr*emp_hrs;
			System.out.println("Employee is present");
			System.out.println("Salary is:"+salary);

		}
		else{
			System.out.println("Employee is Absent");
			System.out.println("Salary is zero");
	}
}

}