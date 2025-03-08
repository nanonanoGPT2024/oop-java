package com.nanonano.abstractClass;

public class TransferBank  extends Pembayaran{
    

    private String nomorRekening;
    public TransferBank(double jumlah, String nomorRekening){
        super(jumlah);
        this.nomorRekening = nomorRekening;
    }

    @Override
    public  void validasiPembayaran() {

        System.out.println("Validasi transfer ke rekening : " + nomorRekening);
        if(nomorRekening.length() < 10) {
            throw new IllegalArgumentException("Nomor Rekening Tidak Valid");
        }
    }

    @Override
    public void prosesPembayaran(){
        System.out.println("Memproses pembayaran transfer bank sebesar Rp. " + jumlah);
    }
}
