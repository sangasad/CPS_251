package com.ebookfrenzy.tipcalculator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ebookfrenzy.tipcalculator.databinding.ActivityMainBinding
import java.text.DecimalFormat

// Programmer: Sadat Sanga
// Class: CPS 251

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
    }
    private val minRate = 0.10f
    private val midRate = 0.15f
    private val maxRate = 0.20f

    fun calculateTotalBill(view: View)
    {

        if(binding.txtBillTotal.text.isNotEmpty())
        {
            val billAmount = binding.txtBillTotal.text.toString().toFloat()

            val minimumTipAmount = (billAmount * minRate) + billAmount
            val midTipAmount = (billAmount * midRate) + billAmount
            val maximumTipAmount = (billAmount * maxRate) + billAmount

            //Formatting outputs to 2 decimal places and display them on the Textview
            binding.txtMinTip.setText("10% = $ " + String.format( "%.2f ", minimumTipAmount))
            binding.txtMidTip.setText("15% = $ " + String.format("%.2f ", midTipAmount))
            binding.txtMaxTip.setText("20% = $ " + String.format("%.2f ",maximumTipAmount))
            //binding.txtBillTotal.text.clear() //Clear the user input
        }
        else
        {
            binding.txtErrorMessage.setText("YOU MUST ENTER A BILL AMOUNT")
            binding.txtMinTip.setText("")
            binding.txtMidTip.setText("")
            binding.txtMaxTip.setText("")
            binding.txtTitle.setText("")
        }
    }
}