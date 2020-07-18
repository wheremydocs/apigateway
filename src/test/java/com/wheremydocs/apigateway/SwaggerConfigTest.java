package com.wheremydocs.apigateway;

import org.junit.jupiter.api.Test;
import springfox.documentation.swagger.web.SwaggerResource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

class SwaggerConfigTest {

  @Test
  void get_none_notEmpty() {
    // Given
    SwaggerConfig swaggerConfig = new SwaggerConfig();

    // When
    List<SwaggerResource> swaggerResources = swaggerConfig.get();

    // Then
    assertFalse(swaggerResources.isEmpty());
  }
}
