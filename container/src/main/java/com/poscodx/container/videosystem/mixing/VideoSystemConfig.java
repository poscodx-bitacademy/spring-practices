package com.poscodx.container.videosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *  <----- JavaConfig1, JavaConfig2
 *  import
 *  
 *  JavaConfig1 + JavaConfig2
 */
@Configuration
@Import({DVDConfig.class, DVDPlayerConfig.class})
public class VideoSystemConfig {
}
