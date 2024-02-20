package com.example.orderapp

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var orderMessage = "" //Declare a global order message variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ////Reference the XML
        var donut : ImageView = findViewById(R.id.donut)
        var iceCream : ImageView = findViewById(R.id.ice_cream)
        var froyo : ImageView = findViewById(R.id.froyo)
        var orderButton : ImageView = findViewById(R.id.btnOrder)

        //The checkboxes
        var sprinkleCheck :  CheckBox = findViewById(R.id.sprinkles)
        var oreoCheck : CheckBox = findViewById(R.id.oreos)
        var fruitCheck : CheckBox = findViewById(R.id.btnOrder)

        //When the donutImage is clicked
        donut.setOnClickListener{
            //fetch message from string.xml using getString ( ) method
            orderMessage = getString(R.string.donut_order_message)
            displayToast(orderMessage)
        }

        //when the IceCream Image is clicked
        iceCream.setOnClickListener{
            //fetch message from string.xml using getString ( ) method
            orderMessage = getString(R.string.ice_cream_order_message)
            displayToast(orderMessage)
        }

        //when the froyo image is clicked
        froyo.setOnClickListener{
            //fetch message from string.xml using getString ( ) method
            orderMessage = getString(R.string.froyo_order_message)
            displayToast(orderMessage)
        }

        //Logic for Floating Action Button
        orderButton.setOnClickListener {
            //checking whether the checkboxes have been selected

            if (sprinkleCheck.isChecked){
                //do sth
            }

            if (oreoCheck.isChecked){
                //do sth
            }

            if (fruitCheck.isChecked){
                //do sth
            }

            var intentOrder = Intent (this, OrderActivity:: class.java)
            intentOrder.putExtra("ORDER", orderMessage)
            startActivity(intentOrder)
        }
    }

    //Instead of having many Toast message declaration
    private fun displayToast(message : String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}