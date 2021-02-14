package edu.isu.cs.cs2263.hw02;
import java.util.StringTokenizer;

public class StringTokenizer2 extends StringTokenizer implements PushbackTokenizer  {

    //Here are the constructors. It only has two, unlike the built-in StringTokenizer, so we will have to declare
    //delimiters every time

    public StringTokenizer2(String str, String delim, boolean returnDelims) {
        super(str, delim, returnDelims);
    }

    public StringTokenizer2(String str, String delim){
        super(str, delim);
    }


    @Override
    public String nextToken() {
        return super.nextToken();
    }

    @Override
    public boolean hasMoreTokens() {
        return super.hasMoreTokens();
    }

    //pushback basically needs to set the nextToken method back a step so that the last token read can be read again
    @Override
    public void pushback() {

    }
}
