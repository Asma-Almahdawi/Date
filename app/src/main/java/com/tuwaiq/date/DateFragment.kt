package com.tuwaiq.date

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import java.util.*


const val DATE_KEY="DATE"
class DateFragment : Fragment(),DatePickerDialogFragment.DatePickerCallback {

private lateinit var dateView:Button

//private lateinit var date:DateClass

val dateClass=DateClass()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_date, container, false)
       dateView=view.findViewById(R.id.dateVi)

        return view
    }

    override fun onStart() {
        super.onStart()

        dateView.setOnClickListener {

            val args = Bundle()

            args.putSerializable(DATE_KEY,dateClass.dateToday)
            val datePicker = DatePickerDialogFragment()

            datePicker.arguments = args
            datePicker.setTargetFragment(this,0)
            datePicker.show(this.parentFragmentManager,"date picker")

        }
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        date = DateClass()
//    }
    override fun onDateSelected(date:Date) {
      dateClass.dateToday=date
        dateView.text = date.toString()
    }


            }
