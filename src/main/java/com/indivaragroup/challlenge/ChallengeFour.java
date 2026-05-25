package com.indivaragroup.challlenge;

public class ChallengeFour {

    public void challengeFour() {

        int umur = 24;
        int tenorTahun = 16;
        double gaji = 150000000;
        double hargaRumah = 300000000;
        double cicilanPerBulan = hargaRumah / (tenorTahun * 12);
        double persenCicilan = (cicilanPerBulan / gaji) * 100;
        String hasilFinal = "";
        String decisionType = "";
        String catatanApproval = "";
        if (umur < 21) {

            hasilFinal = "REJECTED";
            decisionType = "REJECT - UMUR";
            catatanApproval = "Umur di bawah 21 tahun";
        } else if (tenorTahun > 20) {
            hasilFinal = "REJECTED";
            decisionType = "REJECT - TENOR";
            catatanApproval = "Tenor melebihi 20 tahun";
        } else if (persenCicilan > 40) {
            hasilFinal = "REJECTED";
            decisionType = "REJECT - DBR";
            catatanApproval = "Cicilan > 40% gaji (Debt Burden Ratio tinggi)";
        } else {
            hasilFinal = "APPROVED";
            if (gaji > 15000000) {
                if (persenCicilan <= 30) {
                    decisionType = "HIGH VALUE CREDIT";
                    catatanApproval = "Nasabah premium, cicilan sangat aman";
                } else {
                    decisionType = "NORMAL CREDIT";
                    catatanApproval = "Approved, tapi cicilan mendekati batas risiko";
                }
            }
            else if (gaji >= 7000000) {
                if (umur > 25) {
                    decisionType = "STANDARD APPROVED";
                    catatanApproval = "Nasabah stabil dan layak kredit";
                } else {
                    decisionType = "NEED GUARANTOR";
                    catatanApproval = "Usia 21–25, butuh penjamin";
                }
            }
            else {
                if (tenorTahun < 15) {
                    decisionType = "CONDITIONAL APPROVED";
                    catatanApproval = "Gaji rendah tapi tenor pendek masih bisa dipertimbangkan";
                } else {
                    decisionType = "HIGH RISK APPROVED";
                    catatanApproval = "Gaji rendah + tenor panjang = risiko tinggi";
                }
            }
        }
        System.out.println("HASIL FINAL         : " + hasilFinal);
        System.out.println("DECISION TYPE       : " + decisionType);
        System.out.println("CATATAN             : " + catatanApproval);
    }
    public static void main(String[] args) {
        ChallengeFour cf = new ChallengeFour();
        cf.challengeFour();
    }
}