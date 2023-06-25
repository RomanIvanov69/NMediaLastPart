package ru.netology.nmedia.ui;

import com.google.android.gms.common.GoogleApiAvailability;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@InstallIn(SingletonComponent::class)
@Module
class GoogleApiAvailabilityModule {
    @Singleton
    @Provides
    fun provideGoogleApiAvailability():GoogleApiAvailability =GoogleApiAvailability.getInstance()
}
