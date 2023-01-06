public class RegularCustomer extends Customer
{
	RegularCustomer (String name, double amount){
		super(name, amount);
	}
	@Override
	double calculateBill(){
		return amount;
	}
}
