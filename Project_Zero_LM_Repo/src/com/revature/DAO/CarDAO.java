package com.revature.DAO;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Car;

public interface CarDAO {
	
	public abstract void addCar(String model, String make1, int yearMade, String color, double currentPrice)
			throws SQLException;
	
	public abstract List<Car> getCars()
			throws SQLException;
}
	//public abstract void removeCar(String model, String make, int yearMade, String color, double currentPrice)
			//throws SQLException;
//}
