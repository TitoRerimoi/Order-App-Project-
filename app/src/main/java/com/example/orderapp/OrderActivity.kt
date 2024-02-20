package com.example.orderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        //Initializing object references for XML elements
        var orderTextView: TextView = findViewById(R.id.order_textview)
        var fullName: TextView = findViewById(R.id.full_name)
        var address: TextView = findViewById(R.id.address)
        var phoneNumber: TextView = findViewById(R.id.phone_number)
        var orderDetails: TextView = findViewById(R.id.order_description)

        ///The RadioButtons
        var sameDayChecked: RadioButton = findViewById(R.id.sameday)
        var nextDayChecked: RadioButton = findViewById(R.id.nextday)
        var selfPickCheck: RadioButton = findViewById(R.id.pickup)

        //The Order Button
        var orderButton: Button = findViewById(R.id.submitOrder)

        //Retrieve the order given from previous Activity
        var orderedItem = intent.getStringExtra("ORDER")
        orderTextView.text = orderedItem //show the ordered item from Order Activity

        orderButton.setOnClickListener {
            if (sameDayChecked.isChecked) {

            } else if (nextDayChecked.isChecked) {

            } else if (selfPickCheck.isChecked) {

            }

            var intentReceiptActivity = Intent(this, ReceiptActivity::class.java)
            startActivity(intentReceiptActivity)
        }
    }
}
