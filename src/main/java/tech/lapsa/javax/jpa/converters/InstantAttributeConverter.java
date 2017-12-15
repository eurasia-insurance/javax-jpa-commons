package tech.lapsa.javax.jpa.converters;

import java.sql.Timestamp;
import java.time.Instant;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class InstantAttributeConverter implements AttributeConverter<Instant, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(final Instant instant) {
	return instant == null ? null : Timestamp.from(instant);
    }

    @Override
    public Instant convertToEntityAttribute(final Timestamp sqlTimestamp) {
	return sqlTimestamp == null ? null : sqlTimestamp.toInstant();
    }

}
