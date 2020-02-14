package com.hanfak.entrypoints.cli;

import com.hanfak.core.usecase.port.in.SomeUseCaseInterface;

public class SomeCliClass {
  private final SomeUseCaseInterface useCaseInterface;
  private final CommandLineExecutor commandLineExecutor;

  public SomeCliClass(SomeUseCaseInterface useCaseInterface, CommandLineExecutor commandLineExecutor) {
    this.useCaseInterface = useCaseInterface;
    this.commandLineExecutor = commandLineExecutor;
  }

  public String handle() {
    String input = commandLineExecutor.getInput();
    return useCaseInterface.execute("Hello", input);
  }
}
