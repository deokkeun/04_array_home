package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice7() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			if(i <= 7) {
				arr[i] = input.charAt(i);
			} else {
				arr[i] = '*';
			}
			
			System.out.print(arr[i]);
		}
}
	
	public void practice8() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int num = arr.length / 2 + 1;
		
		for(int i = 0; i < arr.length; i++) {
			if(input < 3 || input % 2 == 0) {
				System.out.println("다시 입력하세요");
			} else if(i < num) {
				arr[i] = i + 1;
			} else {
				arr[i] = --num;
			}
		}
		
		for(int x = 0; x < arr.length - 1 ; x++) {
			System.out.print(arr[x] + ", ");
		}
		System.out.println(arr[input - 1]);
	}

	
	public void practice9() {
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random()*10)+1;
			arr[i] = num;
			System.out.print(num + " ");
			
		}
		System.out.println();
		
		int max = arr[0];
		int min = arr[0];
		
		for(int x = 0; x < arr.length; x++) {			
			if(arr[x] > max) {
				max = arr[x];
			} else if(arr[x] < min) {
				min = arr[x];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최대값 : " + min);
		
		
		
	}
	
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			int ran = (int)(Math.random()*10)+1;
			arr[i] = ran;
			
		
			
			
			
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void practice12() {}
	
	public void practice13() {

		
		
		
		
		
	}
	
	public void practice14() {}
	
	public void lotto() {
		
		int[] lotto = new int[3];
		
		for(int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random()*3)+1;
			lotto[i] = random;
			
			for(int x = 0; x < i; x++) {
				if(random == lotto[x]) {
					
					i--;
					
					break;
					
				}
			}
		}
		
		//Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	
}