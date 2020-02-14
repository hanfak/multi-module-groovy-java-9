package com.hanfak.wiring;

public class Application {
  public static void main(String... args) {
    System.out.println(new WiringClass().someCliClass().handle());
  }
}
