package site.iplease.aimserver.global.common.data.message

import java.time.LocalDate

data class AssignIpCreateMessage(val id: Long, val expireAt: LocalDate)