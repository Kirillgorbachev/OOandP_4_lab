package org.example;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        AirConditioner ac = new AirConditioner();
        Light light = new Light();

        RemoteControl remote = new RemoteControl();

        // Добавляем команды для управления устройствами
        remote.addCommand(new TvCommand(tv)); // Включить телевизор
        remote.addCommand(new AirConditionerCommand(ac)); // Выключить кондиционер
        remote.addCommand(new LightCommand(light)); // Выключить светильник

        // Выполняем все команды (включаем телевизор и выключаем кондиционер и светильник)
        remote.executeCommands();

        // При необходимости можно отменить последние выполненные команды
        System.out.println("-------------------------------");
        remote.undoCommands();
    }
}
