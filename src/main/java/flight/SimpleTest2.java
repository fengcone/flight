package flight;

import java.util.List;

public class SimpleTest2 {
	public static void main(String[] args) {
		String date = "2015-02-04";
		City accCity = City.����;
		List<City> cities = City.cities;
		cities.remove(accCity);
		for (City city : cities) {
			try {
				System.out.println("��"
						+ city
						+ "ȥ"
						+ accCity
						+ "��Money��"
						+ HttpUtli.getResult(city.getCityCode(),
								accCity.getCityCode(), date));
			} catch (Exception e) {
				System.out.println(city+"û��");
				continue;
			}
		}
	}
}
