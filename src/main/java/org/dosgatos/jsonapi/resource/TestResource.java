package org.dosgatos.jsonapi.resource;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.dosgatos.jsonapi.bullpen.QueryParams;
import org.jboss.resteasy.annotations.providers.jackson.Formatted;
@Path("test")
public interface TestResource {

    @GET
    @Path("time")
    @Produces(MediaType.TEXT_PLAIN)
    Response fetchTime();

    @GET
    @Path("params/raw")
    @Produces(MediaType.APPLICATION_JSON)
    @Formatted
    Response echoRawQueryParams(@Context UriInfo uriInfo);
    
    
    @GET
    @Path("params")
    @Produces("application/vnd.api+json")
    @Formatted
    Response echoQueryParams(@BeanParam QueryParams params);
}
