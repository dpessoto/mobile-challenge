package pessoto.android.mobile.challenge.btg.feature.main

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import pessoto.android.mobile.challenge.btg.R
import pessoto.android.mobile.challenge.btg.feature.currency.view.ConvertCurrencyActivity
import pessoto.android.mobile.challenge.btg.util.view.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Handler().postDelayed({
            startActivity(Intent(this, ConvertCurrencyActivity::class.java))
            finish()
        }, 3000)
    }
}