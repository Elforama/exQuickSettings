package com.oneguygames.exquicksettings

import android.content.Intent
import android.service.quicksettings.TileService
import android.widget.Toast

/**
 * Created by Jonathan Muller on 10/27/17.
 */
class QuickSettingsService : TileService() {

    override fun onDestroy() {
        super.onDestroy()
        showToast("onDestroy")
    }

    override fun onTileAdded() {
        super.onTileAdded()
        showToast("onTileAdded")
    }

    override fun onTileRemoved() {
        super.onTileRemoved()
        showToast("onTileRemoved")
    }

    override fun onStartListening() {
        super.onStartListening()
        showToast("onStartListening")
    }

    override fun onStopListening() {
        super.onStopListening()
        showToast("onStopListening")
    }

    override fun onClick() {
        super.onClick()
        showToast("onClick")
        startActivityAndCollapse(Intent(this, MainActivity::class.java))
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}