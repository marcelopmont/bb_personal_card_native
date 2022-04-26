package br.com.bb.personalcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.bb.personalcard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        loadPersonalInfo()
    }

    fun loadPersonalInfo() {
        binding?.mainPhoneText?.text = "11 98765-4321"
        binding?.mainEmailText?.text = "teste@gmail.com"
    }
}