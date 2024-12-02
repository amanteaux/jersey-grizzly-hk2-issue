package org.glassfish.jersey.examples.helloworld;

import jakarta.inject.Inject;
import jakarta.ws.rs.container.ContainerRequestContext;
import org.glassfish.hk2.api.Factory;

public class SessionFactory2 implements Factory<Session2> {
    private final ContainerRequestContext context;

    @Inject
    public SessionFactory2(ContainerRequestContext context) {
        this.context = context;
    }

    @Override
    public Session2 provide() {
        return new Session2(context.getHeaderString("Custom-Code"));
    }

    @Override
    public void dispose(Session2 instance) {

    }
}
