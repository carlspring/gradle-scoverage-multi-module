package org.carlspring.scala

import org.junit.{Assert, Test}

class ATest {
  @Test def testIsGreaterThanFive() {
    def a = new A()
    Assert.assertTrue(a.isGreaterThanFive(6))
    Assert.assertFalse(a.isGreaterThanFive(3))
  }
}
