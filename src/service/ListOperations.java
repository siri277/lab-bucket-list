package service;

import java.util.*;

import model.TouristPlace;

public class ListOperations {
	List<TouristPlace> list = new ArrayList<TouristPlace>();
	public List add(TouristPlace places)
	{
		list.add(places);
		return list;	
	}
	public List remove(TouristPlace places)
	{
		list.remove(places);
		return list;
	}
	public Object sortByDestination(List<TouristPlace> places) {
		Comparator<TouristPlace> cm1=Comparator.comparing(TouristPlace::getDestination);
		Collections.sort(list, cm1);
		return cm1;
	}
	public Object sortByRank(List<TouristPlace> places) {
		list.sort((TouristPlace tp1,TouristPlace tp2)->tp1.getRank().compareTo(tp2.getRank()));
		return list;
	}
	public Object reset(List<TouristPlace> places) {
		places.clear();
		return places;
	}


}