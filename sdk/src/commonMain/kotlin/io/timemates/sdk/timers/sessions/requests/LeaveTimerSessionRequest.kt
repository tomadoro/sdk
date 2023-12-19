package io.timemates.sdk.timers.sessions.requests

import io.timemates.sdk.authorization.types.value.AccessHash
import io.timemates.sdk.common.types.AuthorizedTimeMatesRequest
import io.timemates.sdk.common.types.Empty
import io.timemates.sdk.common.types.TimeMatesRequest

public data class LeaveTimerSessionRequest(
    override val accessHash: AccessHash,
) : AuthorizedTimeMatesRequest<Empty>() {
    public companion object Key : TimeMatesRequest.Key<LeaveTimerSessionRequest>

    override val requestKey: Key get() = Key
}