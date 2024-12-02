package org.glassfish.jersey.examples.helloworld;

import jakarta.inject.Inject;
import jakarta.ws.rs.container.ContainerRequestContext;
import org.glassfish.hk2.api.Factory;

public class SessionFactory implements Factory<Session> {
    private final ContainerRequestContext context;

    @Inject
    public SessionFactory(ContainerRequestContext context) {
        this.context = context;
    }

    @Override
    public Session provide() {
        return new Session(context.getHeaderString("Custom-Code"));
    }

    @Override
    public void dispose(Session instance) {

    }
}
