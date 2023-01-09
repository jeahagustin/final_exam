# final_exam

1. Create a Customer class based on the given class diagram.
Note that the calculateBill is an abstract method, thus making the Customer an 
abstract class.

2. Create two concrete classes, RegularCustomer and SeniorCustomer,
extending the Customer class based on the given class diagram below.
Make sure that their constructor is calling the constructor of the Customer class.
The calculateBill method for the RegularCustomer class simply returns the value of 
the amount attribute.
The calculateBill method for the SeniorCustomer class simply returns the 
discounted value of the amount attribute. Make sure this method utilizes the discount
class attribute.

3. Create a Main class program with a main method/function. Your main 
method/function must demonstrate how polymorphism works:
- First, create a 1 Customer object, 1 RegularCustomer object and 1 
SeniorCustomer object. You may specify any argument/value upon calling the 
constructors for both RegularCustomer and SeniorCustomer objects.
- Next, initialize the Customer object to the RegularCustomer object then print the 
value returned after calling the calculateBill method of the Customer object
- Next, initialize the Customer object to the SeniorCustomer object then print the 
value returned after calling the calculateBill method of the Customer object.

4. Create a Quiz class based on the given class diagram.
Note: The grade method returns a value derived by its totalScore attribute divided by 
its maxScore attribute.
