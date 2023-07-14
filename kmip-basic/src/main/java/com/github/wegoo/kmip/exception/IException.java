package com.github.wegoo.kmip.exception;

/**
 * @author: wegoo
 * @description: IException exception param
 * @date: 2023/7/6  21:57
 * @since: 1.0.0
 */
public interface IException {

  int system_error_code = 911999;

  String getMessage();

  int getErrorCode();


}
