package infobip.api.config;

public abstract class Configuration {
    protected String baseUrl;
    protected int connectionTimeout = 10000;
    protected int readTimeout = 10000;
    protected String proxyHost;
    protected int proxyPort = 80;

    abstract public String getAuthorizationHeader();

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }
}
