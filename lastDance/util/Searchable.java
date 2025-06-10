package util;

import java.util.List;

public interface Searchable<T>{
	List<T> searchByType(String type);
}
