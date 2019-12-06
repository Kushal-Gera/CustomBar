package kushal.application.customsnackbar

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kushal.application.custombar.CustomBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        CustomBar(tv, "Removed Successfully", Snackbar.LENGTH_INDEFINITE).run {

            this.setBackground(R.drawable.round_corners)

            this.setMargins(15, 0, 15, 30)

            this.setTextSize(16f)

            this.actionText("Undo", View.OnClickListener {}, false, 16f)

            this.actionTextColor(R.color.colorAccent)

            this.show()
        }



    }
}
