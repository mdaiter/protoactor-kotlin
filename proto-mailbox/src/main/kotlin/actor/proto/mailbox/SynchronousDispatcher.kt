package actor.proto.mailbox

import kotlinx.coroutines.experimental.CoroutineScope
import kotlinx.coroutines.experimental.runBlocking

class SynchronousDispatcher(override var throughput: Int = 300) : Dispatcher {
    override fun schedule(runner: suspend () -> Unit) = runBlocking { runner() }

}