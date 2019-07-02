package com.ns.greg.controllers

import com.ns.greg.db.Subscriber
import com.ns.greg.services.SubscriberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

/**
 * @author gregho
 * @since 2019-06-12
 */
@RestController
class SubscriberController {

  @Resource
  private lateinit var subscriberService: SubscriberService

  @GetMapping("/subscribers")
  fun getSubscribers(): List<Subscriber> {
    return subscriberService.getSubscribers()
  }

  @PostMapping("/addSubscriber")
  fun addSubscriber(@RequestBody subscriber: Subscriber) {
    subscriberService.addSubscriber(subscriber)
  }

  @GetMapping("/subscriber")
  fun getSubscriber(@RequestParam(value = "id") id: Long): Subscriber {
    return subscriberService.getSubscriber(id)
  }
}