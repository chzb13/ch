package com.cn.ch.za.ch.decorator;

public abstract class ShapeDecorator implements Shape {

	private Shape decoratedShape;

	public ShapeDecorator(Shape decoratorShape) {
		super();
		this.decoratedShape = decoratorShape;
	}

	public void draw() {
		decoratedShape.draw();
	}

}
