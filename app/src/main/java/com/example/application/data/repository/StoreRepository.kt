package com.example.application.data.repository

import com.example.application.R
import com.example.application.data.model.Store
import com.example.application.data.model.StoreInventory

class StoreRepository {

    fun getStore(): List<Store> {
        return listOf(

            // ================= FOOD STORE =================

            Store(
                id = "F1",
                name = "Beard Papa’s",
                address = "Jl. Slamet Riyadi No.120, Laweyan 3.5 km",
                promo = "Diskon ongkir s.d 5rb",
                rating = 4.8,
                imageRes = R.drawable.dummy,
                openTime = "10:00",
                closeTime = "22:00",
                openDays = "Mon-Sun",
                tags = listOf("Bakery", "Dessert")
            ),

            Store(
                id = "F2",
                name = "Fore Coffee",
                address = "Jl. Kyai Haji Agus Salim 1 km",
                promo = "Gratis es kopi jumbo",
                rating = 4.7,
                imageRes = R.drawable.resto_sate,
                openTime = "07:00",
                closeTime = "23:00",
                openDays = "Daily",
                tags = listOf("Coffee", "Cafe")
            ),

            Store(
                id = "F3",
                name = "Wingstop",
                address = "Jl. Brigjen Slamet Riyadi 1.4 km",
                promo = "Buy 1 Get 1",
                rating = 4.9,
                imageRes = R.drawable.resto_ayamgeprek,
                openTime = "09:00",
                closeTime = "21:00",
                openDays = "Mon-Sat",
                tags = listOf("Chicken", "Fast Food")
            ),

            Store(
                id = "F4",
                name = "J.CO Donuts & Coffee",
                address = "Jl. Kapten Mulyadi, Surakarta 2 km",
                promo = "Promo J.Cronut",
                rating = 4.6,
                imageRes = R.drawable.resto_kopikenangan,
                openTime = "08:00",
                closeTime = "22:00",
                openDays = "Daily",
                tags = listOf("Donuts", "Coffee")
            ),

            Store(
                id = "F5",
                name = "Chatime",
                address = "Solo Grand Mall, Penumping",
                promo = "Buy 2 Get 1 Free",
                rating = 4.4,
                imageRes = R.drawable.dummy,
                openTime = "10:00",
                closeTime = "22:00",
                openDays = "Daily",
                tags = listOf("Milk Tea", "Beverage")
            ),

            // ================= RETAIL STORE =================

            Store(
                id = "R1",
                name = "Gramedia",
                address = "Solo Paragon Mall",
                promo = "Diskon alat tulis 20%",
                rating = 4.8,
                imageRes = R.drawable.dummy,
                openTime = "09:00",
                closeTime = "22:00",
                openDays = "Daily",
                tags = listOf("Bookstore", "Stationery")
            ),

            Store(
                id = "R2",
                name = "Erafone",
                address = "Solo Square Mall",
                promo = "Cicilan 0%",
                rating = 4.7,
                imageRes = R.drawable.dummy,
                openTime = "10:00",
                closeTime = "21:00",
                openDays = "Daily",
                tags = listOf("Electronics", "Gadget")
            ),

            Store(
                id = "R3",
                name = "Planet Sports",
                address = "Solo Grand Mall",
                promo = "Sepatu mulai 199rb",
                rating = 4.6,
                imageRes = R.drawable.dummy,
                openTime = "10:00",
                closeTime = "22:00",
                openDays = "Daily",
                tags = listOf("Sports", "Fashion")
            ),

            Store(
                id = "R4",
                name = "MR.DIY",
                address = "The Park Solo Baru",
                promo = "Promo serba hemat",
                rating = 4.9,
                imageRes = R.drawable.dummy,
                openTime = "09:00",
                closeTime = "22:00",
                openDays = "Daily",
                tags = listOf("Household", "Tools")
            ),

            Store(
                id = "R5",
                name = "Uniqlo",
                address = "Solo Paragon Mall",
                promo = "AIRism Special Price",
                rating = 4.8,
                imageRes = R.drawable.dummy,
                openTime = "10:00",
                closeTime = "22:00",
                openDays = "Daily",
                tags = listOf("Fashion", "Clothing")
            )
        )
    }

    fun getStoreInventory(): List<StoreInventory> {
        return listOf(

            // ================= F1 - Beard Papa's =================

            // Cream Puff Party Collections
            StoreInventory(
                id = "F1001",
                storeId = "F1",
                name = "Delight Box",
                price = "Rp297.000",
                imageRes = R.drawable.dummy,
                category = "Cream Puff Party Collections"
            ),

            StoreInventory(
                id = "F1002",
                storeId = "F1",
                name = "Family Bundle",
                price = "Rp297.000",
                imageRes = R.drawable.dummy,
                category = "Cream Puff Party Collections"
            ),

            StoreInventory(
                id = "F1003",
                storeId = "F1",
                name = "Party Box",
                price = "Rp120.000",
                imageRes = R.drawable.dummy,
                category = "Cream Puff Party Collections"
            ),

            StoreInventory(
                id = "F1004",
                storeId = "F1",
                name = "Mini Box",
                price = "Rp15.000",
                imageRes = R.drawable.dummy,
                category = "Cream Puff Party Collections"
            ),

            StoreInventory(
                id = "F1005",
                storeId = "F1",
                name = "Super Bundle",
                price = "Rp200.000",
                imageRes = R.drawable.dummy,
                category = "Cream Puff Party Collections"
            ),

            // The Eclair
            StoreInventory(
                id = "F1006",
                storeId = "F1",
                name = "The Eclair Bestie",
                price = "Rp89.000",
                imageRes = R.drawable.dummy,
                category = "The Eclair"
            ),

            StoreInventory(
                id = "F1007",
                storeId = "F1",
                name = "The Eclair",
                price = "Rp49.900",
                imageRes = R.drawable.dummy,
                category = "The Eclair"
            ),

            StoreInventory(
                id = "F1008",
                storeId = "F1",
                name = "Eclair Chocolate",
                price = "Rp25.000",
                imageRes = R.drawable.dummy,
                category = "The Eclair"
            ),

            StoreInventory(
                id = "F1009",
                storeId = "F1",
                name = "Eclair Vanilla",
                price = "Rp25.000",
                imageRes = R.drawable.dummy,
                category = "The Eclair"
            ),

            // Signature Pie Cream Puff
            StoreInventory(
                id = "F1010",
                storeId = "F1",
                name = "Durian",
                price = "Rp93.000",
                imageRes = R.drawable.dummy,
                category = "Signature Pie Cream Puff"
            ),

            StoreInventory(
                id = "F1011",
                storeId = "F1",
                name = "Cookies & Cream",
                price = "Rp75.600",
                imageRes = R.drawable.dummy,
                category = "Signature Pie Cream Puff"
            ),

            StoreInventory(
                id = "F1012",
                storeId = "F1",
                name = "Vanilla Custard",
                price = "Rp58.000",
                imageRes = R.drawable.dummy,
                category = "Signature Pie Cream Puff"
            ),

            // Classic Eclair
            StoreInventory(
                id = "F1013",
                storeId = "F1",
                name = "Black Thorn",
                price = "Rp98.000",
                imageRes = R.drawable.dummy,
                category = "Classic Eclair"
            ),

            StoreInventory(
                id = "F1014",
                storeId = "F1",
                name = "Cookies & Cream",
                price = "Rp82.000",
                imageRes = R.drawable.dummy,
                category = "Classic Eclair"
            ),

            StoreInventory(
                id = "F1015",
                storeId = "F1",
                name = "Custard",
                price = "Rp68.000",
                imageRes = R.drawable.dummy,
                category = "Classic Eclair"
            ),

            // Mini Cream Puff
            StoreInventory(
                id = "F1016",
                storeId = "F1",
                name = "Black Thorn",
                price = "Rp151.700",
                imageRes = R.drawable.dummy,
                category = "Mini Cream Puff"
            ),

            StoreInventory(
                id = "F1017",
                storeId = "F1",
                name = "Vanilla Custard",
                price = "Rp102.000",
                imageRes = R.drawable.dummy,
                category = "Mini Cream Puff"
            ),

            StoreInventory(
                id = "F1018",
                storeId = "F1",
                name = "10 pcs",
                price = "Rp220.300",
                imageRes = R.drawable.dummy,
                category = "Mini Cream Puff"
            ),

            // ================= F2 - Fore =================

            StoreInventory(
                id = "F2001",
                storeId = "F2",
                name = "Es Kopi Fore",
                price = "Rp28.000",
                imageRes = R.drawable.dummy,
                category = "Coffee"
            ),

            StoreInventory(
                id = "F2002",
                storeId = "F2",
                name = "Butterscotch Latte",
                price = "Rp35.000",
                imageRes = R.drawable.dummy,
                category = "Coffee"
            ),

            // ================= F3 - Wingstop =================

            StoreInventory(
                id = "F3001",
                storeId = "F3",
                name = "Louisiana Wings",
                price = "Rp45.000",
                imageRes = R.drawable.dummy,
                category = "Chicken"
            ),

            StoreInventory(
                id = "F3002",
                storeId = "F3",
                name = "Cheese Fries",
                price = "Rp28.000",
                imageRes = R.drawable.dummy,
                category = "Snack"
            ),

            // ================= F4 - JCO =================

            StoreInventory(
                id = "F4001",
                storeId = "F4",
                name = "Alcapone Donut",
                price = "Rp12.000",
                imageRes = R.drawable.dummy,
                category = "Donut"
            ),

            StoreInventory(
                id = "F4002",
                storeId = "F4",
                name = "Jcoccino",
                price = "Rp30.000",
                imageRes = R.drawable.dummy,
                category = "Coffee"
            ),

            // ================= F5 - Chatime =================

            StoreInventory(
                id = "F5001",
                storeId = "F5",
                name = "Brown Sugar Milk Tea",
                price = "Rp33.000",
                imageRes = R.drawable.dummy,
                category = "Milk Tea"
            ),

            StoreInventory(
                id = "F5002",
                storeId = "F5",
                name = "Hazelnut Chocolate",
                price = "Rp35.000",
                imageRes = R.drawable.dummy,
                category = "Beverage"
            ),

            // ================= R1 - Gramedia =================

            StoreInventory(
                id = "R1001",
                storeId = "R1",
                name = "Buku Atomic Habits",
                price = "Rp108.000",
                imageRes = R.drawable.dummy,
                category = "Book"
            ),

            StoreInventory(
                id = "R1002",
                storeId = "R1",
                name = "Notebook B5",
                price = "Rp25.000",
                imageRes = R.drawable.dummy,
                category = "Stationery"
            ),

            // ================= R2 - Erafone =================

            StoreInventory(
                id = "R2001",
                storeId = "R2",
                name = "Samsung Galaxy Buds",
                price = "Rp799.000",
                imageRes = R.drawable.dummy,
                category = "Audio"
            ),

            StoreInventory(
                id = "R2002",
                storeId = "R2",
                name = "Anker Charger 20W",
                price = "Rp189.000",
                imageRes = R.drawable.dummy,
                category = "Accessory"
            ),

            // ================= R3 - Planet Sports =================

            StoreInventory(
                id = "R3001",
                storeId = "R3",
                name = "Running Shoes",
                price = "Rp899.000",
                imageRes = R.drawable.dummy,
                category = "Shoes"
            ),

            StoreInventory(
                id = "R3002",
                storeId = "R3",
                name = "Nike Jersey",
                price = "Rp299.000",
                imageRes = R.drawable.dummy,
                category = "Clothing"
            ),

            // ================= R4 - MR DIY =================

            StoreInventory(
                id = "R4001",
                storeId = "R4",
                name = "LED Desk Lamp",
                price = "Rp85.000",
                imageRes = R.drawable.dummy,
                category = "Home"
            ),

            StoreInventory(
                id = "R4002",
                storeId = "R4",
                name = "Mini Screwdriver Set",
                price = "Rp45.000",
                imageRes = R.drawable.dummy,
                category = "Tools"
            ),

            // ================= R5 - Uniqlo =================

            StoreInventory(
                id = "R5001",
                storeId = "R5",
                name = "AIRism Oversized Tee",
                price = "Rp199.000",
                imageRes = R.drawable.dummy,
                category = "Clothing"
            ),

            StoreInventory(
                id = "R5002",
                storeId = "R5",
                name = "Cargo Pants",
                price = "Rp399.000",
                imageRes = R.drawable.dummy,
                category = "Fashion"
            )
        )
    }
}