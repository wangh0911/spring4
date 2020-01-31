package cn.roboteco.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String brand;

    private String color;

    private int maxSpeed;

    public void introduce() {
        System.out.println("brand:"+brand+";color:"+color+";maxSpeed:"+maxSpeed);
    }
}
