package controller;

import dao.TeamDAO;
import model.City;
import model.Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dao.CityDAO;

public class Main{
	public static void main(String[] args) throws IOException,Exception{
		Team team=new Team(null, null, null);
		City city=new City(null, null);
		TeamDAO teamdao=new TeamDAO();
		CityDAO citydao=new CityDAO();
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Team Name ");
		String name=bf.readLine();
		System.out.println("Enter Coach Name ");
		String coach=bf.readLine();
		System.out.println("Enter City Name ");
		String cityName=bf.readLine();
		System.out.println("Enter the cityId");
		long cityId=Long.parseLong(bf.readLine());
		
		city.setCityName(cityName);
		city.setCityId(cityId);
		team.setName(name);
		team.setCoach(coach);
	    team.setCity(city);	
	    
	    teamdao.createTeam(team);
	    citydao.getCityByName(cityName);
	}
}

			