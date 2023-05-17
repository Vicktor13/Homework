package com.vick.HW1.question2;

abstract class Car {
/*В целом лучше переписать код, но постарался по макимум расписать недостатки*/

    /*Отсутствует класс Engine
    * Варианты решения:
    *  1. сделать переменную engine формата String
    *  2. - создать интерфейс Engine с методом выбрать топливо, масло и т.д.,
    *     - создать классы двигателей, например: GasEngine, DieselEngine, и т.д.
    *     - имлиментим Engine к двигателям, далее добавляем в конструктор автомобиля Engine */
    public String engine;
    private String color;
    private String name;
    abstract void open();

    /*Так как методы не абстрактные, их переопределение вызывается по желанию, и смысл нахождения их в абстрактном классе не понятен*/
    protected void start() {
        System.out.println("Car starting");
    }

    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}