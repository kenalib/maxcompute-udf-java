package com.example;

import com.aliyun.odps.udf.UDF;

/**
 * quick start example
 * https://www.alibabacloud.com/help/doc-detail/27811.htm
 */
public class Lower extends UDF {
    public String evaluate(String s) {
        System.out.println("LOWER UDF INPUT: " + s);

        if (s == null) { return null; }
        return s.toLowerCase();
    }
}
