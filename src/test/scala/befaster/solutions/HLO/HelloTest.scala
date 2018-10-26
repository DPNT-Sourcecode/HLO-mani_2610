package befaster.solutions.HLO

import org.scalatest.{FlatSpec, Matchers}

class HelloTest extends FlatSpec with Matchers {

  it should "print Hello, World!" in {
    Hello.hello("") shouldBe "Hello, World!"
  }

  it should "print Hello, John!" in {
    Hello.hello("John") shouldBe "Hello, John!"
  }
}
