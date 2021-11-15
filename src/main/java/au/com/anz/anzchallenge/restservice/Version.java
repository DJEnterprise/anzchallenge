package au.com.anz.anzchallenge.restservice;

public class Version {

	private final String version;
	private final String build_sha;
	private final String description;

	public Version(String version, String build_sha, String description) {
		this.version = version;
		this.build_sha = build_sha;
		this.description = description;
	}

	public String getVersion() {
		return version;
	}

	public String getbuild_sha() {
		return build_sha;
	}

	public String description() {
		return description;
	}


}