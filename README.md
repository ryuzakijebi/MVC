![](img/0.png)
# Model-View-Controller (MVC)
Model-View-Controller (MVC) adalah pola desain yang umum digunakan dalam pengembangan perangkat lunak untuk memisahkan komponen-komponen aplikasi menjadi tiga bagian utama.
#

![](img/1.png)

### Model
   Model mewakili data atau logika bisnis dalam aplikasi. Ini mencakup objek-objek yang merepresentasikan informasi yang akan ditampilkan atau dimanipulasi oleh pengguna.

**Contoh :**
Objek-objek JPA (Java Persistence API) yang mewakili entitas database, POJOs (Plain Old Java Objects), atau DTOs (Data Transfer Objects).

**Tanggung Jawab :** Menyediakan data dan logika bisnis, tidak langsung berinteraksi dengan pengguna atau tampilan.

#
### View
View bertanggung jawab atas tampilan dari data yang diberikan oleh model. Ini adalah antarmuka pengguna yang menyajikan informasi kepada pengguna dan menghasilkan tampilan yang dilihat oleh pengguna. View tidak bertanggung jawab atas pemrosesan data atau bisnis.

**Contoh :** Berkas JSP (JavaServer Pages), file HTML, Thymeleaf templates, atau React komponen dapat berperan sebagai view dalam aplikasi Spring MVC.

#
### Controller
Controller berperan sebagai penghubung antara model dan view. Ini menerima permintaan dari pengguna melalui antarmuka pengguna dan menangani permintaan tersebut dengan memperbarui model dan memilih view yang sesuai untuk merender hasil kepada pengguna.

**Contoh :** Kelas-kelas yang diberi anotasi dengan @Controller atau @RestController dalam aplikasi Spring MVC bertindak sebagai controller.

**Tanggung Jawab :**
Menerima permintaan dari pengguna, memproses input, memperbarui model, dan memilih view yang sesuai.

