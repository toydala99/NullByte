package com.example.nullbytemusicplayer.data.remote

import com.example.nullbytemusicplayer.data.entities.Musica
import com.example.nullbytemusicplayer.other.Constants.SONG_COLLECTION
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class MusicDataBase {

    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)

    suspend fun getAllSongs(): List<Musica>{
        return try {
            songCollection.get().await().toObjects(Musica::class.java)
        }catch (e: Exception){
            emptyList()
        }
    }
}