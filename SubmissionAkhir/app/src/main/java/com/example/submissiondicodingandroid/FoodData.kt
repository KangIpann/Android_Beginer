package com.example.submissiondicodingandroid

object FoodData {
    private val FoodName = arrayOf(
        "Sate",
        "Bakso",
        "Soto Lamongan",
        "Pecel",
        "Es Cendol",
        "Bubur Ayam",
        "Rendang",
        "Pempek",
        "Nasi Goreng",
        "Gudeg"
    )
    private val FoodImage = intArrayOf(
        R.drawable.sate,
        R.drawable.bakso,
        R.drawable.soto_lamongan,
        R.drawable.pecel,
        R.drawable.cendol,
        R.drawable.bubur_ayam,
        R.drawable.rendang,
        R.drawable.pempek,
        R.drawable.nasi_goreng,
        R.drawable.gudeg,
    )
    private var FoodDescription = arrayOf(
        """
            Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu.
            Sate disajikan dengan berbagai macam bumbu yang bergantung pada variasi resep sate. Daging yang dijadikan sate antara lain daging ayam, kambing, domba, sapi, babi, kelinci, kuda, dan lain-lain.
            Sate diketahui berasal dari Jawa, Indonesia, dan dapat ditemukan di mana saja di Indonesia dan telah dianggap sebagai salah satu masakan nasional Indonesia.
        """.trimIndent(),
        """
            Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia.
            Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau
            Bakso umumnya disajikan panas-panas dengan kuah kaldu sapi bening, dicampur mi, bihun, taoge, tahu, terkadang telur lalu ditaburi bawang goreng dan seledri.
        """.trimIndent(),
        """
            Soto lamongan adalah soto khas Lamongan, Jawa Timur, yang saat ini telah menyebar ke berbagai daerah di Indonesia.
            Soto Lamongan adalah salah satu soto paling gurih karena mempunyai ciri khas koya udang yang tidak di miliki oleh soto lainnya. 
            Kenikmatan inilah yang menjadikan soto lamongan terkenal di Indonesia
        """.trimIndent(),
        """
            Pecel atau pecal merupakan makanan berasal dari pulau Jawa, makanan ini biasanya dihidangkan dengan bumbu sambal kacang sebagai bahan utamanya dan dicampur dengan aneka jenis sayuran.
            Makanan ini populer terutama di wilayah DI Yogyakarta, Jawa Tengah, dan Jawa Timur.
            Makanan ini juga mirip dengan gado-gado yang membedakannya adalah campuran bahan dan tekstur bumbunya. Nama Pecel Madiun merupakan pecel yang paling terkenal di Indonesia.
        """.trimIndent(),
        """
            Es cendol adalah penganan yang dibuat dari tepung beras dan sebagainya yang dibentuk dengan penyaring, kemudian dicampur dengan air gula dan santan.
            Cendol merupakan minuman penutup es manis yang mengandung tetesan tepung beras hijau, santan, dan sirup gula aren.
            Minuman ini memiliki rasa yang manis dan gurih.
        """.trimIndent(),
        """
            Bubur ayam adalah salah satu jenis makanan dari Indonesia. Bubur nasi adalah beras yang dimasak dengan air yang banyak sehingga memiliki tekstur yang lembut dan berair.
            Bubur biasanya disajikan dalam suhu panas atau hangat.
            Bubur ayam disajikan dengan irisan daging ayam dengan beberapa bumbu, seperti kecap asin dan kecap manis, merica, garam, dan kadang-kadang diberi kaldu ayam. 
        """.trimIndent(),
        """
            Rendang atau randang dalam bahasa Minangkabau adalah Masakan Minangkabau yang berbahan dasar daging yang berasal dari Sumatera Barat, Indonesia.
            Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan.
            Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan.
        """.trimIndent(),
        """
            Pempek atau empek-empek adalah makanan yang terbuat dari daging ikan yang digiling lembut yang dicampur tepung kanji atau tepung sagu, serta komposisi beberapa bahan lain seperti telur, bawang putih yang dihaluskan, penyedap rasa, dan garam.
            Pempek biasanya disajikan dengan kuah cuka yang memiliki rasa asam, manis, dan pedas. Pempek sering disebut sebagai makanan khas Palembang,[
            Pempek dapat ditemukan dengan mudah di Kota Palembang, beberapa daerah Sumatra Selatan hingga provinsi Bengkulu
        """.trimIndent(),
        """
            Nasi goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti garam, bawang putih, bawang merah, merica dan kecap manis. .
            Selain itu, ditambahkan bahan-bahan pelengkap seperti telur, sayur-sayuran, makanan laut, atau daging. Makanan tersebut sering kali disantap sendiri atau disertai dengan hidangan lainnya
            Sebagai hidangan buatan rumah, nasi goreng biasanya dibuat dengan bahan-bahan yang tersisa dari hidangan lainnya, yang berujung pada ragam yang tak terbatas.
        """.trimIndent(),
        """
            Gudeg adalah hidangan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan.
            Perlu waktu berjam-jam untuk membuat hidangan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan.
            Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek.
        """.trimIndent(),
    )
    val list_food : ArrayList<Makanan>
    get() {
        val list = arrayListOf<Makanan>()
        for (data in FoodDescription.indices){
            val makanan = Makanan()
            makanan.name = FoodName[data]
            makanan.photo = FoodImage[data]
            makanan.description = FoodDescription[data]

            list.add(makanan)
        }
        return list
    }
}