package com.testyantra.arrays;

public class TestB {

	public static void main(String[] args) {
		int[] nums = {10,20,30,40};
		String[] nums1 = {"101","202","303","404"};
	//	System.out.println(nums[9]);
		receive(nums);
		receive1(nums1);
	}
		static void receive(int[] numbers) {
			for (int i = 0; i < numbers.length; i++) {
				int j = numbers[i];
				System.out.println(j);
				
			}
		
		}
		static int[] getArray() {
			int[] values = {10,20,30,40,50};
			return values;
		}
		
		

		//	System.out.println(nums[9]);
		
		
			static void receive1(String[] strings) {
				for (int i = 0; i < strings.length; i++) {
					String j = strings[i];
					System.out.println(j);
					
				}
			
			}
			static int[] getString() {
				int[] values = {10,20,30,40,50};
				return values;
			}
			public TestB() {
				// TODO Auto-generated constructor stub
			}
		
	}


