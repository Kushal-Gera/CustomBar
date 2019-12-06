package kushal.application.customsnackbar

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
            this.setTextSize(18f)

            //Set custom background Resources from here
            this.setBackground(R.drawable.round_corners)

            //Want to set all margin
            this.setMargins(15)

            //Want to set custom margins, Here is the way to go!
            this.setMargins(15, 0, 15, 30)

            //Add ActionText and ActionListener to CustomBar
            //With optional UpperCase/LowerCase boolean
            //With optional TextSize declaration
            this.actionText("Undo", View.OnClickListener {}, false, 16f)

            //Specify Action Color Here! Default == @accentColor
            this.actionTextColor(R.color.colorAccent)

            //Calls the good old Snackbar.show()
            this.show()
        }



    }
}
