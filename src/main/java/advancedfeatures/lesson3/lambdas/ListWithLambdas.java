package advancedfeatures.lesson3.lambdas;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.List;

public class ListWithLambdas {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Peter");
        list.add("Stephan");
        list.add("Mantis");

        for (String str : list) {
            System.out.println(str);

        }

        System.out.println("==============");
        list.forEach(str -> System.out.println(str));  // tas pats loop per lambdas
    }
}
