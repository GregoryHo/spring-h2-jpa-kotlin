package com.ns.greg.services

import com.ns.greg.db.Subscriber
import com.ns.greg.repositories.SubscriberRepository
import org.springframework.stereotype.Service
import javax.annotation.Resource

/**
 * @author gregho
 * @since 2019-06-12
 */
@Service
class SubscriberService {

  @Resource
  private lateinit var subscriberRepository: SubscriberRepository

  fun getSubscriber(id: Long): Subscriber {
    return subscriberRepository.findById(id).get()
  }

  fun getSubscribers(): List<Subscriber> {
    return subscriberRepository.findAll()
  }

  fun addSubscriber(subscriber: Subscriber) {
    subscriberRepository.save(subscriber)
  }
}