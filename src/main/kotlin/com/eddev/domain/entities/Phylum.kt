package com.eddev.domain.entities

import io.quarkus.hibernate.orm.panache.PanacheEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "phylum")
class Phylum(
    val dsPhylum: String
): PanacheEntity()