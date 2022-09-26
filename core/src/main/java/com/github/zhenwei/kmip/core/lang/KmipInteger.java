package com.github.zhenwei.kmip.core.lang;

import com.github.zhenwei.kmip.core.IKmipObject;

public class KmipInteger implements IKmipObject {

  @Override
  public int getTag() {
    return 0;
  }

  @Override
  public int getType() {
    return 0;
  }

  @Override
  public int getLength() {
    return 0;
  }

  @Override
  public byte[] getValue() {
    return new byte[0];
  }
}
