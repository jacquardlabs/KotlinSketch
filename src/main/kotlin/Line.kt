import processing.core.PApplet

interface Drawable {
    fun drawOn(canvas: PApplet)

}

data class Point(val x: Int, val y: Int)

data class Line(val start: Point, val end: Point) : Drawable {

    override fun drawOn(canvas: PApplet) {
        canvas.line(
            start.x.toFloat(),
            start.y.toFloat(),
            end.x.toFloat(),
            end.y.toFloat()
        )
    }

}