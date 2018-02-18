package com.example.saurav.code_reg

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome_page.*

class WelcomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)
            val hj = intent.extras
            var kl = hj.get("user").toString()
            userna.text=kl
        brainbtn.setOnClickListener {
            val callbrain=Intent(this,BrainTeaserAct ::class.java)
            val bundle=Bundle()
            bundle.putString("user",kl)
            callbrain.putExtras(bundle)
            startActivity(callbrain)
        }

        lanbtn.setOnClickListener {
            val callbrain=Intent(this,LanOptions ::class.java)
            val bundle=Bundle()
            bundle.putString("user",kl)
            callbrain.putExtras(bundle)
            startActivity(callbrain)
        }
        dbtn.setOnClickListener {
            val callbrain=Intent(this,dbugging ::class.java)
            val bundle=Bundle()
            bundle.putString("user",kl)
            callbrain.putExtras(bundle)
            startActivity(callbrain)
        }

    }
}
