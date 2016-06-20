
package com.stackbuilders.javafunctional.functionacomposition.multiple;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import com.stackbuilders.javafunctional.functionacomposition.Article;
import java.util.Optional;
import java.util.function.Function;

/**
 *
 * @author eliecerhdz
 */
public class ArticleFilters
{
    //Base functions

    public static final BiFunction<String, List<Article>, List<Article>> byAuthor
            = (name, articles) -> articles.stream()
            .filter(a -> a.getAuthor().equals(name))
            .collect(Collectors.toList());

    public static final BiFunction<String, List<Article>, List<Article>> byTag
            = (tag, articles) -> articles.stream()
            .filter(a -> a.getTags().contains(tag))
            .collect(Collectors.toList());

    public static final Function<List<Article>, List<Article>> sortByDate
            = articles -> articles.stream()
            .sorted((x, y) -> y.getCreated().compareTo(x.getCreated()))
            .collect(Collectors.toList());

    public static final Function<List<Article>, Optional<Article>> first
            = a -> a.stream().findFirst();

    /**
     * first . sortByDate
     */
    public static final Function<List<Article>, Optional<Article>> newest
            = first.compose(sortByDate);

    /**
     * byAuthor . first . sortByDate
     */
    public static final BiFunction<String, List<Article>, Optional<Article>> newestByAuthor
            = byAuthor.andThen(newest);
    
    /**
     * first . sortByDate . byTag
     */
    public static final BiFunction<String, List<Article>, Optional<Article>> newestByTag =  
    byTag.andThen(newest);
}
