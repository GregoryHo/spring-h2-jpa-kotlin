package com.ns.greg.repositories

import com.ns.greg.db.Subscriber
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.Optional

/**
 * @author gregho
 * @since 2019-06-11
 */
@Repository
interface SubscriberRepository : JpaRepository<Subscriber, Long> {

  @Query("SELECT t FROM Subscriber t WHERE t.name = :name")
  fun findByName(@Param("name") name: String): Optional<Subscriber>
}