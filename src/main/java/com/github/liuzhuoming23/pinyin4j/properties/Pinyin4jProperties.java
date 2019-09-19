package com.github.liuzhuoming23.pinyin4j.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * pinyin4j properties
 *
 * @author liuzhuoming
 * @version 0.0.1
 */
@Data
@ConfigurationProperties(prefix = "pinyin4j")
public class Pinyin4jProperties {

  /**
   * multi pinyin path
   */
  private MultiPinyinProperties multi = new MultiPinyinProperties();
}

