package com.github.wegoo.kmip.exception;

import lombok.AllArgsConstructor;

/**
 * @author: wegoo
 * @description: com.github.wegoo.kmip.exception
 * @date: 2023/7/10  10:39
 * @since: 1.0.0
 */
@AllArgsConstructor
public enum KmipErrorResult implements IException {
  TAG_NOT_SUPPORT(911000, "不支持的Tag类型"),
  ;


  /**
   * @author wegoo
   * @description 错误码
   * @date 2023/7/10  10:44
   * @since: 1.0.0
   */
  private int errorCode;

  /**
   * @author wegoo
   * @description 错误消息
   * @date 2023/7/10  10:45
   * @since: 1.0.0
   */
  private String message;


  @Override
  public String getMessage() {
    return this.message;
  }

  @Override
  public int getErrorCode() {
    return this.errorCode;
  }
}
