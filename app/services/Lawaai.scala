package services

import javax.sound.sampled.{AudioSystem, Clip}
import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: CLEYSSEN
 * Date: 23-8-13
 * Time: 13:38
 * To change this template use File | Settings | File Templates.
 */
object Lawaai {

  def stop = clip.stop
  def start = clip.start

  val clip:Clip = {
    val audio = AudioSystem.getAudioInputStream(new File("public/sounds/sound01.wav"));
    val cl = AudioSystem.getClip
    cl.open(audio)
    cl
  }
}
