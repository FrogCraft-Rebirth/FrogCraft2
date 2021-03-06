package info.tritusk.laboratoriumchemiae.library.network

import java.io.DataInputStream
import java.io.DataOutputStream

interface NetworkCapable {
    fun writePacketData(output: DataOutputStream)

	fun readPacketData(input: DataInputStream)
}