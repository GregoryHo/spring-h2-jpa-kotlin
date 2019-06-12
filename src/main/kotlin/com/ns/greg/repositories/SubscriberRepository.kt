package com.ns.greg.repositories

import com.ns.greg.db.Subscriber
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author gregho
 * @since 2019-06-11
 */
@Repository
interface SubscriberRepository: JpaRepository<Subscriber, Long>