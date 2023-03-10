package com.example.testv1

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.testv1.databinding.TestShapeBinding

class TestShape(context: Context, attributeSet: AttributeSet):LinearLayout(context, attributeSet){

    private lateinit var binding: TestShapeBinding

    init {
        binding = TestShapeBinding.inflate(LayoutInflater.from(context), this, true)

        val attrs = context.obtainStyledAttributes(attributeSet, R.styleable.TestShape)

        //val state = attrs.getTextArray(R.styleable.TestShape_state,)

        //val state = binding.cardView.state.


        //updateState()

        fun updateState(state: String) {
            if (state == "stop") {
                binding.stop.setImageResource(R.drawable.test)
                binding.ready.setImageResource(R.drawable.ready_b)
                binding.go.setImageResource(R.drawable.go_b)
            }
            if (state == "ready") {
                binding.stop.setImageResource(R.drawable.stop_b)
                binding.ready.setImageResource(R.drawable.test1)
                binding.go.setImageResource(R.drawable.go_b)
            }
            if (state == "go") {
                binding.stop.setImageResource(R.drawable.stop_b)
                binding.ready.setImageResource(R.drawable.ready_b)
                binding.go.setImageResource(R.drawable.test2)
            }




            // binding.cardView.state = attrs.getString(R.styleable.TestShape_state)



            attrs.recycle()

        }


    }

}


    //private fun check(): String = binding.checkBox.isChecked.toString()