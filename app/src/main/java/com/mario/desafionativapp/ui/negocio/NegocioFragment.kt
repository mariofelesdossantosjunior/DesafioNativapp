package com.mario.desafionativapp.ui.negocio

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.mario.desafionativapp.R
import kotlinx.android.synthetic.main.negocio_fragment.*
import org.jetbrains.anko.support.v4.toast

class NegocioFragment : Fragment() {

    companion object {
        fun newInstance() = NegocioFragment()
    }

    private lateinit var viewModel: NegocioViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.negocio_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NegocioViewModel::class.java)
        // TODO: Use the ViewModel
        faEnviarNegocio.setOnClickListener { toast("Enviado com sucesso!") }

    }

}
