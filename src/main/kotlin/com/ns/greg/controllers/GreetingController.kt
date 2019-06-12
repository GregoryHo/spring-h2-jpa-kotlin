package com.ns.greg.controllers

import com.ns.greg.data.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * @author gregho
 * @since 2019-06-11
 */
@RestController
class GreetingController {

  val counter = AtomicLong()

  @GetMapping("/greeting")
  fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
    Greeting(counter.incrementAndGet(), "Hello, $name")
}