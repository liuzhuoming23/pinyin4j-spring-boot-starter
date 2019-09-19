package com.github.liuzhuoming23.pinyin4j.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * multi pinyin properties
 *
 * @author liuzhuoming
 * @version 0.0.1
 */
@Data
@ConfigurationProperties(prefix = "pinyin4j.multi")
public class MultiPinyinProperties {

  /**
   * enable multi pinyin mounted
   */
  private Boolean enabled = false;
  /**
   * multi pinyin mounts path
   */
  private String path = null;
}
