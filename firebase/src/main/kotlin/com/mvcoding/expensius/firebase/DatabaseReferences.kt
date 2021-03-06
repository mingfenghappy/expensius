/*
 * Copyright (C) 2016 Mantas Varnagiris.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package com.mvcoding.expensius.firebase

import com.google.firebase.database.FirebaseDatabase
import com.mvcoding.expensius.model.UserId

internal fun tagsDatabaseReference(userId: UserId) = firebase().child("tags").child(userId.id)
internal fun archivedTagsDatabaseReference(userId: UserId) = firebase().child("archivedTags").child(userId.id)
internal fun transactionsDatabaseReference(userId: UserId) = firebase().child("transactions").child(userId.id)
internal fun archivedTransactionsDatabaseReference(userId: UserId) = firebase().child("archivedTransactions").child(userId.id)
internal fun userDatabaseReference(userId: UserId) = firebase().child("users").child(userId.id)
private fun firebase() = FirebaseDatabase.getInstance().reference
