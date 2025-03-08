


### penjelasa tentan abstract dan interface


1. apa yang akan kita buat ?

    * setiap methode pembayaran (kartu kredit , transrfer bank, dll) memiliki proses validasi dan proses pembayaran
    * beberapa pemmbayaran membutuhkan tambahan biaya admin
    * akan ada abstract class untuk metode dasar pembayaran 
    * akan ada interface untuk pembayaran yang memiliki biaya tambahan

2. membuatt abstract class pembayaran

    * abstract class berisi metode umum yg di gunakan oleh semua jenis pembayaran
    * keapa pakai abstract class
        * karena semua metode pembayaran harus memiliki valdasi dan proses pembayaran tapi implementasinya bisa beda

3. membuat interface BiayaAdmin

    * beberapa metode pembayaran memiliki biaya tambahan
    * kenapa pakai interface ?
        * karena tidak semua pemabayaran punya biaya admin, jadi hanya methode tertentu saja yg mengimplementasikan interface ini

4. implementasi kartu kredit

    * kartu kredit memiliki validasi yg sepsifik dan di kenakan biaya admin
    * mengunakan abstract class untuk validasi dan pembayaran
    * menggunakan interface untuk biaya admin
    
        