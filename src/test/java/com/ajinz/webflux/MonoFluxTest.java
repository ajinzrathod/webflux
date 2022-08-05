package com.ajinz.webflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class MonoFluxTest {
  @Test
  public void monoTest() {
    Mono<Object> justString = Mono.just("2")
        .then(Mono.error(new RuntimeException("Exception")))
        .log();
    justString.subscribe(System.out::println);
  }
}
