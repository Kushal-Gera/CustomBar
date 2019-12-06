package kushal.application.custombar

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar


@Suppress("DEPRECATION")
class CustomBar(private val view: View, text: String, length: Int) {

    private val bar = Snackbar.make(view, text, length)

    private val barView = bar.view
    private val barActionTV = bar.view.findViewById(R.id.snackbar_action) as TextView
    private val params = bar.view.layoutParams as FrameLayout.LayoutParams
    val barTextTV = bar.view.findViewById(R.id.snackbar_text) as TextView

    /**
     * Set any resource file as the background,
     * be it with custom radius, color, gradient or vector!
     */
    fun setBackground(drawableInt: Int) {
        barView.setBackgroundResource(drawableInt)
    }

    /**
     * set any drawable file as the background,
     */
    fun setBackgroundDrawable(drawable: Drawable) {
        barView.background = drawable
    }

    /**
     * Choose color resource as a background for the SnackBar
     */
    fun setColorResource(color: Int) {
        barView.setBackgroundColor(view.resources.getColor(color))
    }

    /**
     * Margin is the highlight of the CustomBar
     * set All Margins with a single input
     * Or Explicitly declare
     * All different margins left, top, right, bottom.
     */
    fun setMargins(
        margin: Int,
        top: Int = margin,
        right: Int = margin,
        bottom: Int = margin
    ) {
        params.setMargins(
            params.leftMargin + margin,
            params.topMargin + top,
            params.rightMargin + right,
            params.bottomMargin + bottom
        )
    }

    /**
     * Custombar.show()
     */
    fun show() {
        bar.show()
    }

    /**
     * set custom Text Size for the CustomBar Text
     */
    fun setTextSize(size: Float) {
        barTextTV.textSize = size
    }

    fun setTextColor(colorResource: Int) {
        barTextTV.setTextColor(view.resources.getColor(colorResource))
    }

    /**
     * specify action text, Listener, and Case(upper/lower)
     * And off-course the Custom Text Size
     * for your CustomBar
     */
    fun actionText(
        text: String,
        listener: View.OnClickListener,
        toUpper: Boolean = false,
        textSize: Float = 15f
    ) {
        bar.setAction(text, listener)
        barActionTV.isAllCaps = toUpper
        barActionTV.textSize = textSize
    }

    /**
     *Specify custom Color explicitly. (Defaults == @accentColor)
     */
    fun actionTextColor(color: Int) {
        bar.setActionTextColor(view.resources.getColor(color))
    }


}