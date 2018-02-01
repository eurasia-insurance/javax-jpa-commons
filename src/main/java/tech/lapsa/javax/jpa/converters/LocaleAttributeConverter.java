package tech.lapsa.javax.jpa.converters;

import java.util.Locale;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.java.commons.function.MyStrings;

@Converter(autoApply = true)
public class LocaleAttributeConverter implements AttributeConverter<Locale, String> {

    @Override
    public String convertToDatabaseColumn(final Locale locale) {
	if (MyObjects.isNull(locale))
	    return null;
	return locale.getLanguage() + "_" + locale.getCountry() + "_" + locale.getVariant();
    }

    @Override
    public Locale convertToEntityAttribute(final String string) {
	if (MyStrings.empty(string))
	    return null;
	final String[] params = string.split("_", 3);
	if (params.length < 3)
	    return null;
	return new Locale(params[0], params[1], params[2]);
    }
}
