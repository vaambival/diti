package ex_02;

import org.junit.jupiter.api.Test;

import static ex_02.ExceptionHelper.getCallerClassAndMethodName;
import static org.assertj.core.api.Assertions.assertThat;

public class ExceptionHelperTest {

    @Test
    void simpleTest() {
        foo();
        bar();
        baz();
        new Inner().inner();

        assertThat(getCallerClassAndMethodName()).isEqualTo("sun.reflect.NativeMethodAccessorImpl#invoke0");
    }

    private void baz() {
        barBaz();
    }

    private void barBaz() {
        fooBarBaz();
    }

    private void fooBarBaz() {
        assertThat(getCallerClassAndMethodName()).isEqualTo("ex_02.ExceptionHelperTest#barBaz");
    }

    private void bar() {
        fooBar();
    }

    private void fooBar() {
        assertThat(getCallerClassAndMethodName()).isEqualTo("ex_02.ExceptionHelperTest#bar");
    }

    private void foo() {
        assertThat(getCallerClassAndMethodName()).isEqualTo("ex_02.ExceptionHelperTest#simpleTest");
    }

    private class Inner {
        public void inner() {
            assertThat(getCallerClassAndMethodName()).isEqualTo("ex_02.ExceptionHelperTest#simpleTest");
            callInner();
        }

        private void callInner() {
            assertThat(getCallerClassAndMethodName()).isEqualTo("ex_02.ExceptionHelperTest$Inner#inner");
        }
    }
}
