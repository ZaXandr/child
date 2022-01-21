package com.zakharov;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Son {
    private String name;
    public int age;

    public String say(){
        return "My moms name is:";
    }
}
