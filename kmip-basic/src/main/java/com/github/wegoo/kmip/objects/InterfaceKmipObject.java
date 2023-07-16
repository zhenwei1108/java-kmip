package com.github.wegoo.kmip.objects;

import com.github.wegoo.kmip.enums.TagEnum;
import com.github.wegoo.kmip.enums.TypeEnum;

/**
 * @author: wegoo
 * @description: com.github.wegoo.kmip.objects 顶级基类
 * @date: 2023/7/9  11:18
 * @since: 1.0.0
 */
public interface InterfaceKmipObject<T> {

  /**
   * @author wegoo
   * @description getTag 获取标签
   * @param []
   * @return com.github.wegoo.kmip.enums.TagEnum
   * @date 2023/7/14  16:20
   * @since: 1.0.0
   */
  TagEnum getTag();

  /**
   * @author wegoo
   * @description getType 获取标识
   * @param []
   * @return com.github.wegoo.kmip.enums.TypeEnum
   * @date 2023/7/14  16:20
   * @since: 1.0.0
   */
  TypeEnum getType();

  /**
   * @author wegoo
   * @description getLength 获取值的 字节长度
   * @param []
   * @return int
   * @date 2023/7/14  16:21
   * @since: 1.0.0
   */
  int getLength();

  /**
   * @author wegoo
   * @description getValue 获取值
   * @param []
   * @return T
   * @date 2023/7/14  16:21
   * @since: 1.0.0
   */
  T getValue();

}
