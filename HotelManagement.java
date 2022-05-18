package com.nelly;

import io.vertx.core.AbstractVerticle;
 

public class HotelManagement extends AbstractVerticle {

 private final Logger logger =
      LoggerFactory.getLogger(this.getClass().getName());
     public Student s;

    @Override
    public void start() {
      Router r = Router.router(this.vertx);
      r.get("/").handler(this::ping);

      this.vertx.createHtppServer()
        .requestHandler(r)
        .listen(8080);
    }
    private void ping(final RoutingContext rc){
      try{
        s = new Student("nelly", "piu97yh");
        rc.response().end(JsonObject.mapFrom(s).encode());
     } catch (Exception e) {
              logger.error(e.getMessage(), e);
              rc.response().end(e.getMessage());
      }
      
    }

}
