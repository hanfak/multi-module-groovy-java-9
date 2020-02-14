package com.hanfak.core.usecase.someusecase;

import com.hanfak.core.domain.SomeDomainClass;
import com.hanfak.core.usecase.port.in.SomeUseCaseInterface;
import com.hanfak.core.usecase.port.out.SomeClientInterface;
import com.hanfak.core.usecase.port.out.SomeDatabaseInterface;
import com.hanfak.core.usecase.port.out.SomePropertyInterface;

public class SomeUseCase implements SomeUseCaseInterface {
  private final SomeDatabaseInterface databaseInterface;
  private final SomeClientInterface clientInterface;
  private final SomePropertyInterface propertyInterface;

  public SomeUseCase(SomeDatabaseInterface databaseInterface, SomeClientInterface clientInterface, SomePropertyInterface propertyInterface) {
    this.databaseInterface = databaseInterface;
    this.clientInterface = clientInterface;
    this.propertyInterface = propertyInterface;
  }

  @Override
  public String execute(String greeting, String name) {
    // Can use any of the dependencies to get data, or do some calls to third party
    return greeting + ", your new id is: " + new SomeDomainClass(name).id();
  }
}
