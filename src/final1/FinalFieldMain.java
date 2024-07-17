package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("constructor init");

        ConstructorInit constructorInit1 = new ConstructorInit(10);
        ConstructorInit constructorInit2 = new ConstructorInit(20);
        System.out.println(constructorInit1.value);
        System.out.println(constructorInit2.value);

        System.out.println("field init");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        System.out.println("const");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
