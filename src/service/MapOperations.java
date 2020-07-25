package service;
import java.util.*;

import model.TouristPlace;

public class MapOperations {
	Map<String,TouristPlace> hash = new HashMap<String,TouristPlace>();
	Map<String,TouristPlace> linkedhash = new LinkedHashMap<String,TouristPlace>();
	Map<String,TouristPlace> treemap = new TreeMap<String,TouristPlace>();
	
	public HashMap<String,TouristPlace> add(TouristPlace places)
	{
		hash.put(places.getRank(),places);
		linkedhash.put(places.getRank(),places);
		treemap.put(places.getRank(),places);
		return  (HashMap<String, TouristPlace>) hash;	
	}
	public Map<String, TouristPlace> sortRandomly(Map<String, TouristPlace> places)
	{
		return  (HashMap<String, TouristPlace>) hash;
	}
	public Object sortInEntryOrder(Map<String,TouristPlace> places)
	{ 
        return linkedhash; 
	}
	public Object sortAlphabetically(Map<String,TouristPlace> places)
	{
        return treemap; 	
	}
	public Object reset(Map<String, TouristPlace> map2)
	{
		map2.clear();
		return map2;
	}
	public Object remove(TouristPlace places)
	{
		hash.remove(places.getRank(),places);
		linkedhash.remove(places.getRank(),places);
		treemap.remove(places.getRank(),places);
		return  (HashMap<String, TouristPlace>) hash;
	}

}
