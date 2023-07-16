package com.github.wegoo.kmip.objects;

import com.github.wegoo.bytes.tools.BytesTools;
import com.github.wegoo.kmip.enums.TagEnum;

/**
 * @author: wegoo
 * @description: com.github.wegoo.kmip.objects
 * @date: 2023/7/10  09:49
 * @since: 1.0.0
 */
public abstract class AbstractKmipObject<T> implements InterfaceKmipObject<T> {

  TagEnum tagEnum;

  /**
   * @author wegoo
   * @description getBytesValue 获取值(字节) 
   * @param []
   * @return byte[]
   * @date 2023/7/16  13:24
   * @since: 1.0.0
   */
  abstract byte[] getBytesValue();

  /**
   * @author wegoo
   * @description getEncode 获取具体编码，TTLV 
   * @param []
   * @return byte[]
   * @date 2023/7/14  16:43
   * @since: 1.0.0 
   */
  byte[] getEncode(){
    return BytesTools.merge(getTag().getEncode(), getType().getEncode(),BytesTools.intToBytes(getLength()), getBytesValue());
  }


  @Override
  public TagEnum getTag() {
    return tagEnum;
  }

  /**
   * @author wegoo
   * @description getLength 获取值的字节长度 
   * @param []
   * @return int
   * @date 2023/7/14  16:43
   * @since: 1.0.0 
   */
  @Override
  public int getLength() {
    return getBytesValue().length;
  }

}
