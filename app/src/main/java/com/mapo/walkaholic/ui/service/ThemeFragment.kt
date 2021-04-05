package com.mapo.walkaholic.ui.service

import android.view.LayoutInflater
import android.view.ViewGroup
import com.mapo.walkaholic.data.network.Api
import com.mapo.walkaholic.data.repository.ThemeRepository
import com.mapo.walkaholic.databinding.FragmentThemeBinding
import com.mapo.walkaholic.ui.base.BaseFragment

class ThemeFragment : BaseFragment<ThemeViewModel, FragmentThemeBinding, ThemeRepository>() {
    override fun getViewModel() = ThemeViewModel::class.java

    override fun getFragmentBinding(
            inflater: LayoutInflater,
            container: ViewGroup?
    ) = FragmentThemeBinding.inflate(inflater, container, false)

    override fun getFragmentRepository() =
            ThemeRepository(remoteDataSource.buildApi(Api::class.java), userPreferences)
}