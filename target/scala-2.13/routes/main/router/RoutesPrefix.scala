// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Abhi/Documents/Play/helloWorld/conf/routes
// @DATE:Thu Sep 03 22:41:15 PDT 2020


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
