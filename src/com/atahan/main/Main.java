package com.atahan.main;

import java.util.Arrays;

import com.atahan.bean.Dog;

public class Main {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[3];
		dogs[0] = new Dog("Terrier",4);
		dogs[1] = new Dog("Dalmatian",2);
		dogs[2] = new Dog("Bulldog",3);
	
		//Sorting using default compareTo() method.
		//Arrays.sort(dogs);
		
		//Sorting using a Comparator.
		Arrays.sort(dogs, Dog.DogAgeComparator);

		int i=0;
		for(Dog temp: dogs){
		   System.out.println("dogs " + ++i + " : " + temp.getBreed() + 
			", Age : " + temp.getAge());
		}
		
	}

}
