package tech.lapsa.javax.jpa.converters;

import java.util.Currency;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class CurrencyAttributeConverter implements AttributeConverter<Currency, String> {

    @Override
    public String convertToDatabaseColumn(Currency currency) {
	return currency == null ? null : currency.getCurrencyCode();
    }

    @Override
    public Currency convertToEntityAttribute(String string) {
	return string == null ? null : Currency.getInstance(string);
    }

}
