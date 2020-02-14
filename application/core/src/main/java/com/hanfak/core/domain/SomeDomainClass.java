package com.hanfak.core.domain;

import java.util.UUID;

public class SomeDomainClass {
  private final String name;
  private final UUID id;

  public SomeDomainClass(String name) {
    this(UUID.randomUUID(), name);
  }

  public SomeDomainClass(UUID id, String name) {
    this.id = id;
    this.name = name;
  }

  public String id() {
    return id.toString();
  }
}
