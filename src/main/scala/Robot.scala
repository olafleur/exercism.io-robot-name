import scala.util.Random

class Robot {
  private val real_name = s"ab$randomizeNumber"
  def reset() = {
    name = s"ab$randomizeNumber"
  }

  def randomizeNumber: Int = {
    val rand = new Random()
    val number = rand.nextInt(900) + 100
    number
  }

  var name = real_name

}
