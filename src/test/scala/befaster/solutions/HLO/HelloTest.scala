package befaster.solutions.HLO

import befaster.solutions.HLO.Hello

class HelloTest extends FlatSpec with Matchers {

  it should "print hello world" in {
    Hello.hello("") shouldBe "Hello, World"
  }
}
