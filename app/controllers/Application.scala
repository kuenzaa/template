package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("merde je suis fort en Scala et j ai roule sur L OR"))
  }

}
