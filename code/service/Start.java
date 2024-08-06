package service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Setup.class);
    }
}

@SpringBootApplication
class Setup { }

@RestController
class Sample {
    @RequestMapping("/check")
    String check() {
        return "Spring Boot is Ready!";
    }
    
    @RequestMapping("/date")
    String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));
        return sdf.format(new Date());
    }
}