package com.example.saurav.code_reg

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lan_options.*

class LanOptions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lan_options)
        val hj = intent.extras
        var kl = hj.get("user").toString()
        userna.text = kl
        csbtn.setOnClickListener{
            val btn=Intent(this,cs::class.java)
            val bundle=Bundle()
            bundle.putString("user",kl)
            btn.putExtras(bundle)
            startActivity(btn)
        }
        fifabtn.setOnClickListener{
            val btn=Intent(this,fifa::class.java)
            val bundle=Bundle()
            bundle.putString("user",kl)
            btn.putExtras(bundle)
            startActivity(btn)
        }
        nfsbtn.setOnClickListener{
            val btn=Intent(this,NFS::class.java)
            val bundle=Bundle()
            bundle.putString("user",kl)
            btn.putExtras(bundle)
            startActivity(btn)
        }
     smbtn.setOnClickListener{
        val btn=Intent(this,SmackDown::class.java)
         val bundle=Bundle()
         bundle.putString("user",kl)
         btn.putExtras(bundle)
           startActivity(btn)
        }

    }
}
