
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ikebrown/kuenzaa/task/conf/routes
// @DATE:Wed Sep 16 11:30:22 CDT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
