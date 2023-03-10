package com.graial.piazza

import androidx.lifecycle.ViewModel

class TabsViewModel: ViewModel() {
    data class Tab(val id: Int, val url: String)

    val tabs: List<Tab> = createTabs()

    fun tabForUrl(url: String): Tab? {
        return tabs.find { it.url == url }
    }

    fun tabForId(id: Int): Tab? {
        return tabs.find { it.id == id }
    }

    fun indexedTabForId(id: Int): IndexedValue<Tab>? {
        return tabs.withIndex().find { it.value.id == id }
    }

    private fun createTabs(): List<Tab> {
            return listOf(
                Tab(R.id.tab_home, Api.rootUrl),
                Tab(R.id.tab_saved_ads, Api.savedAdsUrl),
                Tab(R.id.tab_message, Api.rootUrl),
                Tab(R.id.tab_my_ads, Api.myAdsUrl),
                Tab(R.id.tab_profile, Api.profileUrl),
            )
    }
}