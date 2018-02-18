package com.example.saurav.code_reg

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_loginpage.*

class loginpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)
        logbtn.setOnClickListener {
            var username=nametxt.text.toString()
            var password=passtxt.text.toString()
            if (username.equals("saurav")&&password.equals("unisaurav")){
            val nxtto =Intent(this,WelcomePage::class.java)
            val bundle=Bundle()
                bundle.putString("user",username)
                nxtto.putExtras(bundle)
                nametxt.text=null
                passtxt.text=null
                Toast.makeText(this,"Make Sure You Have Active Internet Connection",Toast.LENGTH_LONG).show()
                startActivity(nxtto)
            }
            else if(username.equals("pratik")&&password.equals("kira")){
                val nxtto =Intent(this,WelcomePage::class.java)
                val bundle=Bundle()
                bundle.putString("user",username)
                nxtto.putExtras(bundle)
                nametxt.text=null
                passtxt.text=null
                Toast.makeText(this,"Make Sure You Have Active Internet Connection",Toast.LENGTH_LONG).show()
                startActivity(nxtto)
            }
            else if(username.equals("priya")&&password.equals("priya12345@")){
                val nxtto =Intent(this,WelcomePage::class.java)
                val bundle=Bundle()
                bundle.putString("user",username)
                nxtto.putExtras(bundle)
                nametxt.text=null
                passtxt.text=null
                Toast.makeText(this,"Make Sure You Have Active Internet Connection",Toast.LENGTH_LONG).show()
                startActivity(nxtto)
            }
            else if(username.equals("som")&&password.equals("jumbotron")){
                val nxtto =Intent(this,WelcomePage::class.java)
                val bundle=Bundle()
                bundle.putString("user",username)
                nxtto.putExtras(bundle)
                nametxt.text=null
                passtxt.text=null
                Toast.makeText(this,"Make Sure You Have Active Internet Connection",Toast.LENGTH_LONG).show()
                startActivity(nxtto)
            }
            else if (username.equals("harsh")&&password.equals("2311434423")){
                val nxtto =Intent(this,WelcomePage::class.java)
                val bundle=Bundle()
                bundle.putString("user",username)
                nxtto.putExtras(bundle)
                nametxt.text=null
                passtxt.text=null
                Toast.makeText(this,"Make Sure You Have Active Internet Connection",Toast.LENGTH_LONG).show()
                startActivity(nxtto)
            }
            else if (username.equals("rashmi")&&password.equals("rashmi123")){
                val nxtto =Intent(this,WelcomePage::class.java)
                val bundle=Bundle()
                bundle.putString("user",username)
                nxtto.putExtras(bundle)
                nametxt.text=null
                passtxt.text=null
                Toast.makeText(this,"Make Sure You Have Active Internet Connection",Toast.LENGTH_LONG).show()
                startActivity(nxtto)
            }
            else if(username.equals("sam")&&password.equals("logsamin")){
                val nxtto =Intent(this,WelcomePage::class.java)
                val bundle=Bundle()
                bundle.putString("user",username)
                nxtto.putExtras(bundle)
                nametxt.text=null
                passtxt.text=null
                Toast.makeText(this,"Make Sure You Have Active Internet Connection",Toast.LENGTH_LONG).show()
                startActivity(nxtto)
            }
            else if(username.equals("mohit")&&password.equals("mohit@2196")){
                val nxtto =Intent(this,WelcomePage::class.java)
                val bundle=Bundle()
                bundle.putString("user",username)
                nxtto.putExtras(bundle)
                nametxt.text=null
                passtxt.text=null
                Toast.makeText(this,"Make Sure You Have Active Internet Connection",Toast.LENGTH_LONG).show()
                startActivity(nxtto)
            }
            else if(username.equals("shruti21")&&password.equals("212121")){
                val nxtto =Intent(this,WelcomePage::class.java)
                val bundle=Bundle()
                bundle.putString("user",username)
                nxtto.putExtras(bundle)
                nametxt.text=null
                passtxt.text=null
                Toast.makeText(this,"Make Sure You Have Active Internet Connection",Toast.LENGTH_LONG).show()
                startActivity(nxtto)
            }
            else if(username.equals("akanksha")&&password.equals("watdfuck")){
                val nxtto =Intent(this,WelcomePage::class.java)
                val bundle=Bundle()
                bundle.putString("user",username)
                nxtto.putExtras(bundle)
                nametxt.text=null
                passtxt.text=null
                Toast.makeText(this,"Make Sure You Have Active Internet Connection",Toast.LENGTH_LONG).show()
                startActivity(nxtto)
            }
            else{
                Toast.makeText(this,"LOL $username YOU NOOB",Toast.LENGTH_LONG).show()
                nametxt.text=null
                passtxt.text=null
            }


        }
    }
}
