package com.github.zhenwei.kmip.exception;

public class KmipException extends Exception{

  private String message;

  private int errorCode;

  public KmipException(IException exception) {
    super(exception.getMessage());
    this.message = exception.getMessage();
    this.errorCode = exception.getErrorCode();
  }

  public KmipException(IException exception, String message) {
    super(message);
    this.message = exception.getMessage();
    this.errorCode = exception.getErrorCode();
  }

  public KmipException(IException exception, Throwable cause) {
    super(exception.getMessage(), cause);
    this.message = exception.getMessage();
    this.errorCode = exception.getErrorCode();
  }

}
