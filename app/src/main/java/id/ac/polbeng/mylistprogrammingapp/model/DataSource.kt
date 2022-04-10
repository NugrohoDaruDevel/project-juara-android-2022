package id.ac.polbeng.mylistprogrammingapp.model

import id.ac.polbeng.mylistprogrammingapp.R

object ProgrammingData {
    private val programmingName = arrayOf(
        "C",
        "C++",
        "Dart",
        "Go",
        "Java",
        "Kotlin",
        "Javascript",
        "Python",
        "Ruby",
        "Swift"
    )

    private val programmingLangDetail = arrayOf(
        "Bahasa pemrograman C merupakan salah satu bahasa pemrograman komputer. Dibuat pada tahun 1972 oleh Dennis Ritchie untuk Sistem Operasi Unix di Bell Telephone Laboratories. Meskipun C dibuat untuk memprogram sistem dan jaringan komputer namun bahasa ini juga sering digunakan dalam mengembangkan software aplikasi.",
        "C++ adalah bahasa pemrograman komputer yang dibuat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C dikembangkan di Bell Labs (Dennis Ritchie). Pada awal tahun 1970-an, bahasa itu merupakan peningkatan dari bahasa sebelumnya, yaitu B.",
        "Dart adalah bahasa pemrograman yang dirancang untuk pengembangan klien, seperti untuk web dan aplikasi seluler. Ini dikembangkan oleh Google dan juga dapat digunakan untuk membangun aplikasi server dan desktop. Dart diresmikan pada konferensi GOTO di Aarhus, Denmark, 10-12 Oktober 2012.",
        "Go (sering disebut sebagai Golang) adalah bahasa pemrograman yang dibuat di Google pada tahun 2009 oleh Robert Griesemer, Rob Pike, dan Ken Thompson. Go adalah bahasa pemrograman sumber terbuka yang mudah, sederhana, efisien. Selain itu, Go memiliki level yang sama dengan Java.",
        "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems, yang saat ini merupakan bagian dari Oracle dan dirilis tahun 1995.",
        "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia.Kotlin versi 1.0 dirilis pada 15 Februari 2016.",
        "JavaScript disingkat (JS) adalah bahasa pemrograman tingkat tinggi dan dinamis. JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer (IE), Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag <script> pada html. JavaScript merupakan salah satu teknologi inti World Wide Web selain HTML dan CSS. JavaScript membantu membuat halaman web interaktif dan merupakan bagian aplikasi web yang esensial.",
        "Python adalah bahasa pemrograman tujuan umum yang ditafsirkan, tingkat tinggi. Dibuat oleh Guido van Rossum dan pertama kali dirilis pada tahun 1991, filosofi desain Python menekankan keterbacaan kode dengan penggunaan spasi putih yang signifikan.",
        "Ruby adalah bahasa pemrograman dinamis berbasis skrip yang berorientasi objek. Tujuan dari ruby adalah menggabungkan kelebihan dari semua bahasa-bahasa pemrograman skrip yang ada di dunia. Ruby pertama kali dibuat oleh seorang programmer Jepang bernama Yukihiro Matsumoto. Pada tahun 1993.",
        "Swift adalah bahasa pemrograman objek fungsional untuk pengembangan iOS dan OS X yang dibuat oleh Apple. Didesain untuk berdampingan dengan Objective-C dan menghindari program dari kode yang salah. Swift diperkenalkan oleh Apple pada acara tahunan WWDC 2014."
    )

    private val programmingLogo = intArrayOf(
        R.drawable.c,
        R.drawable.cpp,
        R.drawable.dart,
        R.drawable.golang,
        R.drawable.java,
        R.drawable.kotlin,
        R.drawable.javascript,
        R.drawable.python,
        R.drawable.ruby,
        R.drawable.swift
    )

    private val wikiAddress = arrayOf(
        "https://id.wikipedia.org/wiki/C_(bahasa_pemrograman)",
        "https://id.wikipedia.org/wiki/C%2B%2B",
        "https://en.wikipedia.org/wiki/Dart_(programming_language)",
        "https://id.wikipedia.org/wiki/Go_(bahasa_pemrograman)",
        "https://id.wikipedia.org/wiki/Java",
        "https://id.wikipedia.org/wiki/Kotlin_(bahasa_pemrograman)",
        "https://id.wikipedia.org/wiki/PHP",
        "https://id.wikipedia.org/wiki/Python_(bahasa_pemrograman)",
        "https://id.wikipedia.org/wiki/Ruby_(bahasa_pemrograman)",
        "https://id.wikipedia.org/wiki/Swift_(bahasa_pemrograman)"
    )

    val listData : ArrayList<Programming>
        get() {
            val list = arrayListOf<Programming>()
            for (position in programmingName.indices){
                val programming = Programming()
                programming.name = programmingName[position]
                programming.detail = programmingLangDetail[position]
                programming.logo = programmingLogo[position]
                programming.wiki = wikiAddress[position]
                list.add(programming)
            }
            return list
        }
}