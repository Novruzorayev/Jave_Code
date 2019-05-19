package com.class22;

public class Child1 extends Parent{
	public static void main(String[] args) {
		Child1 obj = new Child1();
			System.out.println("Child 1 eye color "+obj.eyeColor);
			System.out.println("Child 1 hair color "+obj.hairColor);
			System.out.println("Child 1 has "+obj.nose+" nose");
			Child1Object.playTennis();

            Parent parentObject = new Parent();
            // parentObject.hairType --> not accessible in Parent Class
	}
	public void playTennis() {
		System.out.println("Child 1 can play tennis");
	}

}
