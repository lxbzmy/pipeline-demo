/*
 * Copyright 2017-2019 lxbzmy@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.devit.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

    static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        logger.info("Hello JAVA.");
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public void foo(Integer a, Integer b) {
        if (a == null && a == null) {
            System.out.println(a.toString());
        }
    }
    
    public void bar(Integer a, Integer b) {
        if (a == null && a == null) {
            System.out.println(a.toString());
        }
    }
    
    public void aaa(Integer a, Integer b) {
        if (a == null && a == null) {
            System.out.println(a.toString());
        }
    }

}
