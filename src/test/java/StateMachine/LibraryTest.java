/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StateMachine;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

  @Test
  public void testSomeLibraryMethod() {
    Library classUnderTest = new Library();
    assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
  }

  @Test
  public void testFail() {
    throw new RuntimeException("This should fail the Jenkins build");
  }
}
