package com.ebookfrenzy.addnamesavedata.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.ebookfrenzy.addnamesavedata.R
//import com.ebookfrenzy.addnamesavedata.BR.myViewModel
import androidx.lifecycle.ViewModelProvider
import com.ebookfrenzy.addnamesavedata.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentMainBinding
    //private var _binding: FragmentMainBinding? = null
    //private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_main, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.setLifecycleOwner(this)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        //binding.setVariable(myViewModel, viewModel)

        binding.txtOut.text = viewModel.getName()
        var myName: String
        var yourName:String


        binding.btnAdd.setOnClickListener{

            if (binding.txtInput.text.isNotEmpty()) {
                viewModel.setName(binding.txtInput.text.toString())
                 myName = viewModel.getName()
                binding.txtInput.text.clear()

                viewModel.setName(binding.txtInput.text.toString())
                yourName = viewModel.getName()
                binding.txtInput.text.clear()
                binding.txtOut.append(myName + "\n" + yourName)
                //binding.txtOut.text = myName

                binding.txtInput.text.clear()
            }
            else
            {
                binding.txtOut.text = ("Please enter a name")

            }

        }
    }

}