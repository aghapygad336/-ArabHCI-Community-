import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import butterknife.ButterKnife
import butterknife.OnClick
import app.injection.PiFloorApplication
import com.example.pifloor.R
import processing.CalibrationModeActivity
import processing.UploadActivity

class MainActivity : Activity() {

    private val prefName = "intro"
    private val value = "opened"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as PiFloorApplication).component.inject(this)
        ButterKnife.bind(this)
        val sharedPref = getSharedPreferences(prefName, Context.MODE_PRIVATE)
        if (!sharedPref.getBoolean(value, false)) {
            // First time to view
            val editor = sharedPref.edit()
            editor.putBoolean(value, true)
            editor.apply()
            startTutorialActivity()
        }
    }

    @OnClick(R.id.button_main_startGame)
    fun startCalibrationModeActivity() {
        val intent = Intent(this, CalibrationModeActivity::class.java)
        startActivity(intent)
    }

    @OnClick(R.id.button_main_startTutorial)
    fun startTutorialActivity() {
        val intent = Intent(this, IntroActivity::class.java)
        startActivity(intent)
    }

    @OnClick(R.id.button_main_upload)
    fun startUpload() {
        val intent = Intent(this, UploadActivity::class.java)
        startActivity(intent)
    }
}

