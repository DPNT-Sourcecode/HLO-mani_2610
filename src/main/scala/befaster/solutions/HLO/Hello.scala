package befaster.solutions.HLO

import befaster.runner.SolutionNotImplementedException

object Hello {
  def hello(friendName: String): String = {
    if (friendName.isEmpty) {
      return "Hello, World!"
    }

    return s"Hello, $friendName!"
  }
}
