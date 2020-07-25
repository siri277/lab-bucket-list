package service;
import java.util.*;

import model.TouristPlace;

public class SetOperations 
{
	HashSet<TouristPlace> hs=new HashSet<TouristPlace>();
	
	public HashSet<TouristPlace> add(TouristPlace places)
	{
		hs.add(places);
		return hs;	
	}
	public HashSet<TouristPlace> remove(TouristPlace places)
	{
		hs.remove(places);
		return hs;	
	}
	public Object sortByDestination(Set<TouristPlace> set)
	{
		TreeSet<TouristPlace> h =  
                new TreeSet<TouristPlace>((o1, o2) -> o1.getDestination().compareTo(o2.getDestination()));
		for(TouristPlace p:set)
		{
			h.add(p);
		}   
		return h;	
	}
	public Object sortByRank(Set<TouristPlace> places)
	{
		 
		TreeSet<TouristPlace> h =  
                new TreeSet<TouristPlace>((o1, o2) -> o1.getRank().compareTo(o2.getRank()));
		for(TouristPlace p:places)
		{
			h.add(p);
		}  
		return h;	
	}
	public Object reset(Set<TouristPlace> places)
	{
		places.clear();
		return  places;
		
	}
}

