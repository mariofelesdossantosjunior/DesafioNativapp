package com.mario.desafionativapp.ui.main

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.mario.desafionativapp.R
import com.mario.desafionativapp.ui.atividade.AtividadeFragment
import com.mario.desafionativapp.ui.home.HomeFragment
import com.mario.desafionativapp.ui.negocio.NegocioFragment
import com.mario.desafionativapp.ui.organizacao.OrganizacaoFragment
import com.mario.desafionativapp.ui.pessoa.PessoaFragment
import com.mario.desafionativapp.util.replaceFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                replaceFragment(HomeFragment(), R.id.content)
            }
            R.id.nav_pessoa -> {
                replaceFragment(PessoaFragment(), R.id.content)
            }

            R.id.nav_organizacao -> {
                replaceFragment(OrganizacaoFragment(), R.id.content)
            }

            R.id.nav_negocio -> {
                replaceFragment(NegocioFragment(), R.id.content)
            }

            R.id.nav_atividade -> {
                replaceFragment(AtividadeFragment(), R.id.content)
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
