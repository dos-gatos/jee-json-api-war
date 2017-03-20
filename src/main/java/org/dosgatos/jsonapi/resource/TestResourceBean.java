package org.dosgatos.jsonapi.resource;

import java.time.LocalDateTime;

import javax.ws.rs.BeanParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.dosgatos.jsonapi.queryparam.bullpen.QueryParams;

public class TestResourceBean implements TestResource {

    @Override
    public Response fetchTime() {
        return Response.ok(LocalDateTime.now()).build();
    }

    @Override
    public Response echoRawQueryParams(UriInfo uriInfo) {
        return Response.ok(uriInfo.getQueryParameters()).build();
    }

    @Override
    public Response echoQueryParams(@BeanParam QueryParams model) {
        return Response.ok(model).build();
    }
}
