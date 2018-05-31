package com.mario.desafionativapp.ui.pessoa

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mario.desafionativapp.R
import kotlinx.android.synthetic.main.pessoa_fragment.*
import org.jetbrains.anko.support.v4.toast

class PessoaFragment : Fragment() {

    companion object {
        fun newInstance() = PessoaFragment()
    }

    private lateinit var viewModel: PessoaViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.pessoa_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PessoaViewModel::class.java)
        // TODO: Use the ViewModel
        faEnviarPessoa.setOnClickListener { toast("Enviado com sucesso!") }

    }

}
