package com.github.zhenwei.kmip.core;

/**
 * @author: zhangzhenwei
 * @description: IKmipObject
 *  KMIP 顶级父类
 *  TTLV = tag  type  length value
 * 参考 GMT-0010
 * @date: 2022/9/26  22:29
 * @since: 1.0
 */
public interface IKmipObject {

  int getTag();

  int getType();

  int getLength();

  byte[] getValue();


}
