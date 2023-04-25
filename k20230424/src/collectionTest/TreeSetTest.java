package collectionTest;

import java.util.TreeSet;
import java.util.Random;

import javax.annotation.processing.AbstractProcessor;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(500);
		System.out.println(tset+"size"+tset.size());
		tset.add(100);
		System.out.println(tset+"size"+tset.size());
		tset.add(99);
		System.out.println(tset+"size"+tset.size());
		tset.add(50);
		System.out.println(tset+"size"+tset.size());
		tset.add(50);
		System.out.println(tset+"size"+tset.size());//중복은 저장X
	
		tset.remove(99);
		System.out.println(tset+"size"+tset.size());
		
		tset.clear();
		System.out.println(tset+"size"+tset.size());
		
		Random random = new Random();
		
		
		while (true) {
			int lotto = random.nextInt(45) + 1;
			System.out.println(lotto);
			tset.add(lotto);
			if (tset.size() == 6 ) {
				break;
			}
		}
		System.out.println("1등은 "+tset);
		
		while (true) {
			int bonus = random.nextInt(45) + 1;
			System.out.println(bonus);
			tset.add(bonus);
			if (tset.size() == 7) {
				System.out.println("보너스는"+bonus);
				break;
			}
		}
		
	}
}