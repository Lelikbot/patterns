package kolokolov.creational.singletone.unlazy.withenum;

import java.util.List;

/**
 * Реализация паттерна Singleton на основе класса enum.
 * <p>
 * Плюсы:
 * + Потокобезопасно
 * + Просто
 * + Можно использовать в SWITCH стейтменте
 * + Можно использовать в коллекциях для ENUM (например {@link java.util.EnumSet})
 * Минусы:
 * - Создает объект, даже когда он не требуется (отсутствует линивая(отложенная) инициализация)
 * - Не очень очевиден для непосвещенных)
 */
public enum SingletonObject {
    INSTANCE;

    /**
     * Кастомные поля объекта
     */
    private Integer customField;
    private List<String> customCollection;

    public Integer getCustomField() {
        return customField;
    }

    public void setCustomField(Integer customField) {
        this.customField = customField;
    }

    public List<String> getCustomCollection() {
        return customCollection;
    }

    public void setCustomCollection(List<String> customCollection) {
        this.customCollection = customCollection;
    }
}
