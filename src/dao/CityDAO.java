
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	public City getCityByName(String name) throws Exception {
		ConnectionManager cm=new ConnectionManager();
		Connection con=cm.getConnection();
		
		//String sql="select * from Team1 t,city1 c where c.cityname=t.name";
		//String sql="select * from Team1,city1";
		String sql="Select Name,Coach,CityName from Team1,City1";
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(sql);
		System.out.println("Team has been Created");
		System.out.println("Team Details are :");
		System.out.println("Team_name\t\tcoach\t\tcity_name");
		while(rs.next()) {
			System.out.println(rs.getString("name")+"\t\t"+rs.getString("coach")+"\t\t"+rs.getString("cityname"));
		}
		rs.close();
		st.close();
		con.close();
		return null;
		
	}
}