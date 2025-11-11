package Java100.Strings;

public class removeBracketsFromAlgebraicExpression {
    public static void main(String[] args) {
        String s = "(a+b)=c";
        String result = s.replaceAll("[(){}]","");
        System.out.println("Expression without brackets : "+result);
    }
}
