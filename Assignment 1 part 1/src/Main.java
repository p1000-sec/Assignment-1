void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("                 Multiplication table from 1 to 12    "));//Title
    for ( int row =1; row <=12; row++){//peramaters for the rows of the table
        for( int column=1; column<=12; column++){// peramaters for the columns of the table
            int product = row * column;
            if (product/ 100>= 1){// 3 diget number spacing
                IO.print("| " + product + " ");
            }
            else if (product/10>= 1){// 2 diget number spacing
                IO.print("|  " + product + " ");
            }
            else {// 1 diget number spacing
                IO.print("|   " + product + " ");
            }
        }
        IO.println("|");// line to section off end of table
    }


}
