package controllers

import play.api._
import play.api.mvc._
import javax.sound.sampled.{AudioInputStream, Clip, AudioSystem}
import java.io.File
import services.Lawaai

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }

  def startAlarm = Action {
    Lawaai.start
    Ok("tis gestart");
  }

  def stopAlarm = Action {
    Lawaai.stop
    Ok("tis gestopt");
  }

}