package com.jlalande;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/")
public class RootResource {

  @GET
  @Produces("text/html")
  public String getRedirectPage() {
    return "<html><head></head><body><h1>webapp-demo</h1><p>Please see <a href='/hello'>the following resource</a>.</p></body></html>";
  }
}
