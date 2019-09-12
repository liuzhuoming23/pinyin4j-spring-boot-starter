package com.github.liuzhuoming23.pinyin4j.helper;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * pinyin helper
 *
 * <p>
 * A special class from PinyinHelper method
 * </p>
 *
 * @author liuzhuoming
 * @version 0.0.1
 * @datetime 2019/9/12 11:07
 * @see PinyinHelper
 */
public class HanyuPinyinHelper {

  /**
   * Get a string which all Chinese characters are replaced by corresponding main (first) Hanyu
   * Pinyin representation.
   * <p>
   * <p>
   * <b>Special Note</b>: If the return contains "none0", that means that
   * Chinese character is in Unicode CJK talbe, however, it has not pronounciation in Chinese. <b>
   * This interface will be removed in next release. </b>
   *
   * @param str A given string contains Chinese characters
   * @param outputFormat Describes the desired format of returned Hanyu Pinyin string
   * @param separate The string is appended after a Chinese character (excluding the last Chinese
   * character at the end of sentence). <b>Note! Separate will not appear after a non-Chinese
   * character</b>
   * @param retain Retain the characters that cannot be converted into pinyin characters
   * @return a String identical to the original one but all recognizable Chinese characters are
   * converted into main (first) Hanyu Pinyin representation
   * @see PinyinHelper#toHanYuPinyinString(String, HanyuPinyinOutputFormat, String, boolean)
   */
  public static String toHanYuPinyinString(String str, HanyuPinyinOutputFormat outputFormat,
    String separate, boolean retain) throws BadHanyuPinyinOutputFormatCombination {
    return PinyinHelper.toHanYuPinyinString(str, outputFormat, separate, retain);
  }
}
