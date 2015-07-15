import org.specs2.mutable.Specification

class ManageVersionSpec extends Specification {

  "Manage version" should {

    "a test for latest" in {
      ManageVersion.latest(List("0.13.7", "0.9.10", "0.9.11-RC1")) mustEqual ("0.13.7")

      ManageVersion.latest(List("0.13.6", "0.13.7-RC1", "0.13.7-RC2")) mustEqual ("0.13.7-RC2")
    }
  }

}