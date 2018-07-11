package properties;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertyClass {

	public static void main(String[] args) {
		
		//properties class is sub class of hashtable class(map implementation)
		/*
		 * HashMap:
- can have one null key and many null value
- is not synchronized

HashTable:
- can not have any null key and null value
- is synchronized(makes slower)

Properties is a subclass of hashTable
		 */
		Properties prop=new Properties();
		prop.setProperty("Tyson", "23456");
		prop.setProperty("Fairfax", "23786");
		prop.setProperty("Centraville", "26556");
		System.out.println(prop.getProperty("Tyson"));
		System.out.println(prop);
		prop.setProperty("Orlando", "65456");
		prop.setProperty("Denver", "45636");
		prop.setProperty("Lansing", "44456");
		Set<Entry<Object, Object>> cities=prop.entrySet();
		for(Entry<Object,Object> city: cities) {
			System.out.println(city.getKey()+" : "+city.getValue());
			
		}
		

	}

}
