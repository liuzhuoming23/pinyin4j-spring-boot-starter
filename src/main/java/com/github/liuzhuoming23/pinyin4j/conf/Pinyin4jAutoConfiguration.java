package com.github.liuzhuoming23.pinyin4j.conf;

import com.github.liuzhuoming23.pinyin4j.builder.HanyuPinyinOutputFormatBuilder;
import com.github.liuzhuoming23.pinyin4j.properties.Pinyin4jProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * pinyin4j auto configuration
 *
 * @author liuzhuoming
 * @version 0.0.1
 * @datetime 2019/9/12 9:59
 */
@Configuration
@EnableConfigurationProperties(Pinyin4jProperties.class)
@ConditionalOnClass(HanyuPinyinOutputFormatBuilder.class)
public class Pinyin4jAutoConfiguration {

  @Autowired
  private Pinyin4jProperties pinyin4jProperties;

  @Bean
  @ConditionalOnMissingBean(HanyuPinyinOutputFormatBuilder.class)
  public HanyuPinyinOutputFormatBuilder hanyuPinyinOutputFormatBuilder() {
    if (pinyin4jProperties.getMulti().getEnabled()) {
      return new HanyuPinyinOutputFormatBuilder(pinyin4jProperties.getMulti().getPath());
    } else {
      return new HanyuPinyinOutputFormatBuilder(null);
    }
  }
}
