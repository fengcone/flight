package flight;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;

public class HttpUtli {
	private static String getString(String param) throws Exception {
		String url = "http://flights.ctrip.com/domesticsearch/search/SearchFirstRouteFlights?"
				+ param;
		CloseableHttpClient build = HttpClients.custom().build();
		HttpGet get = new HttpGet(url);
		Header header = new BasicHeader("Referer",
				"http://flights.ctrip.com/booking/BJS-HAK-day-1.html");
		get.setHeader(header);
		CloseableHttpResponse execute = build.execute(get);
		InputStream in = execute.getEntity().getContent();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String result = "";
		String temp = "";
		while ((temp = reader.readLine()) != null) {
			result = result + temp;
		}
		return result;
	}

	private static String getParam(String fromCity, String accCity, String date) {
		String result = "DCity1="
				+ fromCity
				+ "&ACity1="
				+ accCity
				+ "&SearchType=S&DDate1="
				+ date
				+ "rk=5.111084110103548215115&CK=07E64C7B8B753FE7C10F482A88D67442&r=0.5117335757222975874012";
		return result;
	}
	
	public static Integer getResult(String fromCity, String accCity,
			String date) throws Exception {
		String param = HttpUtli.getParam(fromCity, accCity, date);
		String result = HttpUtli.getString(param);
		String[] data = result.split(date);
		result = data[1].split(",")[0];
		result = result.substring(2, result.length());
		return Integer.valueOf(result);
	}

	
}
