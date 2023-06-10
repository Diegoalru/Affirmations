package com.darssolutions.affirmations

import android.content.Context
import com.darssolutions.affirmations.adapter.ItemAdapter
import com.darssolutions.affirmations.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    /**
     * This is a mock context that can be used for testing.
     */
    private val context = mock(Context::class.java)

    /**
     * This test checks that the adapter returns the correct number of items.
     */
    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}
