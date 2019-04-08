import scala.util.Properties.envOrNone

object Version {

  val baseVersion = "0.0.1"

  def apply(): String =
    envOrNone("PRE_RELEASE").fold(baseVersion)(preRelease => s"$baseVersion-$preRelease")
}
