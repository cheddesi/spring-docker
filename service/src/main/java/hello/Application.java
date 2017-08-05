package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
//import hello.ServerProperties;

@SpringBootApplication
@RestController
public class Application {
//	@Autowired
//    private ServerProperties serverProperties;
@Autowired
private Environment env;

@Value("${myapp.dburl}")
private String dbUrl;

@Value("${myapp.dbport}")
private String dbPort;

    @RequestMapping("/")
    public String home() {
        return "DB URL is: "+dbUrl + " & DB Port is:"+dbPort;
    }
	
	

    public static void main(String[] args) {
//        System.out.println(serverProperties.getDbUrl());
		SpringApplication.run(Application.class, args);
		
    }

}
