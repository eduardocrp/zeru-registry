package com.eddev.domain.entities

import io.quarkus.hibernate.orm.panache.PanacheEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "specie_class")
class SpecieClass(val dsSpecieClass: String) : PanacheEntity()