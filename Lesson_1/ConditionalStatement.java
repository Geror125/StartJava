public class ConditionalStatement{
    public static void main(String[] args){

        byte age = 23;
        if ( age > 20) {
            System.out.println( "I'm over 20 years old." );
        }

        boolean maleGender = true;
        if (maleGender) {
            System.out.println( "I'm a man." );
        }

        if (!maleGender) {
            System.out.println( "I am not a man." );
        }

        short height = 184;
        if (height < 1.80) {
            System.out.println( "I'm under 180." );
        } else {
            System.out.println( "I'm over 180." );
        }

        char firstNameLetter = 'D';
        if (firstNameLetter == 'M') {
            System.out.println( "My name begins with the letter M" );
        } else if (firstNameLetter == 'I') {
            System.out.println( "My name begins with the letter I" );
        } else {
            System.out.println( "My name does not begin with the letters M and I");
        }
    }
}