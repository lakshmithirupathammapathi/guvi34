import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str="hello word.goodby";
		 if(str == null || str.isEmpty())
    {
        return;
    }
    int lines = 1;
    int pos = 0;
    while ((pos = str.indexOf("\n", pos) + 1) != 0) {
        lines++;
    }
    System.out.println("the lines are"+lines);
    
}
	}
