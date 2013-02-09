package samples

import org.junit._
import Assert._
import scala.sys.process._

@Test
class AppTest {

    @Test
    def testOK() = 
    {
      var v = Process("/Users/aadebuger/Documents/android-sdk-mac_x86/platform-tools/adb shell \"ls -l \"").!!
      println("v="+v)
    }

//    @Test
//    def testKO() = assertTrue(false)

}


