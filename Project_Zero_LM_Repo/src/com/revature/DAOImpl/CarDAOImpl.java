package com.revature.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.CarDAO;
import com.revature.beans.Car;
import com.revature.utilities.ConnectionFactory;

public class CarDAOImpl implements CarDAO{
	public static ConnectionFactory cf = ConnectionFactory.getInstance();
	
	public void addCar(String model, String make, int yearMade, String color, double currentPrice)throws SQLException{
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO CARS VALUES(CARSEQ.NEXTVAL,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, model);
		ps.setString(2, make);
		ps.setInt(3, yearMade);
		ps.setString(4, color);
		ps.setDouble(5, currentPrice);
		ps.executeUpdate();

	}
	
	public List<Car> getCars() throws SQLException{
		
		List<Car> listOfCars = new ArrayList<Car>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CARS");
		Car car = null;
		while(rs.next()) {
			car = new Car(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getDouble(6));
			listOfCars.add(car);
		}
		
		return listOfCars;
	}

	
		
	

}
