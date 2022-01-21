package com.zakharov;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mom {
    private String name;
    private int age;

    public String say(){
        return "My sons name is:";
    }
}
