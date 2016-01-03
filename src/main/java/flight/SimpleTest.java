package flight;

import java.util.List;

import flight.City;

public class SimpleTest {
	public static void main(String... args) throws Exception {
		String date = "2016-02-05";
		City fromCity = City.首都机场_北京;
		City accCity = City.海口;
		List<City> cityList = City.cities;
		cityList.remove(fromCity);
		cityList.remove(accCity);
		for (City transCity : cityList) {
			try {
				Integer amount1 = HttpUtli.getResult(fromCity.getCityCode(),
						transCity.getCityCode(), date);
				Integer amount2 = HttpUtli.getResult(transCity.getCityCode(),
						accCity.getCityCode(), date);
				Integer resultAmount = amount1 + amount2;
				System.out.println("从"+transCity+"中转总价为"+resultAmount+"-------");
			} catch (Exception e) {
				System.out.println("从"+transCity+"中转总价查不到");
				continue;
			}
		}
		System.out.println("不中转的价格是"+HttpUtli.getResult(fromCity.getCityCode(),
				accCity.getCityCode(), date));
	}
}
