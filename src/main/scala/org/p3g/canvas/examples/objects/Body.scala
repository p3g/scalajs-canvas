package org.p3g.canvas.examples.objects

import org.p3g.canvas.examples.physics.Velocity
import org.p3g.canvas.examples.physics.Position

trait Body {
  def getSize:Int;
  def getPosition:Position;
  def getVelocity:Velocity;
}
