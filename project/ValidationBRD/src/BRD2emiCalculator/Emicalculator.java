package BRD2emiCalculator;

public class Emicalculator {
	private double p;            //principle_Amount;
	private double i;            //rate
	private double t;            //tenure
	private double n;            //number_of_installment;
	//private double rv;           //residualValue;
	private double emi;
	
	public Emicalculator(double principle_Amount, double rate, double tenure,
			double totalNumberOfInstallmentInyear) {
		super();
		this.p = principle_Amount;
		this.i = rate/(100*12);
		this.t = tenure*12;
		this.n = totalNumberOfInstallmentInyear *tenure;
		//this.rv = residualValue;
	}	
	public long getInstallment() {
		double a,b,c;
		a=(p*(i/n));
		c=(1-1/Math.pow((1+i/n), n));
		emi=((a)/c);
		return Math.round(emi);
	}
	public String getSchedule() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder=new StringBuilder("Installment Number\tOpening\tPrincipal Return \t Interest\t EMI\t Closing");
		double opening=p;
		double installment=this.getInstallment();
		for (int i = 1; i <= n; i++) {
			double interest=Math.round(opening*this.i/t);
			double principalRepaid=Math.round(installment-interest);
			double closing=Math.round(opening-principalRepaid);
//			if(closing<0)
//			{
//				closing=0;
//				//System.out.println(i+);
//			}
			stringBuilder.append("\n"+i+"\t\t\t").append(opening+"\t\t").append(principalRepaid+"\t\t").append(interest+"\t\t").append(installment+"\t\t").append(closing);
			opening=closing;
			
		}
		return stringBuilder.toString();
		

	}
	
	
	
	
	
	
	
	
	
	
}
