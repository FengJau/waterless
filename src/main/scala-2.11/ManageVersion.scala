class ManageVersion

object ManageVersion {

  val regex = Array('.', '-')

  def toWeight(s: String): Int = {
    var weight = 100000000

    s.split(regex).foldLeft(0) { (n, s) =>
      weight = weight / 100
      if (s.startsWith("RC"))
        n + s.last.getNumericValue
      else
        n + s.toInt * weight
    }
  }

  def latest(versions: Seq[String]): String = {
    versions.flatMap { s =>
      Map(toWeight(s) -> s)
    }.max._2
  }

  println(latest(List("0.13.7", "0.9.10", "0.9.11-RC1")))
  println(latest(List("0.13.6", "0.13.7-RC1", "0.13.7-RC2")))

  assert(latest(List("0.13.7", "0.9.10", "0.9.11-RC1")) == "0.13.7")
  assert(latest(List("0.13.6", "0.13.7-RC1", "0.13.7-RC2")) == "0.13.7-RC2")
}
