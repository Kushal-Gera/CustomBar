package kushal.application.customsnackbar

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kushal.application.custombar.CustomBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        CustomBar(tv, "   Removed Successfully", CustomBar.LENGTH_INDEFINITE).run {

            this.setBackground(R.drawable.round_corners)

            this.setMargins(15, 0, 15, 30)

            this.setTextSize(16f)

            this.actionText("Undo", View.OnClickListener {}, false, 16f)

            this.actionTextColor(R.color.colorAccent)

            this.setIcon(resources.getDrawable(R.drawable.android), null, null, null)

            this.show()
        }


    }
}
