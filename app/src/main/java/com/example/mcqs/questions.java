package com.example.mcqs;

public class questions {

    private String aQuestions[]={

            "1. In the relational model, cardinality is termed as:",
            "2. Relational calculus is a",
            "3. The view of total database content is",
            "4. Cartesian product in relational algebra is",
            "5. DML is provided for",
            "6.  ‘AS’ clause is used in SQL for",
            "7.  ODBC stands for",
            "8. Architecture of the database can be viewed as",
            "9. In a relational model, relations are termed as",
            "10. The database schema is written in"
};

    private String aChoice[][]={

            {"(A) A number of tuples.","(B) A number of attributes.","(C) A number of tables.","(D) A number of constraints."},
            {"(A) Procedural language."," (B) Non- Procedural language.","(C) Data definition language."," (D) High-level language."},
            {"(A) Conceptual view." ,"(B) Internal view.","(C) External view. ","(D) Physical View."},
            {"(A) a Unary operator.","(B) a Binary operator.","(C) a Ternary operator.", "(D) not defined."},
            {"(A) Description of the logical structure of a database.","(B) The addition of new structures in the database system.","(C) Manipulation & processing of the database.","(D) Definition of a physical structure of the database system."},
            {"(A) selection operation.", "(B) Rename operation.","(C) Join operation.", "(D) Projection operation."},
            {"(A) Object Database Connectivity.","(B) Oral Database Connectivity.","(C) Oracle Database Connectivity.","(D) Open Database Connectivity."},
            {"(A) two levels.", "(B) four levels.","(C) three levels.", "(D) one level."},
            {"(A) Tuples." ,"(B) Attributes","(C) Tables." ,"(D) Rows."},
            {"(A) HLL" ,"(B) DML","(C) DDL" ,"(D) DCL"}
    };

    private String aCorrectans[]={"(A) A number of tuples."," (B) Non- Procedural language.","(A) Conceptual view.","(B) a Binary operator.","(C) Manipulation & processing of the database." ,"(B) Rename operation.","(D) Open Database Connectivity.","(C) three levels.","(C) Tables.","(C) DDL"};

    public String getQuestion(int a){

        String question= aQuestions[a];
        return question;
    }

    public String getchoice1(int a){

        String choice1=aChoice[a][0];
        return choice1;

    }
    public String getchoice2(int a){

        String choice2=aChoice[a][1];
        return choice2;

    }
    public String getchoice3(int a){

        String choice3=aChoice[a][2];
        return choice3;

    }
    public String getchoice4(int a){

        String choice4=aChoice[a][3];
        return choice4;

    }

    public String getcorrectans(int a){

        String answer=aCorrectans[a];
        return answer;
    }



}