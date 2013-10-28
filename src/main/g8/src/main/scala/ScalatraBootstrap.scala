import javax.servlet.ServletContext
import org.scalatra.LifeCycle
import $package$._

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext) {
    context.mount(new $servlet_name$, "/*")
  }

}
