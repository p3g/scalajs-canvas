package org.p3g.canvas.examples.physics;

import org.p3g.canvas.examples.objects.{Ball, Body};

class Gravity(accleration:Int) {
 def apply(bodies:Seq[Body],height:Int):Seq[Body] = {
    bodies.map( (body:Body) => {
      var newY:Int = body.getPosition.y;
      if(body.getPosition.y < height )
        newY = body.getPosition.y + accleration;
      new Ball(body.getSize,new Position(body.getPosition.x,newY), body.getVelocity );
    });
  }
}
