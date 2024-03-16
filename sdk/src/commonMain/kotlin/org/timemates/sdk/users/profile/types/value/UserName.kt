package org.timemates.sdk.users.profile.types.value

import org.timemates.sdk.common.constructor.Factory
import org.timemates.sdk.common.constructor.factory
import org.timemates.sdk.common.constructor.rules.ValidationRule
import org.timemates.sdk.common.constructor.rules.lengthRange
import kotlin.jvm.JvmInline

@JvmInline
public value class UserName private constructor(public val string: String) {
    public companion object : Factory<UserName, String> by factory(
        rules = listOf(ValidationRule.lengthRange(3..50)),
        constructor = ::UserName,
    )
}