package calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.Random;

@WebService
	public class calc_service{
		
		@WebMethod
		public int sumar(int a, int b){
			return (a + b);
		}

		@WebMethod
		public int restar(int a, int b){
			return (a - b);
		}

	}