import java.net.URL;
import client.CalcServiceService;
import client.CalcService;
import java.util.List;

public class client_web_service {
	public static void main(String[ ] args) throws Exception{
		URL baseUrl = new URL("http://localhost:5000/rs?wsdl");

		CalcServiceService service = new CalcServiceService(baseUrl);
		CalcService port = service.getCalcServicePort();

		int res;
		
		res = port.sumar(4, 3);
		System.out.println("La suma es " + res);
		
		res = port.restar(4, 3);
		System.out.println("La resta es " + res);
	}
}