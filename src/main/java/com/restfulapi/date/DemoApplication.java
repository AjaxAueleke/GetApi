package com.restfulapi.date;
import com.restfulapi.date.servertime.WordList;
import com.restfulapi.date.servertime.Formdata;
import com.restfulapi.date.servertime.ServerTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@GetMapping("/api")
	public ServerTime api() {
		return new ServerTime();
	}

	@PostMapping("/api")
	public boolean StringCheck(@RequestBody Formdata data)
	{
		System.out.println(data.word);
		return WordList.isInList(data.word);
	}

}
