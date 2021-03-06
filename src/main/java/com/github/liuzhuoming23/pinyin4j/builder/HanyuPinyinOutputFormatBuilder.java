package com.github.liuzhuoming23.pinyin4j.builder;

import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.multipinyin.MultiPinyinConfig;

/**
 * hanyu pinyin output format builder
 *
 * @author liuzhuoming
 * @version 0.0.1
 */
public class HanyuPinyinOutputFormatBuilder {

  public HanyuPinyinOutputFormatBuilder() {
  }

  public HanyuPinyinOutputFormatBuilder(String multiPinyinPath) {
    //set multi pinyin mounts path
    this.multiPinyinPath = multiPinyinPath;
  }

  /**
   * multi pinyin mounts path
   */
  private String multiPinyinPath = null;

  /**
   * This classes define how the Hanyu Pinyin should be outputted.
   */
  private HanyuPinyinOutputFormat hanyuPinyinOutputFormat = new HanyuPinyinOutputFormat();

  /**
   * Define the output format of character 'ü'
   *
   * @param vCharType vCharType
   */
  public HanyuPinyinOutputFormatBuilder vCharType(HanyuPinyinVCharType vCharType) {
    hanyuPinyinOutputFormat.setVCharType(vCharType);
    return this;
  }

  /**
   * Define the output case of Hanyu Pinyin string
   *
   * @param caseType caseType
   */
  public HanyuPinyinOutputFormatBuilder caseType(HanyuPinyinCaseType caseType) {
    hanyuPinyinOutputFormat.setCaseType(caseType);
    return this;
  }

  /**
   * Define the output format of Hanyu Pinyin tones
   *
   * @param toneType toneType
   */
  public HanyuPinyinOutputFormatBuilder toneType(HanyuPinyinToneType toneType) {
    hanyuPinyinOutputFormat.setToneType(toneType);
    return this;
  }

  /**
   * build HanyuPinyinOutputFormat
   *
   * @return this.hanyuPinyinOutputFormat
   * @see HanyuPinyinOutputFormatBuilder#hanyuPinyinOutputFormat
   */
  public HanyuPinyinOutputFormat build() {
    MultiPinyinConfig.multiPinyinPath = this.multiPinyinPath;
    return this.hanyuPinyinOutputFormat;
  }
}
