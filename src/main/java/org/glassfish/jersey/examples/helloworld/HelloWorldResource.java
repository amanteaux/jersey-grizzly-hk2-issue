/*
 * Copyright (c) 2010, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.glassfish.jersey.examples.helloworld;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;

/**
 *
 * @author Jakub Podlesak
 */
@Path("helloworld")
public class HelloWorldResource {
    @GET
    @Path("/sample-response")
    public String sampleResponse(@Context Session session) {
        return "hello " + session.code();
    }

    @POST
    @Path("/no-answer")
    public void noAnswer(@Context Session session) {
        System.out.println("no answer executed: " + session.code());
    }
}
