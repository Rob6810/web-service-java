package calc;

import javax.xml.ws.Endpoint;

public class calc_publisher{

	public static void main(String [] args){
		final String url = "http://localhost:5000/rs";
		System.out.println("Publishing calc_service at endpoint: " + url);
		Endpoint.publish(url, new calc_service());
	}

}