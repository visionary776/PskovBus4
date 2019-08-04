package es.esy.pskovbus.pskovbus

data class Stop(
    internal var name: String,
    internal var id: Int,
    internal var siteId: Int,
    internal var geo: DoubleArray,
    internal var routeHere: IntArray
)