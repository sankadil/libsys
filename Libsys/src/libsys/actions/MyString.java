package libsys.actions;

public class MyString{



public static void main(String arg[])
{
String a[] =split("String input", ' ');

System.out.println(a[0]+"......."+a[1]);
}

public static String[] split(String input, char c) {

int tokenCount = 0;

int cIndex = -1;

do {

cIndex = input.indexOf(c, cIndex + 1);

tokenCount++;

} while (cIndex >= 0);

String[] tokens = new String[tokenCount];

int tokenIndex = 0;

do {

int index = input.indexOf(c, cIndex + 1);

if (index < 0) {

tokens[tokenIndex] = input.substring(cIndex + 1);

}

else {

tokens[tokenIndex] = input.substring(cIndex + 1, index);

}

cIndex = index;

tokenIndex++;

} while (cIndex >= 0);

return tokens;

}

}