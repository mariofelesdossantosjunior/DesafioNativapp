package com.mario.desafionativapp.ui.organizacao

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.mario.desafionativapp.R
import kotlinx.android.synthetic.main.organizacao_fragment.*
import org.jetbrains.anko.support.v4.toast

class OrganizacaoFragment : Fragment() {

    companion object {
        fun newInstance() = OrganizacaoFragment()
    }

    private lateinit var viewModel: OrganizacaoViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.organizacao_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(OrganizacaoViewModel::class.java)
        // TODO: Use the ViewModel
        faEnviarOrganizacao.setOnClickListener { toast("Enviado com sucesso!") }

    }

}
