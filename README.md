# pinyin4j-spring-boot-starter
A Spring Boot Starter of https://github.com/belerweb/pinyin4j.

**已上传maven中央仓库，可以通过在pom.xml添加依赖的方式引用**：
```xml
<dependency>
  <groupId>com.github.liuzhuoming23</groupId>
  <artifactId>pinyin4j-spring-boot-starter</artifactId>
  <version>0.0.2</version>
</dependency>
```

## 使用方式

```java
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

  @Autowired
  private HanyuPinyinOutputFormatBuilder hanyuPinyinOutputFormatBuilder;

  @Test
  public void contextLoads() throws BadHanyuPinyinOutputFormatCombination {
    HanyuPinyinOutputFormat hanyuPinyinOutputFormat = hanyuPinyinOutputFormatBuilder
      .toneType(HanyuPinyinToneType.WITHOUT_TONE)
      .vCharType(HanyuPinyinVCharType.WITH_U_UNICODE)
      .build();
    String pinyin = HanyuPinyinHelper
      .toHanYuPinyinString("社会主义核心价值观", hanyuPinyinOutputFormat, "", true);
    System.out.println(pinyin);
  }

}
```
*具体HanyuPinyinOutputFormatBuilder配置的各个参数的意义参照原项目。支持音标输出，首字母输出等。*  
输出结果：
```shell script
shehuizhuyihexinjiazhiguan
```

## 挂载自定义多音字/覆盖错误拼音

将多音字配置放到一个txt文件里面，比如C:\Users\fm\Desktop\duoyinzi.txt，  
多音字格式为`汉字+空格+(+拼音+,+拼音...+)+换行符`，示例：
```text
汉字 (han4,zi4)
英语 (ying1,yu3)
```
然后在application.yml配置挂载路径：
```yaml
pinyin4j:
  multi:
    enabled: true
    path: C:\Users\fm\Desktop\duoyinzi.txt
```
*挂载路径错误则会按照默认输出结果输出。*
