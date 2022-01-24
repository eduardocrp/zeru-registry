package com.eddev.domain.entities

import io.quarkus.hibernate.orm.panache.PanacheEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "specie_order")
class SpecieOrder(val dsSpecieOrder: String) : PanacheEntity()