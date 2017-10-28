package config.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication eurekaServer = new SpringApplication(ConfigurationApplication.class);
        eurekaServer.addListeners(new ApplicationPidFileWriter("eureka-server.pid"));
        eurekaServer.run();
    }

}
