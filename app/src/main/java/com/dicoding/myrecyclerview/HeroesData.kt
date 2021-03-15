package com.dicoding.myrecyclerview

object HeroesData {
    private val heroNames = arrayOf("Gengar",
        "Gardevoir",
        "Rayquaza",
        "Garchomp",
        "Sylveon",
        "Umbreon",
        "Charizard",
        "Mimikyu",
        "Lucario",
        "Greninja"
        );

    private val heroDetails = arrayOf("Gengar adalah pokemon hantu beracun yang diperkenalkan pertama kali di Generasi Pertama. Gengar berawal dari Gastly (yang kemudian berubah menjadi Haunter) setelah melewati proses trade. Pokemon ini nantinya bisa berevolusi menjadi Mega Gengar dan Gigantamax Gengar.",
        "Gardevoir adalah tipe pokemon peri berkekuatan supranatural yang dikenalkan di Generasi III. Namun, di Generasi VI, Gardevoir murni merupakan pokemon supranatural. Pokemon ini akan mulai berevolusi menjadi Kirlia begitu mencapai level 30. Gardevoir bisa berubah menjadi Gallade dan Gardevoirite.",
        "Rayquaza adalah pokemon berjenis dragon/flying legendary di Generasi III. Pokemon ini merupakan maskot game Pokemon Emerald. Pokemon ini juga memegang peran penting di Delta Episode.",
        "Garchomp adalah pokemon berjenis dragon/ground pseudo-legendari yang dikenalkan di Generasi IV. Pokemon ini bisa berubah menjadi Gabite di level 48 dan berubah menjadi Mega Garchomp.",
        "Sylveon merupakan evolusi dari Eevee yang merupakan jenis pokemon peri di Generasi VIII. Ini adalah salah satu evolusi akhir Eevee selain Vaporeon, Jolteon, Flareon, Espeon, Umbreon, Leafeon, and Glaceon.",
        "Umbreon juga merupakan salah satu bentuk evolusi dari Eevee. Pokemon ini adalah salah satu pokemon awal di Pokemon Colosseum bersama evolusi Eevee lainnya, Espeon.",
        "Charizard adalah jenis adalah jenis pokemon fire/flying yang dikenalkan di Generasi I. Charizard merupakan evolusi dari Charmeleon atau perubahan final dari Charmander. Pokemon ini merupakan maskot game dari Pokemon Red dan FireRed Versions.",
        "Mimikyu adalah pokemon jenis ghost/fairy yang dikenalkan di Generasi VII. Pokemon ini akan berubah tampilannya begitu terkena serangan.",
        "Pokemon ini adalah jenis fighting/steel yang dikenalkan di Generasi IV. Lucario bisa berubah menjadi Mega Lucario menggunakan Lucarionite.",
        "Pokemon yang mendapat suara terbanyak adalah Geninja. Evolusi dari Frogadier ini merupakan pokemon berjenis water/dark yang dikenalkan di Generasi VI."
    )

    private val heroesImages = intArrayOf(
        R.drawable.gengar,
        R.drawable.gardevoir,
        R.drawable.rayquaza,
        R.drawable.garchomp,
        R.drawable.sylveon,
        R.drawable.umbreon,
        R.drawable.charizard,
        R.drawable.mimikyu,
        R.drawable.lucario,
        R.drawable.geninja
    )

    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices) {
                val hero = Hero()
                hero.name = heroNames[position]
                hero.detail = heroDetails[position]
                hero.photo = heroesImages[position]
                list.add(hero)
            }
            return list
        }
}