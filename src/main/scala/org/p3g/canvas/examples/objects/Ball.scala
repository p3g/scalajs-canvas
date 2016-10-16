package org.p3g.canvas.examples.objects

class Ball(val size:Int,var x:Int, var y:Int ) extends Body {
  override def getSize: Int = this.size

  override def getX: Int = this.x

  override def getY: Int = this.y
}
