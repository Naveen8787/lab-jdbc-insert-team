package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	public void createTeam(Team team) throws Exception {
		String name=team.getName();
		String coach=team.getCoach();
		City city=team.getCity();
	    long id=city.getCityId();
	    String cityname=city.getCityName();
	 
	    ConnectionManager cm=new ConnectionManager();
	    Connection con=cm.getConnection();
	    //already created tables 
	    String sql="insert into team1(name,coach)VALUES(?,?)";
	    
	    PreparedStatement st=con.prepareStatement(sql);
		st.setString(1,name);
		st.setString(2,coach);
		st.executeQuery();
	    st.close();
	    
		String Query="insert into city1(id,cityname)VALUES(?,?)";
	
	    PreparedStatement st1=con.prepareStatement(Query);
	    st1.setLong(1,id);
		st1.setString(2,cityname);
		st1.executeQuery();
	    st1.close();
	}
}