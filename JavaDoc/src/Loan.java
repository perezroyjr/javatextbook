/** This class models a loan*/
public class Loan {

	/** Data field: annual interest rate */
	private double annualInterestRate;
	
	/** Data field: number of years */
	private int numberOfYears;
	
	/** Data field: loan amount */
	private double loanAmount;
	
	/** Data field: loan creation date */
	private java.util.Date loanDate;
	
	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	/** Construct a loan with specified annual interest rate,
	 * number of years, ad loan amount */
	 
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
	
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	/** Return annualInterestRate */
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	/** Return numberOfYears */
	public int getNumberOfYears(){
		return numberOfYears;
	}
	
	/** Set a numberOfYears*/
	public void setNumberOfYears(int numberOfYears){
		this.numberOfYears = numberOfYears;
	}
	
	/** Return loanAmount */
	public double getLoanAmount(){
		return loanAmount;
	}
	
	/** Set a newLoanAmount */
	public void setLoanAmount(double loanAmount){
		this.loanAmount = loanAmount;
	}
	
	/** Find monthly payment */
	public double getMonthlyPayment(){
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 
				(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	} 
	
	/** Find total payment */
	public double getTotalPayment(){
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	/** Return loan date */
	public java.util.Date getLoanDate(){
		return loanDate;
	}
	

	
}
