package Day8.Employee_wage;

public class work_hrs {
        public static final int IS_PART_TIME = 1;
         public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
        public static final int NUM_OF_WORKING_DAYS = 2;
        public static final int MAX_HRS_IN_MONTH = 10;
  public static void main(String[] args){
        int emphrs=0;
        int totalemphrs = 0;
        int totalworkingdays = 0;
        isWorkhrs(emphrs,totalemphrs,totalworkingdays );
      }
      public static void isWorkhrs(int emphrs,int totalemphrs,int totalworkingdays){
          while (totalemphrs <= MAX_HRS_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAYS) {
          totalworkingdays++;
          int empcheck = (int) Math.floor(Math.random() * 10) %3;
          switch (empcheck){
          case IS_PART_TIME:
          emphrs = 4;
          break;
          case IS_FULL_TIME:
          emphrs = 8;
          default:
          emphrs = 0;
          }

        totalemphrs +=emphrs;
       System.out.println("Day: " + totalworkingdays + "emp hr: " + emphrs);
       }
       int totalempwage = totalemphrs * EMP_RATE_PER_HOUR;
       System.out.println("Total emp wage: " + totalempwage);
       }    
  }

