import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import app.Fragments.*
import com.github.paolorotolo.appintro.AppIntro



class IntroActivity : AppIntro() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 0)
        }
        addSlide(ZerothIntroFragment())
        addSlide(FirstIntroFragment())
        addSlide(SecondIntroFragment())
        addSlide(ThirdIntroFragment())
        addSlide(FourthIntroFragment())
        addSlide(FifthIntroFragment())
        addSlide(SixthIntroFragment())
        showSkipButton(false)
        setDepthAnimation()
        setSwipeLock(false)
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        finish()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        finish()
    }
}