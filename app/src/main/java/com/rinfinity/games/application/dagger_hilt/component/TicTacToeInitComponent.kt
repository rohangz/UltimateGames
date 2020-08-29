package com.rinfinity.games.application.dagger_hilt.component
import com.rinfinity.games.application.dagger_hilt.NAMED_MODULE_NAME
import com.rinfinity.games.application.dagger_hilt.module.TicTacToeModule
import com.rinfinity.tic_tac_toe.TicTacToeComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named


@Component(modules = [TicTacToeModule::class])
interface TicTacToeInitComponent: TicTacToeComponent {


    @Component.Builder
    interface Builder {

        @BindsInstance
        fun moduleName(@Named(NAMED_MODULE_NAME) moduleName: String): Builder


        fun build(): TicTacToeComponent
    }
}