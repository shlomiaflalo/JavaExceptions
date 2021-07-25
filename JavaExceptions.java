
import java.util.Optional;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

        public class JavaExceptions {

            public static void main(String[]args) throws Throwable{
                //Different way of Exceptions in java

                //The try catch - Few versions
                try{
                 FileInputStream File_File=
                 new FileInputStream("example.txt");

                }catch(FileNotFoundException e){
                    e.printStackTrace();
                }

                //

                try {
                String try_To_Catch = null;
                System.out.println(try_To_Catch.length());
                System.out.println(try_To_Catch
                + " - Value is not null");
                } catch (NullPointerException e) { //or just Exception
                //if We do not know what the Exception is
                System.out.println("Value is null : " +
                "and the Exception for it is : " + e);
                }

                //The try catch & Finally
                //ArithmeticException (Math Exception)
                try{
                var Testing=10/0;
                System.out.println(Testing);

                }catch(ArithmeticException e){
                System.out.println("We handling the exception");

                }finally {
                System.out.println("Cleaning up");
                }

                //Expansive way for the Ram using this try catch
                try{
                var a=500/0;
                System.out.println(a);
                }catch(ArithmeticException e){
                    System.out.println("ArithmeticException :) "+e);

                }catch (NullPointerException e){
                    System.out.println("NullPointerException :) "+e);

                }catch(NumberFormatException e){
                    System.out.println("NumberFormatException :) "+e);

                }finally{
                    System.out.println("Cleaning the algorithm");
                }

                //Much better - the following with the try catch &
                //finally
                try{
                    var re=10/0;
                    System.out.println(re);
                }catch(ArithmeticException
                       | NullPointerException |
                        NumberFormatException e){

                    System.out.println("Catch the Exception in a better way");

                }finally{
                    System.out.println("Cleaning up");
                }


                //


                try{
                    var r=10/0;
                    System.out.println("There is no exception with : "+r);
                }catch(ArithmeticException e){
                    System.out.println("EXCEPTION");
                }finally{
                    System.out.println("Cleaning up...");
                }

                try{
                    var r1=5/0;
                    System.out.println(r1);
                }catch(ArithmeticException e){

                    System.out.println("Exception : " +e);

                }catch(NullPointerException e){

                    System.out.println("Exception : " +e);

                }catch (NumberFormatException e){
                    System.out.println("Exception : " +e);

                }finally{
                    System.out.println("Finally");
                }

                try{
                    var val_ue=10/0;
                    System.out.println(val_ue);
                }catch(ArithmeticException | NullPointerException |
                        NumberFormatException e){
                    System.out.println("better way to catch few Exception at once");
                }finally{
                    System.out.println("Finally added");
                }


                    //The if else
                    String nam_e=null;

                    if(nam_e!=null){
                    System.out.println(nam_e);
                    }else{
                    throw new Exception("exception ");
                    }

                    if(nam_e!=null){
                    System.out.println(nam_e+" is not null");
                    }else{
                    throw new Throwable("It is an exception");
                    }

                if(nam_e!=null){
                System.out.println(nam_e+" is not null");
                }else{
                System.out.println(nam_e+ " is null");
                }

                if(nam_e!=null){
                    System.out.println(nam_e+" is not null");
                }else{
                throw new MyOwnException("HI My Own Exception");
                }


                String name = null;
                if (name != null) {
                    System.out.println(name + " is not null");
                } else {
                    System.out.println(name + " is null");
                }

                //The optional class
                String myName = "Shlomi";
                String Value = Optional.of(myName) //Exception if null
                        .orElse("Value is null");

                String Value1 = Optional.ofNullable(myName)//No
                        // Exception error if null - "Value is null"
                        .orElse("Value is null");

                String value2 = Optional.ofNullable(myName)
                        .orElseGet(() -> {
                            return "My name is shlomi";
                        });

                String value3 = Optional.ofNullable(myName)
                        .map(String::toUpperCase)
                        .orElseGet(() -> {
                            return "My name is shlomi";
                        });

                //Optional.of
                Optional.of(myName);// throws an exception
                //if value is null & Insert value into the Optional
                //If it's not null value

                //Optional.ofNullable
                Optional.ofNullable(myName);//Do not throws an exception
                //if value is null & Insert value into the Optional


                //Creating our own Exception
                System.out.println(Division(0, 10));

            }

                //Our own Exceptions
                static double Division(double a, double b)  { //If the class
                //extends Exception so use the  - throws Throwable / Exception here

                if (a == 0) {

                    //throw new MyOwnException("Check your internet connection - 404 :) ");

                    try{
                        System.out.println(a/b);
                    }catch(MyOwnException e){
                        System.out.println("Using our own Exception");
                        e.printStackTrace();
                    }
                }
                return a / b;
            }

            static class MyOwnException extends RuntimeException {
                public MyOwnException(String message) {
                    super(message);
                }
            }

            //

            static double PerformDivision(double a,double b) throws Exception {
                if (a == 0) {
                    throw new Friendly_Exception_For_No_Internet("Pardon :) No internet");
                }
                return a/b;
            }

            static class Friendly_Exception_For_No_Internet extends Exception{
                public Friendly_Exception_For_No_Internet(String msg){
                    super(msg);
                }
            }


        }