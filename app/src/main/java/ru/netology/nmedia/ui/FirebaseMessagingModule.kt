package ru.netology.nmedia.ui;

import com.google.firebase.messaging.FirebaseMessaging;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@InstallIn(SingletonComponent::class)
@Module
class FirebaseMessagingModule {
    @Singleton
    @Provides
    fun provideFirebaseMessaging():FirebaseMessaging = FirebaseMessaging.getInstance()
}
