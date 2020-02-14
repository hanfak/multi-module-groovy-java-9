package com.hanfak.entrypoints.webserver;

import com.hanfak.core.usecase.port.in.SomeUseCaseInterface;

public class SomeWebServerClass {
  private final SomeUseCaseInterface useCaseInterface;

  public SomeWebServerClass(SomeUseCaseInterface useCaseInterface) {
    this.useCaseInterface = useCaseInterface;
  }

  // This would use servlets or spring controller here
  public String handle(String request) {
    return useCaseInterface.execute("Hello", request);
  }
}
