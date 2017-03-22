
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/Warehouse Login/conf/routes
// @DATE:Wed Mar 22 17:57:54 GMT 2017


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
