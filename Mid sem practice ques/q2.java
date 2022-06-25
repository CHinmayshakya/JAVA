import java.util.*;
class q2{
	public static void main(String []k){
		System.out.println("----------CHOOSE YOUR OPTION----------"
							+'\n'+"   PRESS 1 FOR TERM DEPOSIT"
							+'\n'+"   PRESS 2 FOR RECURRING DEPOSIT"
							+'\n'+"   PRESS 3 FOR EXIT"
							+'\n'+"---------------------------------------"
							+'\n'+"ENTER YOUR CHOICE = ");
		Scanner scan_int = new Scanner(System.in);
		Scanner scan_float = new Scanner(System.in);
		int choice = 0;
		choice = scan_int.nextInt();
		switch(choice){
			case 1:
			{
				System.out.println("----------TERM DEPOSIT----------");
				int principal,time_period;
				float rate,maturity_amount;
				System.out.println('\n' + "ENTER PRINCIPAL AMOUNT");
				principal = scan_int.nextInt();
				System.out.println("ENTER RATE OF INTREST");
				rate = scan_float.nextFloat();
				System.out.println("ENTER TIME PERIOD");
				time_period = scan_int.nextInt();
				maturity_amount = principal * ((1 + (rate / 100)) * time_period);
				System.out.println("----------MATURITY AMOUNT----------" + '\n' + maturity_amount);	
			}
				break;
			case 2:
				System.out.println("----------RECURRING DEPOSIT----------");
				float rate,maturity_amount,time_period,monthly_installment;
				System.out.println('\n' + "ENTER MONTLY INSTALLMENT");
				monthly_installment = scan_float.nextFloat();
				System.out.println("ENTER RATE OF INTREST");
				rate = scan_float.nextFloat();
				System.out.println("ENTER TIME PERIOD");
				time_period = scan_float.nextFloat();
				maturity_amount = (monthly_installment * rate) + ((monthly_installment * (time_period * (time_period + 1))) / 2) * (rate / 100) * (1 / 12);
				System.out.println("----------MATURITY AMOUNT----------" + '\n' + maturity_amount);
				break;
			case 3:
				break;
		}		
	}
}