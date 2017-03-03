package cn.devit.demo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumberFormatsTest {

    @Test
    public void case_kb() throws Exception {
        String read = new NumberFormats().readableBytes(2048);
        assertThat(read, is("2 KB"));
    }
}
