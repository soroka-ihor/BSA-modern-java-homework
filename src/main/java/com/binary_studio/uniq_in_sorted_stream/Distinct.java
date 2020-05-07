package com.binary_studio.uniq_in_sorted_stream;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class Distinct {

	public static <T> Predicate<T> distinctByValue(Function<? super T, ?> keyExctractor) {
		Map<Object, Boolean> seen = new ConcurrentHashMap<>();
		return p -> seen.putIfAbsent(keyExctractor.apply(p), Boolean.TRUE) == null;
	}

}
