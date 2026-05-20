package com.indivaragroup;

import com.indivaragroup.data.conversion.NumberConversion;
import com.indivaragroup.house.floor.logic.CeramicLogic;
import com.indivaragroup.calculation.identity.Calculation;
import com.indivaragroup.grading.student.GradeData;
import com.indivaragroup.movie.logic.JavLogic;
import com.indivaragroup.todoapp.controller.TodoController;
import com.indivaragroup.type.data.TypeDataArray;
import com.indivaragroup.type.data.TypeDataNonPrimitive;

public class Main {
    // Tambahkan 'public' sebelum static void main
    public static void main(String[] args) {

        String helloWorld = "Hello, JDT-17";
        System.out.println("INI STRING UNTUK Hello World = " + helloWorld);

        int helloInteger = 25;
        System.out.println("INI STRING UNTUK HELLO - INTEGER = " + helloInteger);

        double helloDouble = 25.5;
        System.out.println("INI STRING UNTUK HELLO - DOUBLE = " + helloDouble);

        boolean helloBoolean = true;
        System.out.println("INI STRING UNTUK HELLO - BOOLEAN = " + helloBoolean);

        char helloChar = 'A';
        System.out.println("INI STRING UNTUK HELLO - CHAR = " + helloChar);

/*

        //1. Saya punya uang 10000
        //2. Kalau saya punya uang 10000 berarti saya harus buat ktp
        //3. kalo saya harus buat ktp berarti saya harus bayar uang sebesar 5000
        //4. buatkan kondisi if else nya yang terjadi poin 1, 2
        //5. hasil total pengurangannya

        //hintnya gunarkan int


        //1. sya punya anak murid ada 17 orang
        //2. dan saya harus memberikan nilai untuk menilai kemampuan mereka
        //3. hasil nilai tersebut harus saya olah berdasarkan nilai apabila
        //* nilai 100 =  dia jago banget
        //* nilai 90 = dia belum jago banget tapi jago aja
        //* niali 70  = dia b aja (biasa aja)

        // nilai di bawah 70 perlu belajar lagi
        //4. kalau sudah keluar nilai nya tolong di print namanya // berarti namanya itu bisa dinamis
        //atau bisa di input



        /*
        1. Disini saya punya list kode JAV dari actor remu suzumori
        2. Masukkan list tersebut kedalam array list kalau tanggal dibawah 2026 masuk ke list udah gak update
        3. list kan kode film nya di deklarasi
            releaseCode : "STAR-4124"
            releaseDate : '2025-05-04' ; Date


//        ArrayList<String> listCode = new ArrayList<>();
//        listCode.add("START-40024)
        */


        // 1. keramik
        CeramicLogic ceramicLogic = new CeramicLogic();
        ceramicLogic.check();
        System.out.println("---------\n");

        // 2. registration personal id
        Calculation calculation = new Calculation();
        calculation.calculateKtp(10000, 5000);
        System.out.println("---------\n");

        // 3. scoring students
        GradeData gradeData = new GradeData();
        gradeData.showGrades();
        System.out.println("---------\n");

        // 4. casting
        NumberConversion conversion = new NumberConversion();
        conversion.conversion();
        System.out.println("---------\n");

        // 5. primitive data
        TypeDataNonPrimitive typeData = new TypeDataNonPrimitive();
        typeData.getTypeDataNonPrimitive();
        System.out.println("---------\n");

        // 6. array
        TypeDataArray array = new TypeDataArray();
        array.execute();
        System.out.println("---------\n");

        // 7. movie
        JavLogic javLogic = new JavLogic();
        javLogic.execute();
        System.out.println("---------\n");

        //8. to do list
        TodoController controller = new TodoController();
        controller.run();
        System.out.println("---------\n");

    }
}