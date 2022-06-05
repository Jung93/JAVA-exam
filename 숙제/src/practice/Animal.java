package practice;

public class Animal {

		String name;
		int age;
		double weight;
		String feed;
		String sound;
		
		public Animal() {
		
		}
		
		public Animal(String name, int age, double weight, String feed, String sound) {
			this.name = name;
			this.age = age;
			this.weight = weight;
			this.feed = feed;
			this.sound = sound;
		}
		
		void getSounds(){
			System.out.println(sound);
		}
		
		void eat() {
			System.out.println(name+"��(��)"+feed+"��(��) �Դ� ��");
		}
		
		void sleep() {
			System.out.println(name+"��(��)"+"�ڴ���");
		}
		
		
}
