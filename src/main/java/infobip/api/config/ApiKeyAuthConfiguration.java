package infobip.api.config;

public class ApiKeyAuthConfiguration extends Configuration {

    private final String apiKey;

    public ApiKeyAuthConfiguration(String baseUrl, String apiKey, String proxyHost, int proxyPort) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
    }

    public ApiKeyAuthConfiguration(String baseUrl, String apiKey) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
    }

    public ApiKeyAuthConfiguration(String apiKey) {
        this.baseUrl = "https://api.infobip.com";
        this.apiKey = apiKey;
    }

    @Override
    public String getAuthorizationHeader() {
        return "App " + apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }
}
