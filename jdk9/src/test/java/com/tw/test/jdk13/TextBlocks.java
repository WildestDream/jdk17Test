package com.tw.test.jdk13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextBlocks {
    @Test
    void test() {
        String sql = """
                select id, name from emp
                where age <= 30
                order by salary desc
                """;
        System.out.println(sql);
        Assertions.assertEquals(3, sql.lines().count());
    }

    @Test
    void testHtml() {
        String html = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;
        System.out.println(html);
    }
}
