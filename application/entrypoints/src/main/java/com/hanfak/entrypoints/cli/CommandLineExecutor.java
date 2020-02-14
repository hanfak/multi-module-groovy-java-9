package com.hanfak.entrypoints.cli;

import java.io.Console;

public class CommandLineExecutor {
  public String getInput() {
    Console console = System.console();
    if (console == null) {
      System.err.println("No console.");
      System.exit(1);
    }

    console.printf("Welcome to the application. \n\n");
    return console.readLine("Enter your namer: ");
  }
}
