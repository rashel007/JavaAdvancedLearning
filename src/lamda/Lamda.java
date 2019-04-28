package lamda;

public class Lamda {

    public void execute() {


        Converter converterUpperCase = (String s) -> s.toUpperCase();
        Converter converterLowerCase = (String s) -> s.toLowerCase();
        Converter converterTrim = (String s) -> s.trim();
        Converter titleCaseConverter = (String s) -> {

            StringBuilder sb = new StringBuilder();

            boolean nextTitleCase = true;

            for (char c: s.toCharArray()){

                if (Character.isSpaceChar(c)){
                    nextTitleCase = true;
                }else if (nextTitleCase){
                    c = Character.toTitleCase(c);
                    nextTitleCase = false;
                }

                sb.append(c);

            }

            return sb.toString();

        };

        String helloWorld = converterUpperCase.apply("Hello World");
        String titleCase = titleCaseConverter.apply("s. m. estique ahmed rashel");

        System.out.println(helloWorld);
        System.out.println(titleCase);

    }

}
