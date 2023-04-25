package collectionTest;

import java.util.HashSet;
import java.util.Random;

import javax.annotation.processing.AbstractProcessor;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<Integer> hset = new HashSet<>();
		hset.add(500);
		System.out.println(hset+"size"+hset.size());
		hset.add(100);
		System.out.println(hset+"size"+hset.size());
		hset.add(99);
		System.out.println(hset+"size"+hset.size());
		hset.add(50);
		System.out.println(hset+"size"+hset.size());
		hset.add(50);
		System.out.println(hset+"size"+hset.size());//중복은 저장X
	
		hset.remove(99);
		System.out.println(hset+"size"+hset.size());
		
		hset.clear();
		System.out.println(hset+"size"+hset.size());
		
		Random random = new Random();
		
		
		while (true) {
			int lotto = random.nextInt(45) + 1;
			System.out.println(lotto);
			hset.add(lotto);
			if (hset.size() == 6 ) {
				break;
			}
		}
		System.out.println("1등은 "+hset);
		
		while (true) {
			int bonus = random.nextInt(45) + 1;
			System.out.println(bonus);
			hset.add(bonus);
			if (hset.size() == 7) {
				System.out.println("보너스는"+bonus);
				break;
			}
		}
		
	}
}