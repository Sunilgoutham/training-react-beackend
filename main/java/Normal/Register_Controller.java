package Normal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Normal.Register_Interface;
import Normal.Register_values;





@RestController
@RequestMapping("/record")
public class Register_Controller {
	@Autowired
	public Register_Interface send;
	  
	  
	@PostMapping("/addrecord")
	@CrossOrigin(origins= {"http://localhost:3000","http://localhost:3001"})
	public Register_values createStudent(@RequestBody Register_values record) {
		send.save(record);
		return record;

	}
	
}
