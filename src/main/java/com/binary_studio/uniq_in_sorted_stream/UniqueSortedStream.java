package com.binary_studio.uniq_in_sorted_stream;

import java.util.Comparator;
import java.util.stream.Stream;

public final class UniqueSortedStream {

	private UniqueSortedStream() {
	}
	public static <T> Stream<Row<T>> uniqueRowsSortedByPK(Stream<Row<T>> stream) {
		// TODO: Ваш код тут. Помните про терминальные операции! :)
			return stream.distinct()
					.filter(Distinct.distinctByValue(p -> p.getPrimaryId()))
					.sorted(Comparator.comparing(Row::getPrimaryId));
	}
}