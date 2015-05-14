import scala.util.Random

class Robot {
  private val real_name = reset()
  def reset() = {
    val rand = new Random()
    val number = rand.nextInt(900) + 100

    s"ab$number"
  }

  val name = real_name

}
