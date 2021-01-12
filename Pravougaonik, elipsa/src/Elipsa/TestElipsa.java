package Elipsa;

import Util.*;

public class TestElipsa {

	public static void main(String[] args) {
		Elipsa elipsa1 = new Elipsa(new Tacka(), 10, 10);
		System.out.println(elipsa1);
		System.out.println("elipsa1.getBrojacOblika(): " + elipsa1.getBrojacOblika());
		Krug K = new Krug(new Tacka(), 10);
		System.out.println(K);
		System.out.println("elipsa1.getBrojacOblika(): " + elipsa1.getBrojacOblika());
	}

}
