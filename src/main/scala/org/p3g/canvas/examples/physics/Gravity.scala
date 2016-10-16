package org.p3g.canvas.examples.physics;

import org.p3g.canvas.examples.objects.{Ball, Body};

class Gravity(accleration:Int) {
 def apply(bodies:Seq[Body],height:Int):Seq[Body] = {
    bodies.map( (body:Body) => {
      var newY:Int = body.getY;

      if(body.getY < height )
        newY = body.getY + accleration;
      new Ball(body.getSize,body.getX, newY );
    });
  }
}
