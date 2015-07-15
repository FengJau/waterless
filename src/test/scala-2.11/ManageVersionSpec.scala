import org.specs2.mutable.Specification

class ManageVersionSpec extends Specification {

  "Manage version" should {

    "a test for latest" in {
      ManageVersion.latest(List("0.13.7", "0.9.10", "0.9.11-RC1")) must_== ("0.13.7")

    }
  }

}