
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Downloads/lab1/conf/routes
// @DATE:Mon Feb 26 13:20:12 GMT 2018


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
