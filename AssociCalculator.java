import java.util.Scanner;

public class AssociCalculator {
    public static void main(String[] args) {
        System.out.println("Practicing Association");

        Battery batteryObj=new Battery("Duracell", 9, 100);
        Calculator calculatorObj=new Calculator(batteryObj);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1=sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2=sc.nextInt();
        // System.out.println("Enter Operation you want to Perform--> Add/Subtract/Multiply/Divide");
        // String operation=sc.next();

        
        System.out.println("Addition is: "+calculatorObj.calcutale(num1, num2, "add"));
        System.out.println("Subtraction is: "+calculatorObj.calcutale(num1, num2, "subtract"));
        System.out.println("Multiplication is: "+calculatorObj.calcutale(num1, num2, "multiply"));
        System.out.println("Division is: "+calculatorObj.calcutale(num1, num2, "divide"));
        
    }
}
class Gadget{

}
class Calculator extends Gadget{
    private Battery batteryObj;

    public Calculator(Battery batteryObj){
        this.batteryObj=batteryObj;
        System.out.println("Calculator Using Battery of Brand "+batteryObj.getType()+" having Voltage of "+ batteryObj.getVoltage()+" Volts and its cost is "+batteryObj.getCost()+" Rs");
        batteryObj.showFeatures();
    }

    
    int calcutale(int a,int b, String operation){
        
        int result=0;
        switch(operation){
            case "add":
                result=a+b;
                break;

            case "subtract":
                result=a-b;
                break;

            case "multiply":
                result=a*b;
                break;
                
            case "divide":
                if(b!=0){
                    result=a/b;
                }
                else{
                System.out.println("Division by 0 is not possible");
                }
                break;

            default:
                System.out.println("invalid operation");
        }
        return result;
    
    }
    
}
class Battery{
    private String type;
    private float voltage;
    private double cost;

    public Battery(String type,float voltage,double cost){
        this.type=type;
        this.voltage=voltage;
        this.cost=cost;
        
    }
    public void showFeatures(){
        System.out.println("Battery Brand : "+type);
        System.out.println("Battery Voltage : "+voltage);
        System.out.println("Battery Cost : "+cost);
    }
    public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getVoltage() {
		return voltage;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
