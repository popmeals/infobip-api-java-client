package infobip.api.config;

import java.net.Proxy;

public abstract class Configuration {
    protected String baseUrl;
    protected int connectionTimeout = 10000;
    protected int readTimeout = 10000;
    protected Proxy proxy;

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

    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }
}
