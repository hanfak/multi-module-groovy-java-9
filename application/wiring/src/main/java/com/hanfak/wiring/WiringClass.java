package com.hanfak.wiring;

import com.hanfak.core.usecase.someusecase.SomeUseCase;
import com.hanfak.core.usecase.port.in.SomeUseCaseInterface;
import com.hanfak.core.usecase.port.out.SomeClientInterface;
import com.hanfak.core.usecase.port.out.SomeDatabaseInterface;
import com.hanfak.core.usecase.port.out.SomePropertyInterface;
import com.hanfak.dataproviders.clients.SomeClientClass;
import com.hanfak.dataproviders.database.SomeDatabaseClass;
import com.hanfak.dataproviders.properties.SomePropertiesClass;
import com.hanfak.entrypoints.cli.CommandLineExecutor;
import com.hanfak.entrypoints.cli.SomeCliClass;

// Instantiating all the objects for the program to run
public class WiringClass {

  public SomeCliClass someCliClass() {
    return new SomeCliClass(useCase(), commandLineExecutor());
  }

  private CommandLineExecutor commandLineExecutor() {
    return new CommandLineExecutor();
  }

  private SomeUseCaseInterface useCase() {
    return new SomeUseCase(database(), client(), properties());
  }

  private SomePropertyInterface properties() {
    return new SomePropertiesClass();
  }

  private SomeClientInterface client() {
    return new SomeClientClass();
  }

  private SomeDatabaseInterface database() {
    return new SomeDatabaseClass();
  }
}
