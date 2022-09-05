import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.tpiecora.dockerclient.DockerClient;

import java.util.Properties;

public class DockerClientBuilder {

    public DockerClientBuilder(){
        init();
    }
    private void init(){
        Properties properties = new Properties();
        properties.setProperty("registry.email", "info@baeldung.com");
        properties.setProperty("registry.password", "baeldung");
        properties.setProperty("registry.username", "baaldung");
        properties.setProperty("DOCKER_CERT_PATH", "/home/baeldung/.docker/certs");
        properties.setProperty("DOCKER_CONFIG", "/home/baeldung/.docker/");
        properties.setProperty("DOCKER_TLS_VERIFY", "1");
        properties.setProperty("DOCKER_HOST", "tcp://docker.baeldung.com:2376");

        DefaultDockerClientConfig config
                = DefaultDockerClientConfig.createDefaultConfigBuilder()
                .withProperties(properties).build();

        DockerClient dockerClient = DockerClientBuilder.getInstance(config).build();    }
}


