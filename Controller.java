package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.jpl7.*;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;


public class Controller {


    @FXML
    TextField t00;
    @FXML
    TextField t01;
    @FXML
    TextField t02;
    @FXML
    TextField t03;
    @FXML
    TextField t04;
    @FXML
    TextField t05;
    @FXML
    TextField t06;
    @FXML
    TextField t07;
    @FXML
    TextField t08;


    @FXML
    TextField t10;
    @FXML
    TextField t11;
    @FXML
    TextField t12;
    @FXML
    TextField t13;
    @FXML
    TextField t14;
    @FXML
    TextField t15;
    @FXML
    TextField t16;
    @FXML
    TextField t17;
    @FXML
    TextField t18;


    @FXML
    TextField t20;
    @FXML
    TextField t21;
    @FXML
    TextField t22;
    @FXML
    TextField t23;
    @FXML
    TextField t24;
    @FXML
    TextField t25;
    @FXML
    TextField t26;
    @FXML
    TextField t27;
    @FXML
    TextField t28;


    @FXML
    TextField t30;
    @FXML
    TextField t31;
    @FXML
    TextField t32;
    @FXML
    TextField t33;
    @FXML
    TextField t34;
    @FXML
    TextField t35;
    @FXML
    TextField t36;
    @FXML
    TextField t37;
    @FXML
    TextField t38;


    @FXML
    TextField t40;
    @FXML
    TextField t41;
    @FXML
    TextField t42;
    @FXML
    TextField t43;
    @FXML
    TextField t44;
    @FXML
    TextField t45;
    @FXML
    TextField t46;
    @FXML
    TextField t47;
    @FXML
    TextField t48;


    @FXML
    TextField t50;
    @FXML
    TextField t51;
    @FXML
    TextField t52;
    @FXML
    TextField t53;
    @FXML
    TextField t54;
    @FXML
    TextField t55;
    @FXML
    TextField t56;
    @FXML
    TextField t57;
    @FXML
    TextField t58;


    @FXML
    TextField t60;
    @FXML
    TextField t61;
    @FXML
    TextField t62;
    @FXML
    TextField t63;
    @FXML
    TextField t64;
    @FXML
    TextField t65;
    @FXML
    TextField t66;
    @FXML
    TextField t67;
    @FXML
    TextField t68;


    @FXML
    TextField t70;
    @FXML
    TextField t71;
    @FXML
    TextField t72;
    @FXML
    TextField t73;
    @FXML
    TextField t74;
    @FXML
    TextField t75;
    @FXML
    TextField t76;
    @FXML
    TextField t77;
    @FXML
    TextField t78;


    @FXML
    TextField t80;
    @FXML
    TextField t81;
    @FXML
    TextField t82;
    @FXML
    TextField t83;
    @FXML
    TextField t84;
    @FXML
    TextField t85;
    @FXML
    TextField t86;
    @FXML
    TextField t87;
    @FXML
    TextField t88;

    int s00;
    int s01;
    int s02;
    int s03;
    int s04;
    int s05;
    int s06;
    int s07;
    int s08;


    int s10;
    int s11;
    int s12;
    int s13;
    int s14;
    int s15;
    int s16;
    int s17;
    int s18;


    int s20;
    int s21;
    int s22;
    int s23;
    int s24;
    int s25;
    int s26;
    int s27;
    int s28;


    int s30;
    int s31;
    int s32;
    int s33;
    int s34;
    int s35;
    int s36;
    int s37;
    int s38;


    int s40;
    int s41;
    int s42;
    int s43;
    int s44;
    int s45;
    int s46;
    int s47;
    int s48;


    int s50;
    int s51;
    int s52;
    int s53;
    int s54;
    int s55;
    int s56;
    int s57;
    int s58;


    int s60;
    int s61;
    int s62;
    int s63;
    int s64;
    int s65;
    int s66;
    int s67;
    int s68;


    int s70;
    int s71;
    int s72;
    int s73;
    int s74;
    int s75;
    int s76;
    int s77;
    int s78;


    int s80;
    int s81;
    int s82;
    int s83;
    int s84;
    int s85;
    int s86;
    int s87;
    int s88;



    public void calcBoard() {
        // setting up all 82 int values
        int s00 = parseTextField(t00);
        int s01 = parseTextField(t01);
        int s02 = parseTextField(t02);
        int s03 = parseTextField(t03);
        int s04 = parseTextField(t04);
        int s05 = parseTextField(t05);
        int s06 = parseTextField(t06);
        int s07 = parseTextField(t07);
        int s08 = parseTextField(t08);


        int s10 = parseTextField(t10);
        int s11 = parseTextField(t11);
        int s12 = parseTextField(t12);
        int s13 = parseTextField(t13);
        int s14 = parseTextField(t14);
        int s15 = parseTextField(t15);
        int s16 = parseTextField(t16);
        int s17 = parseTextField(t17);
        int s18 = parseTextField(t18);


        int s20 = parseTextField(t20);
        int s21 = parseTextField(t21);
        int s22 = parseTextField(t22);
        int s23 = parseTextField(t23);
        int s24 = parseTextField(t24);
        int s25 = parseTextField(t25);
        int s26 = parseTextField(t26);
        int s27 = parseTextField(t27);
        int s28 = parseTextField(t28);


        int s30 = parseTextField(t30);
        int s31 = parseTextField(t31);
        int s32 = parseTextField(t32);
        int s33 = parseTextField(t33);
        int s34 = parseTextField(t34);
        int s35 = parseTextField(t35);
        int s36 = parseTextField(t36);
        int s37 = parseTextField(t37);
        int s38 = parseTextField(t38);


        int s40 = parseTextField(t40);
        int s41 = parseTextField(t41);
        int s42 = parseTextField(t42);
        int s43 = parseTextField(t43);
        int s44 = parseTextField(t44);
        int s45 = parseTextField(t45);
        int s46 = parseTextField(t46);
        int s47 = parseTextField(t47);
        int s48 = parseTextField(t48);


        int s50 = parseTextField(t50);
        int s51 = parseTextField(t51);
        int s52 = parseTextField(t52);
        int s53 = parseTextField(t53);
        int s54 = parseTextField(t54);
        int s55 = parseTextField(t55);
        int s56 = parseTextField(t56);
        int s57 = parseTextField(t57);
        int s58 = parseTextField(t58);


        int s60 = parseTextField(t60);
        int s61 = parseTextField(t61);
        int s62 = parseTextField(t62);
        int s63 = parseTextField(t63);
        int s64 = parseTextField(t64);
        int s65 = parseTextField(t65);
        int s66 = parseTextField(t66);
        int s67 = parseTextField(t67);
        int s68 = parseTextField(t68);


        int s70 = parseTextField(t70);
        int s71 = parseTextField(t71);
        int s72 = parseTextField(t72);
        int s73 = parseTextField(t73);
        int s74 = parseTextField(t74);
        int s75 = parseTextField(t75);
        int s76 = parseTextField(t76);
        int s77 = parseTextField(t77);
        int s78 = parseTextField(t78);


        int s80 = parseTextField(t80);
        int s81 = parseTextField(t81);
        int s82 = parseTextField(t82);
        int s83 = parseTextField(t83);
        int s84 = parseTextField(t84);
        int s85 = parseTextField(t85);
        int s86 = parseTextField(t86);
        int s87 = parseTextField(t87);
        int s88 = parseTextField(t88);

        // setting up the rows of the matrix
        int[] row0 = {s00, s10, s20, s30, s40, s50, s60, s70, s80};
        int[] row1 = {s01, s11, s21, s31, s41, s51, s61, s71, s81};
        int[] row2 = {s02, s12, s22, s32, s42, s52, s62, s72, s82};
        int[] row3 = {s03, s13, s23, s33, s43, s53, s63, s73, s83};
        int[] row4 = {s04, s14, s24, s34, s44, s54, s64, s74, s84};
        int[] row5 = {s05, s15, s25, s35, s45, s55, s65, s75, s85};
        int[] row6 = {s06, s16, s26, s36, s46, s56, s66, s76, s86};
        int[] row7 = {s07, s17, s27, s37, s47, s57, s67, s77, s87};
        int[] row8 = {s08, s18, s28, s38, s48, s58, s68, s78, s88};

        int[][] allRows = {row0, row1, row2, row3, row4, row5, row6, row7, row8};

        Term rowsTerm = Util.intArrayArrayToList(allRows);
        String matrixString = buildMatrix(allRows); // string representation of the sudoku matrix as a prolog list

        // loading the prolog file
        Query q0 = new Query("consult", new Term[]{new Atom("/home/mark/Documents/JavaProjects/SudokuSolver/src/com/company/sudoku.pl")});
        System.out.println("consult " + (q0.hasSolution() ? "succeeded" : "failed"));

        // querying the prolog sudoku solver using the forementioned (java) matrix
//        Query q1 = new Query("problem(1, Rows), sudoku(Rows, Result).");
        Query q1 = new Query("sudoku("+ matrixString +", Result)"); // thanks to github.com/slumyo for giving me the idea to use double args. p.s. I also stole his "buildMatrix" and "buildList" for convenience
        System.out.println("sudoku " + (q1.hasSolution() ? "succeeded" : "failed"));

        Map<String, Term> rowsTermMap = q1.oneSolution();
        Term solvedRowsTerm = (rowsTermMap.get("Result"));

        parseSolvedRowsTerm(solvedRowsTerm);
    }
    private String buildMatrix(int[][] cells) { // build matrix as string
        StringBuilder result = new StringBuilder("[");

        ArrayList<String> strList = new ArrayList<>();
        for (int[] i : cells) {
            strList.add(buildList(i));
        }

        result.append(String.join(",", strList));

        result.append("]");

        return result.toString();
    }

    private String buildList(int[] line) { // build matrix as string
        StringBuilder result = new StringBuilder("[");

        ArrayList<String> intList = new ArrayList<>();
        for (int i : line) {
            String stringval;

            if(i == 0){
                stringval = "_";
            }else{
                stringval = String.valueOf(i);
            }   // if statement is a small adaptation to the version github.com/zlumyo made, because my prolog sudoku had a slightly different format for the list.

            intList.add(stringval);
        }

        result.append(String.join(",", intList));

        result.append("]");

        return result.toString();
    }

    private void parseSolvedRowsTerm(Term solvedRowsTerm) { // update all the fxml textfields
        Term[] seperateRows = Util.listToTermArray(solvedRowsTerm);

        int[] TRow0 = convertTermArray(seperateRows[0].toTermArray());
        int[] TRow1 = convertTermArray(seperateRows[1].toTermArray());
        int[] TRow2 = convertTermArray(seperateRows[2].toTermArray());
        int[] TRow3 = convertTermArray(seperateRows[3].toTermArray());
        int[] TRow4 = convertTermArray(seperateRows[4].toTermArray());
        int[] TRow5 = convertTermArray(seperateRows[5].toTermArray());
        int[] TRow6 = convertTermArray(seperateRows[6].toTermArray());
        int[] TRow7 = convertTermArray(seperateRows[7].toTermArray());
        int[] TRow8 = convertTermArray(seperateRows[8].toTermArray());
        TextField[] row0 = {t00, t10, t20, t30, t40, t50, t60, t70, t80};
        TextField[] row1 = {t01, t11, t21, t31, t41, t51, t61, t71, t81};
        TextField[] row2 = {t02, t12, t22, t32, t42, t52, t62, t72, t82};
        TextField[] row3 = {t03, t13, t23, t33, t43, t53, t63, t73, t83};
        TextField[] row4 = {t04, t14, t24, t34, t44, t54, t64, t74, t84};
        TextField[] row5 = {t05, t15, t25, t35, t45, t55, t65, t75, t85};
        TextField[] row6 = {t06, t16, t26, t36, t46, t56, t66, t76, t86};
        TextField[] row7 = {t07, t17, t27, t37, t47, t57, t67, t77, t87};
        TextField[] row8 = {t08, t18, t28, t38, t48, t58, t68, t78, t88};
        assignToTextfield(TRow0, row0);
        assignToTextfield(TRow1, row1);
        assignToTextfield(TRow2, row2);
        assignToTextfield(TRow3, row3);
        assignToTextfield(TRow4, row4);
        assignToTextfield(TRow5, row5);
        assignToTextfield(TRow6, row6);
        assignToTextfield(TRow7, row7);
        assignToTextfield(TRow8, row8);
    }

    private void assignToTextfield(int[] ints, TextField[] tfs){ //update fxml textfield in a given row
        for (int i =0;  i < 9; i++){
            int value = ints[i];
            tfs[i].setText(String.valueOf(value));
        }
    }

    private int[] convertTermArray(Term[] terms){ //int[] to term[]
            int[] ints = new int[9];
            for(int i = 0; i<terms.length; i++){
                ints[i] = terms[i].intValue();
            }
            return ints;
    }

//        for(Term term : x){
//            System.out.println(term.intValue());
//        }



//        for (String key : rowsTerm2.keySet()){
//            System.out.println(key + "hdhdhd");
//        }


//        TextField[] allTArray = {t00, t01, t02, t03, t04, t05, t06, t07, t08, t10, t11, t12, t13, t14, t15, t16, t17, t18, t20, t21, t22, t23, t24, t25, t26,
//                t27, t28, t30, t31, t32, t33, t34, t35, t36, t37, t38, t40, t41, t42, t43, t44, t45, t46, t47, t48, t50, t51, t52, t53, t54, t55, t56, t57,
//                t58, t60, t61, t62, t63, t64, t65, t66, t67, t68, t70, t71, t72, t73, t74, t75, t76, t77, t78, t80, t81, t82, t83, t84, t85, t86, t87, t88};
//        int[] allSArray = {s00, s01, s02, s03, s04, s05, s06, s07, s08, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s22, s23, s24, s25, s26, s27,
//                s28, s30, s31, s32, s33, s34, s35, s36, s37, s38, s40, s41, s42, s43, s44, s45, s46, s47, s48, s50, s51, s52, s53, s54, s55, s56, s57, s58,
//                s60, s61, s62, s63, s64, s65, s66, s67, s68, s70, s71, s72, s73, s74, s75, s76, s77, s78, s80, s81, s82, s83, s84, s85, s86, s87, s88};
//        for(int i = 0, u = 0; i < allTArray.length && u < allSArray.length; i++ , u++){
//                TextField t = allTArray[i];
//                System.out.println(t);
//                int value = Integer.parseInt(t.getText());
//                allSArray[u] = value;
//                System.out.println( allSArray[u]);
//        }


//        Term[] term0 = Util.intArrayToList(row0).toTermArray();
//        Term[] term1 = Util.intArrayToList(row1).toTermArray();
//        Term[] term2 = Util.intArrayToList(row2).toTermArray();
//        Term[] term3 = Util.intArrayToList(row3).toTermArray();
//        Term[] term4 = Util.intArrayToList(row4).toTermArray();
//        Term[] term5 = Util.intArrayToList(row5).toTermArray();
//        Term[] term6 = Util.intArrayToList(row6).toTermArray();
//        Term[] term7 = Util.intArrayToList(row7).toTermArray();
//        Term[] term8 = Util.intArrayToList(row8).toTermArray();
//       Term[] rowsTerm = Util.intArrayArrayToList(allRows).toTermArray();
//        for (int i = 0; i < rowsTerm.length; i++){
//            Term[] subTerm = rowsTerm[i].toTermArray();
//            for (int j = 0; j < subTerm.length; j++){
//                System.out.println("row"+i+", col"+j+":"+ subTerm[j] +" -- s06="+s06);
//            }
//            System.out.println(rowsTerm[i]);
//        }

//       Query q0 = new Query("consult", new Term[] {new Atom("/home/mark/Documents/JavaProjects/SudokuSolver/src/com/company/sudoku.pl")});
//        System.out.println( "consult " + (q0.hasSolution() ? "succeeded" : "failed"));
//       Query q1 = new Query("sudoku", rowsTerm );
//        System.out.println( "sudoku " + (q1.hasSolution() ? "succeeded" : "failed"));
//        System.out.println(rowsTerm);


    public void checkLegalKey(KeyEvent key){
        if(! (key.getCode() == KeyCode.BACK_SPACE)){
            try {
                Integer.parseInt(key.getCharacter());
            } catch (Exception e) {
                System.out.println("Only [0-9] allowed, no letters.");
//            Alert letters = new Alert(Alert.AlertType.WARNING,"Only [0-9] allowed, no letters.");
//            letters.show();
            }
        }
    }

    private int parseTextField(TextField t){ // convert textfield to its int value
        String checkText;

        try{
            checkText = t.getText();

        }
        catch (NullPointerException e){
            System.out.println("error");
            return 0;
        }

        return Integer.parseInt(checkText);
    }

//    int[] col0 = {s00, s01, s02, s03, s04, s05, s06, s07, s08};
//    int[] col1 = {s10, s11, s12, s13, s14, s15, s16, s17, s18};
//    int[] col2 = {s20, s21, s22, s23, s24, s25, s26, s27, s28};
//    int[] col3 = {s30, s31, s32, s33, s34, s35, s36, s37, s38};
//    int[] col4 = {s40, s41, s42, s43, s44, s45, s46, s47, s48};
//    int[] col5 = {s50, s51, s52, s53, s54, s55, s56, s57, s58};
//    int[] col6 = {s60, s61, s62, s63, s64, s65, s66, s67, s68};
//    int[] col7 = {s70, s71, s72, s73, s74, s75, s76, s77, s78};
//    int[] col8 = {s80, s81, s82, s83, s84, s85, s86, s87, s88};
//    int[] row0 = {s00, s10, s20, s30, s40, s50, s60, s70, s80};
//    int[] row1 = {s01, s11, s21, s31, s41, s51, s61, s71, s81};
//    int[] row2 = {s02, s12, s22, s32, s42, s52, s62, s72, s82};
//    int[] row3 = {s03, s13, s23, s33, s43, s53, s63, s73, s83};
//    int[] row4 = {s04, s14, s24, s34, s44, s54, s64, s74, s84};
//    int[] row5 = {s05, s15, s25, s35, s45, s55, s65, s75, s85};
//    int[] row6 = {s06, s16, s26, s36, s46, s56, s66, s76, s86};
//    int[] row7 = {s07, s17, s27, s37, s47, s57, s67, s77, s87};
//    int[] row8 = {s08, s18, s28, s38, s48, s58, s68, s78, s88};
//    int[] block0 = {s00, s01, s02, s10, s11, s12, s20, s21, s22};
//    int[] block1 = {s03, s04, s05, s13, s14, s15, s23, s24, s25};
//    int[] block2 = {s06, s07, s08, s16, s17, s18, s26, s27, s28};
//    int[] block3 = {s31, s31, s32, s40, s41, s42, s50, s51, s52};
//    int[] block4 = {s33, s34, s35, s43, s44, s45, s53, s54, s55};
//    int[] block5 = {s36, s37, s38, s46, s47, s48, s56, s57, s58};
//    int[] block6 = {s60, s61, s62, s70, s71, s72, s80, s81, s82};
//    int[] block7 = {s63, s64, s65, s73, s74, s75, s83, s84, s85};
//    int[] block8 = {s66, s67, s68, s76, s77, s78, s86, s87, s88};
//
//    TextField[] tcol0 = {t00, t01, t02, t03, t04, t05, t06, t07, t08};
//    TextField[] tcol1 = {t10, t11, t12, t13, t14, t15, t16, t17, t18};
//    TextField[] tcol2 = {t20, t21, t22, t23, t24, t25, t26, t27, t28};
//    TextField[] tcol3 = {t30, t31, t32, t33, t34, t35, t36, t37, t38};
//    TextField[] tcol4 = {t40, t41, t42, t43, t44, t45, t46, t47, t48};
//    TextField[] tcol5 = {t50, t51, t52, t53, t54, t55, t56, t57, t58};
//    TextField[] tcol6 = {t60, t61, t62, t63, t64, t65, t66, t67, t68};
//    TextField[] tcol7 = {t70, t71, t72, t73, t74, t75, t76, t77, t78};
//    TextField[] tcol8 = {t80, t81, t82, t83, t84, t85, t86, t87, t88};
//    TextField[] trow0 = {t00, t10, t20, t30, t40, t50, t60, t70, t80};
//    TextField[] trow1 = {t01, t11, t21, t31, t41, t51, t61, t71, t81};
//    TextField[] trow2 = {t02, t12, t22, t32, t42, t52, t62, t72, t82};
//    TextField[] trow3 = {t03, t13, t23, t33, t43, t53, t63, t73, t83};
//    TextField[] trow4 = {t04, t14, t24, t34, t44, t54, t64, t74, t84};
//    TextField[] trow5 = {t05, t15, t25, t35, t45, t55, t65, t75, t85};
//    TextField[] trow6 = {t06, t16, t26, t36, t46, t56, t66, t76, t86};
//    TextField[] trow7 = {t07, t17, t27, t37, t47, t57, t67, t77, t87};
//    TextField[] trow8 = {t08, t18, t28, t38, t48, t58, t68, t78, t88};
//    TextField[] tblock0 = {t00, t01, t02, t10, t11, t12, t20, t21, t22};
//    TextField[] tblock1 = {t03, t04, t05, t13, t14, t15, t23, t24, t25};
//    TextField[] tblock2 = {t06, t07, t08, t16, t17, t18, t26, t27, t28};
//    TextField[] tblock3 = {t31, t31, t32, t40, t41, t42, t50, t51, t52};
//    TextField[] tblock4 = {t33, t34, t35, t43, t44, t45, t53, t54, t55};
//    TextField[] tblock5 = {t36, t37, t38, t46, t47, t48, t56, t57, t58};
//    TextField[] tblock6 = {t60, t61, t62, t70, t71, t72, t80, t81, t82};
//    TextField[] tblock7 = {t63, t64, t65, t73, t74, t75, t83, t84, t85};
//    TextField[] tblock8 = {t66, t67, t68, t76, t77, t78, t86, t87, t88};

//    int[][] allRows = {row0, row1, row2, row3, row4, row5, row6, row7, row8};

//    public TextField[] getAllTArray() {
//        return allTArray;
//    }
//
//    public int[] getAllSArray() {
//        return allSArray;
//    }
//
//    TextField[] allTArray = {t00, t01, t02, t03, t04, t05, t06, t07, t08, t10, t11, t12, t13, t14, t15, t16, t17, t18, t20, t21, t22, t23, t24, t25, t26,
//            t27, t28, t30, t31, t32, t33, t34, t35, t36, t37, t38, t40, t41, t42, t43, t44, t45, t46, t47, t48, t50, t51, t52, t53, t54, t55, t56, t57,
//            t58, t60, t61, t62, t63, t64, t65, t66, t67, t68, t70, t71, t72, t73, t74, t75, t76, t77, t78, t80, t81, t82, t83, t84, t85, t86, t87, t88};
//    int[] allSArray = {s00, s01, s02, s03, s04, s05, s06, s07, s08, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s22, s23, s24, s25, s26, s27,
//            s28, s30, s31, s32, s33, s34, s35, s36, s37, s38, s40, s41, s42, s43, s44, s45, s46, s47, s48, s50, s51, s52, s53, s54, s55, s56, s57, s58,
//            s60, s61, s62, s63, s64, s65, s66, s67, s68, s70, s71, s72, s73, s74, s75, s76, s77, s78, s80, s81, s82, s83, s84, s85, s86, s87, s88};





//    private void parseAgain(){
//        for(TextField i : allTArray){
//            for(int j : allSArray){
//                allSArray[j]  = parseTextField(i);
//                System.out.println(allTArray[j]);
//
//            }
//        }
//    }


}
