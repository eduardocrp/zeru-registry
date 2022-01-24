package com.eddev.application.controller

import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/registries")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
class RegistryController {

    @GET
    @Path("/phylums")
    fun getPhylum() = "Hello RESTEasy"
}