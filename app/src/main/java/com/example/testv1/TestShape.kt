package com.example.testv1

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.testv1.databinding.TestShapeBinding

class TestShape(context: Context, attributeSet: AttributeSet) : LinearLayout(context, attributeSet) {
    private lateinit var binding: TestShapeBinding

    init {
        binding = TestShapeBinding.inflate(LayoutInflater.from(context), this, true)

        val attrs = context.obtainStyledAttributes(attributeSet, R.styleable.TestShape)

        val state = attrs.getTextArray(R.styleable.TestShape_state, )


        //binding.cardView.state =

            // binding.cardView.state = attrs.getString(R.styleable.TestShape_state)

        //binding.textView.text = attrs.getString(R.styleable.CustomCard_text)
        //binding.checkBox.isChecked = attrs.getBoolean(R.styleable.CustomCard_checked, false)


        attrs.recycle()

        //binding.textView.setOnClickListener {
            //binding.textView.text = check()
        }

    }

    //private fun check(): String = binding.checkBox.isChecked.toString()