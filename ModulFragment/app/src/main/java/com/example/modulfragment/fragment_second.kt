package com.example.modulfragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.modulfragment.CommunicationViewModel
import com.example.modulfragment.R

class SecondFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.
        of(requireActivity()).
        get(CommunicationViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_second,
            container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.textViewName)
        communicationViewModel!!.name.observe(requireActivity(),
            Observer { s -> txtName!!.text = s })
    }
    companion object {
        fun newInstance(): SecondFragment {
            return SecondFragment()
        }
    }
}