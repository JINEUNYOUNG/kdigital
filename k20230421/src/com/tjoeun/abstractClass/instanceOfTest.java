package com.tjoeun.abstractClass;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Animal {
	
//	public void move() {
//		System.out.println("동물이 움직입니다.");

		public abstract void move();		//추상 메소드
		public void eating() {					//일반 메소드(반드시 추상 메소드만 있어야한단건아님~)
			
		}
//	}
}

// Human 클래스는 Animal클래스를 상속받아

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("두발로걷습니다.");
	}
	public void readBooks() {
		System.out.println("책을 읽습니다.");
	}
}

// Tiger 클래스는 Animal클래스를 상속받아

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("네발로걷습니다.");
	}
	public void hunting() {
		 System.out.println("사냥을합니다.");

	}
	
}

// Cat 클래스는 Animal클래스를 상속받아

class Cat extends Animal {

	@Override
	public void move() {
		System.out.println("네발로뜁니다.");
	}
		public void grumming() {
			System.out.println("세수를합니다.");
			
		}

}




public class instanceOfTest {
	
	
	public static void main(String[] args) {
		
		Animal[] animals = {new Human(), new Tiger(), new Cat()};
		animals[0].move();		
		animals[1].move();		
		animals[2].move();		
		System.out.println("===========================");
	  
//		 main()이라는 static 메소드에서 moveanimal() 을 바로 실행하기 떄문에 moveanimal이란 메소드는 반드시 static으로 선언되어야함 
//		static은 static만 가넝 
		Animal  hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal cAnimal = new Cat();
		
		instanceOfTest test = new instanceOfTest();
		 moveAnimal(hAnimal);
		  moveAnimal(tAnimal);
		  moveAnimal(cAnimal);		  
		  
		  
		  ArrayList<Animal> animalList = new ArrayList<>();
		  animalList.add(hAnimal);
		  animalList.add(tAnimal);
		  animalList.add(cAnimal);
		  
		  for (Animal animal : animalList ) {
			  animal.move();
		  }
		  
		  System.out.println("===========================");
		  
		  for (int i=0; i<animalList.size(); i++) {
			  Animal animal = animalList.get(i);
//			  downcasting 
			  if (animal instanceof Human) {
				  System.out.println("가능");
			  }else {System.out.println("불가능");} 
					  
			  
		  }
		  
}
	private static void moveAnimal(Animal animal) {
		animal.move();
	}

}