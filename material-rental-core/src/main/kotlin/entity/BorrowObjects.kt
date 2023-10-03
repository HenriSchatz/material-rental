package entity

class BorrowableItem(
    val id: Long?, val name: String
)

enum class Role { MATERIAL_MANAGER, ADMIN, USER }

class User(
    val id: Long?,
    val firstname: String,
    val surname: String,
    val roles: Set<Role>
)
