package mate.academy.springboot.swagger.util;

import org.springframework.data.domain.Sort;

public interface SortParser {
    Sort sortBy(String sortBy);
}
