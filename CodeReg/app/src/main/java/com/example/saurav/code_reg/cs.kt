package com.example.saurav.code_reg

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase


import kotlinx.android.synthetic.main.activity_cs.*

class cs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cs)
        val hj = intent.extras
        var kl = hj.get("user").toString()
        val us="Username:-$kl"
        userna.text = kl
        btgennew.setOnClickListener {
            val name = btname.text.toString()
            val number = smmob.text.toString()
            val n = number.count()
            var flag = 0;
            if (name.equals("")) {
                Toast.makeText(this, "You Should Enter Your Name", Toast.LENGTH_LONG).show()
                flag = 1
            }
            if (n != 10) {
                Toast.makeText(this, "Only 10 Please", Toast.LENGTH_LONG).show()
                flag = 1
            }
            if (flag == 0) {
                val chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
                var code = ""
                for (i in 0..6) {
                    code += chars[Math.floor(Math.random() * chars.length).toInt()]
                }
                code = "CS." + code
                Display.text="Generated ID : $code"
                Display.text = code

            }
        }
        dsndbtn.setOnClickListener {
            if (Display.text!=null) {
                val code = Display.text.toString()
                val no = smmob.text.toString()
                var name=btname.text.toString().toUpperCase()
                var codes = Display.text.toString()
                var mydatabase = FirebaseDatabase.getInstance().getReference("Lan-Gaming/Counter-Strike")
                var codss = mydatabase.push().key
                var generate = generates(codes, no.toString(), name.toString(), kl)

                //val mydatabase = FirebaseDatabase.getInstance().getReference("codes")
                // val codss = mydatabase.push().key
                //val generate = generates(codes, number.toString(), name.toString(), kl)
                mydatabase.child(codss).setValue(generate).addOnCompleteListener {
                    Toast.makeText(this, "Successfully Registered", Toast.LENGTH_LONG).show()
                }

                val Intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$no"))
                Intent.putExtra("sms_body", "$name you are sucessfully registered by ${kl.toUpperCase()} in ${editText.text} & your Generated Id is :-$code")
                startActivity(Intent)
            }
        }
        dtnclear.setOnClickListener {
            Display.text = null
            smmob.text = null
            btname.text=null
            Toast.makeText(this, "Cleared", Toast.LENGTH_LONG).show()
        }
    }
}


