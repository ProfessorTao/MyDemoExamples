package individual.professortao.example.model.response;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@Slf4j
public class RespAboutContent {
    @Value("${myapp.name:unset}")
    private String appName;

    @Value("${myapp.version:unset}")
    private String appVersion;

    @Value("${myapp.author:unset}")
    private String appAuthor;

    @Value("${myapp.info:unset}")
    private String appInfo;

    public RespAboutContent() {
        log.debug("Class RespAboutContent has been initialized, but not injected yet, now appName is {}.", appName);
    }

}
