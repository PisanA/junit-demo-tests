import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class MainTest {
  // Interact with systemInMock to provide scanner input values.
	@Rule
	public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();
  
  // Interact with systemOutRule to read from System.out.prints.
  @Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
  
  // Tests that the method input() returns the correct integer.
  @Test
  public void testInput() {
    systemInMock.provideLines("154");
    int result = Main.input();
    assertEquals("Returns the correct value", 154, result);
  }
  
  // Tests that the method print() correctly prints "JUnit is so cool!".
  @Test
  public void testPrint() {
    systemOutRule.clearLog(); // Clears the log to ensure that the test isn't affected by printing in other tests
    Main.print();
    String log = systemOutRule.getLog().trim(); // Get log and trims any new lines or trailing spaces.
    assertEquals("Prints the correct value.", "JUnit is so cool!", log);
  }
}
