package org.timemates.sdk.authorization.sessions.types.value

import org.timemates.sdk.common.constructor.Factory
import org.timemates.sdk.common.constructor.factory
import kotlin.jvm.JvmInline

@JvmInline
public value class AuthorizationId private constructor(public val int: Int) {
    public companion object : Factory<AuthorizationId, Int> by factory(::AuthorizationId)
}