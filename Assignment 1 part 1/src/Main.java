void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
    for ( int row =1; row <=12; row++){
        for( int column=1; column<=12; column++){
            IO.print(row * column + " ");
        }
        IO.println();
    }


}
