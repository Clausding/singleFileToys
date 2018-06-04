package com.dingya;

/**
 * 这个类可以计算显示器参数
 * 
 * @date 2018年5月7日
 * @author dingya
 */
public class CalculateMonitor {
	public static void main(String[] args) {
		System.out.println("-----------------显示器参数：1280, 1024, 17-----------------");
		getSquare(1280, 1024, 17);
		System.out.println();

		System.out.println("-----------------显示器参数：1920, 1080, 23-----------------");
		getSquare(1920, 1080, 23);
		System.out.println();

		System.out.println("-----------------显示器参数：1920, 1080, 21.5-----------------");
		getSquare(1920, 1080, 21.5);
		System.out.println();

		System.out.println("-----------------显示器参数：1366, 768, 14-----------------");
		getSquare(1366, 768, 14);
		System.out.println();

		System.out.println("-----------------显示器参数：1366, 768, 15.6-----------------");
		getSquare(1366, 768, 15.6);
		System.out.println();
	}

	/*
	 * 由矩形对角线的长度和两边的比例，求该矩形的面积
	 */
	public static double getSquare(double ratioParm1, double ratioParm2, double diagonalLength) {
		double ratio = ratioParm1 / ratioParm2;
		double sideLength = getSideLength(ratio, diagonalLength);
		double square = Math.pow(sideLength, 2) * ratio;
		double pixelDensity = ratioParm1 * ratioParm2 / square;

		// 打印矩形信息
		System.out.printf("比例：%f%n", ratio);
		System.out.printf("边长1：%f%n", sideLength);
		System.out.printf("边长2：%f%n", sideLength * ratio);
		System.out.printf("对角线长度：%f%n", diagonalLength);
		System.out.printf("面积：%f%n", square);
		System.out.printf("像素密度：%f%n", pixelDensity);

		return square;
	}

	/*
	 * 由矩形对角线的长度和两边的比例，求该矩形一边的长度
	 */
	public static double getSideLength(double ratio, double diagonalLength) {
		double sideLength = diagonalLength / (Math.sqrt(1 + Math.pow(ratio, 2)));
		return sideLength;
	}
}
