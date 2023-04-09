package com.example.testv1

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.testv1.databinding.TestShapeBinding

class TestShape(context: Context, attributeSet: AttributeSet):LinearLayout(context, attributeSet){

    private lateinit var binding: TestShapeBinding
    private var state: Int = 0

    init {
        binding = TestShapeBinding.inflate(LayoutInflater.from(context), this, true)

        val attrs = context.obtainStyledAttributes(attributeSet, R.styleable.TestShape)
        state = attrs.getInt(R.styleable.TestShape_state, 0)
        updateState()

        val color = attrs.getColor(R.styleable.TestShape_color, Color.GRAY)
        binding.cardView.setBackgroundColor(color)

        attrs.recycle()

    }

    private fun updateState() {
        when (state) {
            0 -> {
                binding.stop.setImageResource(R.drawable.test)
                binding.ready.setImageResource(R.drawable.ready_b)
                binding.go.setImageResource(R.drawable.go_b)
            }
            1 -> {
                binding.stop.setImageResource(R.drawable.stop_b)
                binding.ready.setImageResource(R.drawable.test1)
                binding.go.setImageResource(R.drawable.go_b)
            }
            2 -> {
                binding.stop.setImageResource(R.drawable.stop_b)
                binding.ready.setImageResource(R.drawable.ready_b)
                binding.go.setImageResource(R.drawable.test2)
            }
        }

    }
}


    //private fun check(): String = binding.checkBox.isChecked.toString()