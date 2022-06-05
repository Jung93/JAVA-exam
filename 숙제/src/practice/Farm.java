package practice;

public class Farm {
	public static void main(String[] args) {
		Animal dog = new Animal("大大捞",3,5.8,"绊扁","港港");
		Animal cat = new Animal("成成捞",3,4.7,"积急","箕厩");
		Animal pig = new Animal("蹬瘤樄",3,30.5,"巢狼 逛","茬竣茬竣");
		
		pig.eat();
		pig.getSounds();
		pig.sleep();
		
		
	}
}
