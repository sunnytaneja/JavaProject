package com.corejavaproject.generics;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Student <T>{
    private T type;
}
