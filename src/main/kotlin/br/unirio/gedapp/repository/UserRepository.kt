package br.unirio.gedapp.repository

import br.unirio.gedapp.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface UserRepository : JpaRepository<User, Long> {

    fun findByEmail(email: String): Optional<User>

    fun findByDepartmentsId(id: Long): List<User>

    @Query("SELECT u FROM User u INNER JOIN u.userPermission up")
    fun findAllWithCurrentDepartmentPermission(): List<User>
}