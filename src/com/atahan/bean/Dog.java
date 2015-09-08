package com.atahan.bean;

import java.util.Comparator;

final public class Dog extends Animal implements Comparable<Dog>{
	final private String breed;

	public Dog(String breed,int age) {
		super(age);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	@Override
	final public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		return result;
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		return true;
	}

	@Override
	final public int compareTo(Dog o) {
		//ascending order
		return this.getAge() - ((Dog) o).getAge();
		
		//descending order
		//return ((Dog) o).getAge() - this.getAge();
	}
	
	final public static Comparator<Dog> DogAgeComparator  = new Comparator<Dog>() {

		final public int compare(Dog dog1, Dog dog2) {
		
			int dogAge1 = dog1.getAge();
			int dogAge2 = dog2.getAge();
			
			//ascending order
			return dogAge1 - dogAge2;
			
			//descending order
			//return dogAge2 - dogAge1;
		}

	};
}
