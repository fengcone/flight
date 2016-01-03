package flight;

import java.util.List;

public class SimpleTest2 {
	public static void main(String[] args) {
		String date = "2015-02-04";
		City accCity = City.海口;
		List<City> cities = City.cities;
		cities.remove(accCity);
		for (City city : cities) {
			try {
				System.out.println("从"
						+ city
						+ "去"
						+ accCity
						+ "的Money是"
						+ HttpUtli.getResult(city.getCityCode(),
								accCity.getCityCode(), date));
			} catch (Exception e) {
				System.out.println(city+"没有");
				continue;
			}
		}
	}
}
