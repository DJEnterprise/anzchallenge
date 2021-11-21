package au.com.anz.anzchallenge.restservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

	private static final String template = "Hello, Welcome to ANZChallenge App";
	private final AtomicLong counter = new AtomicLong();
	
	@Value("${application.build_sha}")
    private String build_sha;

	@Value("${application.version}")
    private String version;

	@Value("${application.description}")
    private String description;
	

	@GetMapping("/welcome")
	public Welcome welcome() {
		return new Welcome(counter.incrementAndGet(), template);
	}
    
	@GetMapping("/version")
	public Version version() {
		return new Version(version, build_sha, description);
	}


}