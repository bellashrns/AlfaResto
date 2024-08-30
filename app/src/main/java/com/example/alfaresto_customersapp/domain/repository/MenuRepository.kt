package com.example.alfaresto_customersapp.domain.repository

import com.example.alfaresto_customersapp.domain.model.Menu
import kotlinx.coroutines.flow.StateFlow

interface MenuRepository {
    suspend fun getMenus(): StateFlow<List<Menu>>
}