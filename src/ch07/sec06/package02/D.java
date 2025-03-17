package ch07.sec06.package02;

import ch07.sec06.package01.A;

public class D extends A {

    public D() {
        super();
    }

    /** 상속을 통해서만 가능 */
    public void method1() {
        this.field = "value";
        this.method();
    }

    /** 직접 객체 생성 불가 */
    public void method2() {
        // A a = new A();
        // a.field = "value";
        // a.method;
    }
}
