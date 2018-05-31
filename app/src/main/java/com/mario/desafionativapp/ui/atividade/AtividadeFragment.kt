package com.mario.desafionativapp.ui.atividade

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.mario.desafionativapp.R
import kotlinx.android.synthetic.main.atividade_fragment.*
import org.jetbrains.anko.support.v4.toast

class AtividadeFragment : Fragment() {

    companion object {
        fun newInstance() = AtividadeFragment()
    }

    private lateinit var viewModel: AtividadeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        activity?.title = getString(R.string.atividades)

        return inflater.inflate(R.layout.atividade_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AtividadeViewModel::class.java)
        // TODO: Use the ViewModel
        faEnviarAtividade.setOnClickListener { toast("Enviado com sucesso!") }

    }

}
