package com.wheremydocs.apigateway;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Primary
@EnableSwagger2
public class SwaggerConfig implements SwaggerResourcesProvider {

  @Override
  public List<SwaggerResource> get() {
    List<SwaggerResource> resources = new ArrayList<>();
    resources.add(swaggerResource("Customer", "/api/customer/v2/api-docs", "2.0"));
    // add more services here or  autodetect from service discovery
    return resources;
  }

  private SwaggerResource swaggerResource(String name, String location, String version) {
    SwaggerResource swaggerResource = new SwaggerResource();
    swaggerResource.setName(name);
    swaggerResource.setUrl(location);
    swaggerResource.setSwaggerVersion(version);
    return swaggerResource;
  }
}
