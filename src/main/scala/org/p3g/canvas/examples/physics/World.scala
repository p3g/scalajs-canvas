package org.p3g.canvas.examples.physics;

import org.p3g.canvas.examples.objects.Body;

class World(val height:Int, val width:Int )  {
  val gravity = new Gravity(10);
  def forward(bodies:Seq[Body]) : Seq[Body] = {
    gravity.apply(bodies,height);
  };


}
