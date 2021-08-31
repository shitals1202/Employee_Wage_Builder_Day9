
package Day8.Employee_wage;
public class DailWages {
	public static int wageperhr=20;
	public static int dayhr=20;
	public static void main(String[] args){
		isWages();

	}
	public static void isWages(){
		int wages=wageperhr*dayhr;
		int empcheck=(int)Math.floor(Math.random()*10)%2;
		if(empcheck==0){
			System.out.println("Employee is present");
			System.out.println("Your salary is zero");
		}
		else{
			System.out.println("Employee is Absent");
			System.out.println("Your Salary is: "+wages); 
		}
	}
}