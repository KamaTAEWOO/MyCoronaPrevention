package com.example.coronaprevention

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var  etPassword: EditText
    val Kemail : String = "zszs1010@naver.com"
    val Kpassword : String = "qwer1234"
    val MIN_PASSWORD_LENGTH = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        viewInitializations()
    }
    fun viewInitializations() {
        etEmail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_password)

        // To show back button in actionbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Checking if the input in form is valid
    fun validateInput(): Boolean {
        if (etEmail.text.toString() != Kemail) {
            etEmail.error = "이메일이 다릅니다."
            return false
        }
        if (etPassword.text.toString() != Kpassword) {
            etPassword.error = "패스워드가 다릅니다."
            return false
        }

        // checking the proper email format
        if (!isEmailValid(etEmail.text.toString())) {
            etEmail.error = "아니 ㅡㅡ 이메일..."
            return false
        }

        // checking minimum password Length
        if (etPassword.text.length < MIN_PASSWORD_LENGTH) {
            etPassword.error = "Password Length must be more than " + MIN_PASSWORD_LENGTH + "characters"
            return false
        }

        return true
    }

    fun isEmailValid(email: String?): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    // Hook Click Event
    fun performSignUp(v: View) {
        if (validateInput()) {

            // Input is valid, here send data to your server
            val email = etEmail!!.text.toString()
            val password = etPassword!!.text.toString()
            Log.d("email",email)
            if(email == Kemail){
                if(password == Kpassword){
                    Toast.makeText(this, "로그인에 성공했습니다.", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, Poll::class.java)
                    startActivity(intent)
                }
            }
        }
    }

    fun goToSignup(v: View) {
        // Open your SignUp Activity if the user wants to signup
        // Visit this article to get SignupActivity code https://handyopinion.com/signup-activity-in-android-studio-kotlin-java/
        val intent = Intent(this, SignupActivity::class.java)
        startActivity(intent)
    }
    //뒤로가기 막기
    override fun onBackPressed() {
        //super.onBackPressed()
        Log.d("back","login")
    }
}
