package com.example.spring.core.component;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	@Autowired
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	@Autowired
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	@Autowired
	public void setpointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("PointA is (" + pointA.getX() + ", " + pointA.getY() + ")");
		System.out.println("PointB is (" + pointB.getX() + ", " + pointB.getY() + ")");
		System.out.println("PointC is (" + pointC.getX() + ", " + pointC.getY() + ")");
	}

}
