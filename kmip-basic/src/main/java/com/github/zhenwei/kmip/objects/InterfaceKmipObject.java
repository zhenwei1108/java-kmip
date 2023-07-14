package com.github.zhenwei.kmip.objects;

import com.github.zhenwei.kmip.enums.TagEnum;
import com.github.zhenwei.kmip.enums.TypeEnum;

/**
 * @author: zhangzhenwei
 * @description: com.github.zhenwei.kmip.objects 顶级基类
 * @date: 2023/7/9  11:18
 * @since: 1.0.0
 */
public interface InterfaceKmipObject<T> {

  /**
   * @author zhangzhenwei
   * @description getTag 获取标签
   * @param []
   * @return com.github.zhenwei.kmip.enums.TagEnum
   * @date 2023/7/14  16:20
   * @since: 1.0.0
   */
  TagEnum getTag();

  /**
   * @author zhangzhenwei
   * @description getType 获取标识
   * @param []
   * @return com.github.zhenwei.kmip.enums.TypeEnum
   * @date 2023/7/14  16:20
   * @since: 1.0.0
   */
  TypeEnum getType();

  /**
   * @author zhangzhenwei
   * @description getLength 获取值的 字节长度
   * @param []
   * @return int
   * @date 2023/7/14  16:21
   * @since: 1.0.0
   */
  int getLength();

  /**
   * @author zhangzhenwei
   * @description getValue 获取值
   * @param []
   * @return T
   * @date 2023/7/14  16:21
   * @since: 1.0.0
   */
  T getValue();

}
