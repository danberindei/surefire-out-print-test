package org.example;

import org.junit.runner.notification.RunListener;

public class JUnitTestListener extends RunListener {
   public JUnitTestListener() {
      System.out.printf("a%2sb\n", "1");
   }
}
