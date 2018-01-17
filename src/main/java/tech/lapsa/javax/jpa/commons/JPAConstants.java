package tech.lapsa.javax.jpa.commons;

import java.util.Map;

import javax.persistence.CacheRetrieveMode;
import javax.persistence.CacheStoreMode;

import tech.lapsa.java.commons.function.MyMaps;

public final class JPAConstants {

    private JPAConstants() {
    }

    public static final String HINT_JAVAX_PERSISTENCE_CACHE_STORE_MODE = "javax.persistence.cache.storeMode";
    public static final String HINT_JAVAX_PERSISTENCE_CACHE_RETREIVE_MODE = "javax.persistence.cache.retreiveMode";

    public static final Map<String, Object> NO_CACHE_PROPERTIES = MyMaps.of( //
	    HINT_JAVAX_PERSISTENCE_CACHE_RETREIVE_MODE, CacheRetrieveMode.BYPASS, //
	    HINT_JAVAX_PERSISTENCE_CACHE_STORE_MODE, CacheStoreMode.REFRESH);

}
