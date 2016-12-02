/**
 * 
 */
package springrest;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

/**
 * @author Krishna
 *
 */
public class SpringRestTestClient {

	public static final String REST_SERVICE_URI = "http://localhost:8080/springrest";
	
	/* GET */
    @SuppressWarnings("unchecked")
    private static void listAllCustomers(){
        System.out.println("Testing listAllUsers API-----------");
         
        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, Object>> customersMap = restTemplate.getForObject(REST_SERVICE_URI + "/customers.json", List.class);
         
        if(customersMap!=null){
            for(LinkedHashMap<String, Object> map : customersMap){
                System.out.println("User : First Name="+map.get("firstName")+", Last Name="+map.get("lastName")+", email="+map.get("email")+", mobile="+map.get("mobile"));;
            }
        }else{
            System.out.println("No user exist----------");
        }
    }
    
    
	public static void main(String args[]) {
		listAllCustomers();
	}
}
