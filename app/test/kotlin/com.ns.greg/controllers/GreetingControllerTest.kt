package com.ns.greg.controllers

import org.assertj.core.api.Assertions
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @author gregho
 * @since 2019-06-12
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class GreetingControllerTest {

  @Resource
  private lateinit var controller: GreetingController

  @Test
  @Throws(Exception::class)
  fun contextLoads() {
    Assertions.assertThat(controller).isNotNull
  }
}