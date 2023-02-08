package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}
