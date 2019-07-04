package com.revature.beans;

public class Car {
	
	public Car () {
		
	}
	
	private String model;
	private String make;
	private int yearMade;
	private String color;
	private double currentPrice;
	private String onLot;
	
	
	public Car(String model, String make, int yearMade, String color, double currentPrice, String onLot) {
		this.model = model;
		this.make = make;
		this.yearMade = yearMade;
		this.color = color;
		this.currentPrice = currentPrice;
		this.onLot = onLot;
	}
	
	
	

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYearMade() {
		return yearMade;
	}
	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	
	
	public String getOnLot() {
		return onLot;
	}




	public void setOnLot(String onLot) {
		this.onLot = onLot;
	}




	@Override
	public String toString() {
		return "Car [model= " + model + ", make= " + make + ", yearMade= " + yearMade + ", color=" + color
				+ ", currentPrice= " + currentPrice + ", onLot= " + onLot + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(currentPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + yearMade;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(currentPrice) != Double.doubleToLongBits(other.currentPrice))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (yearMade != other.yearMade)
			return false;
		return true;
	}
	
}