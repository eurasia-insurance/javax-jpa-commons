package tech.lapsa.javax.jpa.converters;

import java.util.Currency;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class CurrencyAttributeConverter implements AttributeConverter<Currency, String> {

    @Override
    public String convertToDatabaseColumn(final Currency currency) {
	return currency == null ? null : currency.getCurrencyCode();
    }

    @Override
    public Currency convertToEntityAttribute(final String string) {
	return string == null ? null : Currency.getInstance(string);
    }

}
