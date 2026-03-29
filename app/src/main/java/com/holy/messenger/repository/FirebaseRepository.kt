package com.holy.messenger.repository

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.holy.messenger.model.Message

class FirebaseRepository {
    private val auth = FirebaseAuth.getInstance()
    private val db = FirebaseFirestore.getInstance()

    fun register(email: String, pass: String) =
        auth.createUserWithEmailAndPassword(email, pass)

    fun login(email: String, pass: String) =
        auth.signInWithEmailAndPassword(email, pass)

    fun sendMessage(chatId: String, msg: Message) {
        db.collection("chats").document(chatId)
            .collection("messages").add(msg)
    }
}