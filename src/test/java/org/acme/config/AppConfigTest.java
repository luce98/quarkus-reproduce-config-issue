package org.acme.config;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import javax.inject.Inject;

@QuarkusTest
class AppConfigTest {

    @Inject
    AppConfig appConfig;

    @Test
    void testConfiguration() {
        assertThat(appConfig.testUsername(), is("the-right-one"));
    }
}
