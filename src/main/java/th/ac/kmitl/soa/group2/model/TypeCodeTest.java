package th.ac.kmitl.soa.group2.model;

public class TypeCodeTest {
    public static void main(String[] args){
        for(TypeCode tc : TypeCode.values()){
            System.out.println(tc.getTypeCode()+ " " +tc.getDescription());
        }
    }
}
