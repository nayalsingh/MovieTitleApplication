package org.mukesh.test.service;

import java.util.Map;
import java.util.TreeMap;

import org.mukesh.test.Database.MovieDatabase;



public class MovieService {
	

	Map<String,String> map=new TreeMap<String,String>();
	public String[] getMoviesList(String title)
	{
		
		for(String s:MovieDatabase.titles)
		{
			if(s!=null && s.contains(title))
			{
				map.put(s, s);
			}
		}
		
		return map.values().toArray(new String[0]);
	}
	
}
