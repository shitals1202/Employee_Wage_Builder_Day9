package Day8.Employee_wage;

public class Switch_case{
	public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   public static final int EMP_RATE_PER_HOUR = 20;

   public static void main(String[] args){
   	int emphrs =0;
   	int empwage =0;
   	isSwitchcase(emphrs,empwage);
     }
    public static void isSwitchcase(int emphrs, int empwage)
{
	int empcheck=(int)Math.floor(Math.random()*10)%2;
switch(empcheck){
	case IS_PART_TIME:
	emphrs=4;
	break;
	case IS_FULL_TIME:
	emphrs=8;
	break;
	default:
	emphrs=0;
}
empwage = emphrs * EMP_RATE_PER_HOUR;
System.out.println("Emp wage: "+empwage);
}

}