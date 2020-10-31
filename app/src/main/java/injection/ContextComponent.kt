/*
package app.injection

import dagger.Component
import MainActivity
import webserver.ServerFragment
import processing.CalibrationModeActivity
import processing.GameModeActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [ContextModule::class])
interface ContextComponent {
    fun inject(target: MainActivity)
    fun inject(target: CalibrationModeActivity)
    fun inject(target: GameModeActivity)
    fun inject(target: ServerFragment)
}