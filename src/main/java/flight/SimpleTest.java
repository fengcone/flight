package flight;

import java.util.List;

import flight.City;

public class SimpleTest {
	public static void main(String... args) throws Exception {
		String date = "2016-02-05";
		City fromCity = City.�׶�����_����;
		City accCity = City.����;
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
				System.out.println("��"+transCity+"��ת�ܼ�Ϊ"+resultAmount+"-------");
			} catch (Exception e) {
				System.out.println("��"+transCity+"��ת�ܼ۲鲻��");
				continue;
			}
		}
		System.out.println("����ת�ļ۸���"+HttpUtli.getResult(fromCity.getCityCode(),
				accCity.getCityCode(), date));
	}
}
