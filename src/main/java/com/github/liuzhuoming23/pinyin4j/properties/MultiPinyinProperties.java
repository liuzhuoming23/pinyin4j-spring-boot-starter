package com.github.liuzhuoming23.pinyin4j.properties;

import lombok.Data;

/**
 * multi pinyin properties
 *
 * @author liuzhuoming
 * @version 0.0.1
 * @datetime 2019/9/12 10:01
 */
@Data
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
