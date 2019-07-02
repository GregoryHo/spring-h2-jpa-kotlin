package com.ns.greg.db

import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

/**
 * @author gregho
 * @since 2019-06-11
 */
@Entity
@Table(name = "SUBSCRIBER")
class Subscriber constructor(
  @Column(name = "NAME")
  var name: String? = null,
  @Column(name = "AGE")
  var age: Int? = null
) {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "ID")
  val id: Long? = null
}