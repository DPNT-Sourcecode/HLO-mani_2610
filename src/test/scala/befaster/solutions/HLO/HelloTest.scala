package befaster.solutions.HLO

import org.scalatest.{FlatSpec, Matchers}

class HelloTest extends FlatSpec with Matchers {

  it should "print hello world" in {
    Hello.hello("") shouldBe "Hello, World!"
  }
}
