package com.indivaragroup;

import com.indivaragroup.looping.DoWhileLoop;
import com.indivaragroup.looping.ForEach;
import com.indivaragroup.looping.ForLoop;
import com.indivaragroup.looping.WhileLoop;
import com.indivaragroup.method.MethodOperation;
import com.indivaragroup.method.ReqursiveMethod;
import com.indivaragroup.scope.ScopeOperation;
import com.indivaragroup.switchcase.*;

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



        //9. augmented assignment
        System.out.println("Augmented Assignment");

        AugmentedAssignment augmented = new AugmentedAssignment();
        augmented.augmentedAssignmentFunction();

        System.out.println("================== \n");

        //10. unary assignment
        System.out.println("Unary Assignment");

        UnaryAssignment unary = new UnaryAssignment();
        unary.unaryAssignmentFunction();

        System.out.println("================== \n");

        //11. compare operation
        System.out.println("Compare Operation");
        CompareOperation compare = new CompareOperation();
        compare.compareOperationFunction();
        System.out.println("================== \n");

        //12. bitwise operatioon
        System.out.println("Bitwise Operation");
        BitwiseOperation bitwise = new BitwiseOperation();
        bitwise.bitwiseOperationFunction();
        System.out.println("================== \n");

        //13. Boolean Operation
        System.out.println("Boolean Operation");
        BooleanOperation booleanOperation = new BooleanOperation();
        booleanOperation.booleanOperationFunction();
        System.out.println("================== \n");

        //14. Instance Of Operation
        System.out.println("Instance of Operation");
        InstanceOfOperation instanceOf = new InstanceOfOperation();
        instanceOf.instanceOfOperationFunction();
        System.out.println("================== \n");

        //15. Expression
        System.out.println("Expression");
        Expression expression = new Expression();
        expression.expressionFunction();
        System.out.println("================== \n");

        //16. Statement
        System.out.println("Statement");
        Statement statement = new Statement();
        statement.statementFunction();
        System.out.println("================== \n");

        //17. If Statement
        System.out.println("If Statement");
        IfStatement ifStatement = new IfStatement();
        ifStatement.ifStatement();
        System.out.println("================== \n");

        //18. Challenge Two
        System.out.println("Challenge Two");
        ChallengeTwo challengeTwo = new ChallengeTwo();
        challengeTwo.challengeTwo();
        System.out.println("================== \n");

        //19. Else Statement
        System.out.println("Else Stetement");
        ElseStatement elseStatement = new ElseStatement();
        elseStatement.elseStatement();
        System.out.println("================== \n");

        //20. Challenge Three
        System.out.println("Challenge Three");
        ChallengeThree challengeThree = new ChallengeThree();
        challengeThree.challengeThree();
        System.out.println("================== \n");

        //21. Challenge Four
        System.out.println("Challenge Four");
        ChallengeFour challengeFour = new ChallengeFour();
        challengeFour.challengeFour();
        System.out.println("================== \n");
*/
        //22. Switch Case
        System.out.println("Switch Case Cuaca");
        SwitchCaseOperation sc = new SwitchCaseOperation();
        sc.cekCuaca();
        System.out.println("================== \n");

        //23. Switch Lambda
        System.out.println("Switch Lambda");
        SwitchLambdaOperation sl = new SwitchLambdaOperation();
        sl.cekCuaca();
        System.out.println("================== \n");

        //24. Switch yield
        System.out.println("Switch Yield");
        SwitchYieldOperation sy = new SwitchYieldOperation();
        sy.cekCuaca();
        System.out.println("================== \n");

        //25. For Loop
        System.out.println("For Loop");
        ForLoop loop = new ForLoop();
        loop.loopingFor();
        System.out.println("================== \n");

        //26. while Loop
        System.out.println("While Loop");
        WhileLoop loopwhile = new WhileLoop();
        loopwhile.loopingWhile();
        System.out.println("================== \n");

        //27. Do while loop
        System.out.println("Do While Loop");
        DoWhileLoop doWhileLoop = new DoWhileLoop();
        doWhileLoop.loopingDoWhile();
        System.out.println("================== \n");

        //28. Break
        System.out.println("Break Example");
        BreakOperation op = new BreakOperation();
        op.contohBreak();
        System.out.println("================== \n");

        //29. Continue
        System.out.println("Continue Example");
        ContinueOperation continueOperation = new ContinueOperation();
        continueOperation.contohContinue();
        System.out.println("================== \n");

        //30. For Each
        System.out.println("For Each Loop");
        ForEach forEach = new ForEach();
        forEach.loopingForEach();
        System.out.println("================== \n");

        //31. Method
        System.out.println("Method Operation");
        MethodOperation methodOperation = new MethodOperation();
        methodOperation.runAllMethods();
        System.out.println("================== \n");

        //32. Reqursive Method
        System.out.println("Recursive Method");
        ReqursiveMethod recursiveOperation = new ReqursiveMethod();
        recursiveOperation.runRecursive();
        System.out.println("================== \n");

        //33. Scope
        System.out.println("Scope Variable");

        ScopeOperation scopeOperation = new ScopeOperation();
        scopeOperation.runScope();
        scopeOperation.contohLocalScope();
        System.out.println("================== \n");

    }
}