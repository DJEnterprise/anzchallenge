package au.com.anz.anzchallenge.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	private static final String template = "Hello, Welcome to ANZChallenge App";
	private final AtomicLong counter = new AtomicLong();
	private final String version = "1.0.0";
	//@Value("${version}")
	private final String build_sha = "asdf34234";
	private final String description = "pre-interview technical test-checking docker image version";


	@GetMapping("/welcome")
	public Welcome welcome() {
		return new Welcome(counter.incrementAndGet(), template);
	}
    
	@GetMapping("/version")
	public Version version() {
		return new Version(version, build_sha, description);
	}


}