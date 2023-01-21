package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

public class LocalizationServiceImplTests {
    @Test
    public void localeTest(){
        String expected = "Welcome";
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        String result = localizationService.locale(Country.BRAZIL);

        Assertions.assertEquals(expected, result);
    }
}