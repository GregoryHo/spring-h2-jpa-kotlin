package com.ns.greg.repositories

import com.ns.greg.db.Subscriber
import com.ns.greg.services.SubscriberService
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.context.annotation.Bean
import org.springframework.test.context.junit4.SpringRunner
import java.util.Optional
import javax.annotation.Resource

/**
 * @author gregho
 * @since 2019-06-12
 */
@RunWith(SpringRunner::class)
class SubscriberRepositoryTest {

  @TestConfiguration
  class SubscriberServiceImpTestConfiguration {

    @Bean
    fun subscriberService(): SubscriberService = SubscriberService()
  }

  @Resource
  private lateinit var service: SubscriberService
  @MockBean
  private lateinit var repository: SubscriberRepository

  @Before
  fun setUp() {
    val subscriber = Subscriber("Greg", 35)
    Mockito.`when`(repository.findByName(subscriber.name!!))
        .thenReturn(Optional.of(subscriber))
  }

  @Test
  fun findByName() {
    val name = "Greg"
    val query = service.getSubscriber(name)
    Assertions.assertThat(query.name)
        .isEqualTo(name)
  }
}