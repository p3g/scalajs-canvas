package org.p3g.canvas.examples.objects;

import org.p3g.canvas.examples.physics.Velocity;
import org.p3g.canvas.examples.physics.Position;

class Ball(val size:Int, var position:Position, var velocity:Velocity ) extends Body {
  override def getSize: Int = this.size

  override def getPosition: Position = this.position

  override def getVelocity: Velocity = this.velocity
}
