package com.bilgeadam.boost.week4.lesson1.homework;

import java.util.Scanner;

public class ToyCar {
	private int batteryCapacity;
	private int distanceX;
	private int distanceY;

	public ToyCar() {
		this.batteryCapacity = 5;
		this.distanceX = 0;
		this.distanceY = 0;

	}

	void initToyCar() {
		ToyCar car = new ToyCar();
		boolean exit = true;
		while (exit) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"w-Move Forward\na-Move Left\ns-Move Backward\nd-Move Right\nc-Charge\ne-exit\nWhat you gonna do?");
			String move = scanner.nextLine();
			switch (move.toLowerCase()) {
			case "w":
				car.moveUpOnYAxis();
				break;
			case "a":
				car.moveLeftOnXAxis();
				break;
			case "s":
				car.moveDownOnYAxis();
				break;
			case "d":
				car.moveRightOnXAxis();
				break;
			case "c":
				car.chargeIt();
				break;
			case "e":
				exit = false;
				break;

			default:
				break;
			}
		}
	}

	private void remainingBatteryLife() {
		System.out.println("remainin battery: " + batteryCapacity);
		if (batteryCapacity <= 0) {
			System.out.println("dead battery! please charge!");
		}
	}

	void chargeIt() {
		if (batteryCapacity >= 5) {
			System.out.println("battery full.");
		} else {
			batteryCapacity += 1;
			remainingBatteryLife();
		}
	}

	void moveRightOnXAxis() {
		if(batteryCapacity<=0) {
		} else {
		System.out.println("x ekseninde pozitif yonde 1 birim hareket edildi.");
		distanceX += 1;
		batteryCapacity -= 1;
		currentPosition();
		} 
		remainingBatteryLife();

	}

	void moveLeftOnXAxis() {
		if(batteryCapacity<=0) {
		} else {
		System.out.println("x ekseninde negatif yonde 1 birim hareket edildi.");
		distanceX -= 1;
		batteryCapacity -= 1;
		currentPosition();
		}
		remainingBatteryLife();
	}

	void moveDownOnYAxis() {
		if(batteryCapacity<=0) {
		} else {
		System.out.println("y ekseninde asagi yonde 1 birim hareket edildi.");
		distanceY -= 1;
		batteryCapacity -= 1;
		currentPosition();
		} remainingBatteryLife();
	}

	void moveUpOnYAxis() {
		if(batteryCapacity<=0) {
		} else {
		System.out.println("y ekseninde yukari yonde 1 birim hareket edildi.");
		distanceY += 1;
		batteryCapacity -= 1;
		currentPosition();
		}
		remainingBatteryLife();
	}

	private void currentPosition() {
		System.out.println("current position: " + distanceX + " , " + distanceY);

	}

	public int getDistanceX() {
		return distanceX;

	}

	public void setDistanceX(int distanceX) {
		this.distanceX = distanceX;
	}

	public int getDistanceY() {
		return distanceY;
	}

	public void setDistanceY(int distanceY) {
		this.distanceY = distanceY;
	}

}
