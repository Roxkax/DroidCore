package com.sqool.droidcore.injection

import com.sqool.droidcore.core.DialogService
import com.sqool.droidcore.core.IDialogService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class BaseServiceModule {

    @Binds
    abstract fun bindDialogService(dialogService: DialogService): IDialogService
}